package Factura;

import Conexion.Conexion;
import Tickets.modelotikets;
import Tickets.tiket_dao;
import Ventas.VentasModel;
import Ventas.Ventas_Controler;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

public class FacturaTickets extends JInternalFrame {

    private JTable tblTickets;
    private DefaultTableModel modeloTickets;
    private JTextArea txtDetalleFactura;
    private JLabel lblHoraFecha, lblCompraId;
    private JButton btnGenerarFactura, btnResetear;
    private JComboBox<ClienteItem> cmbClientes;
    private JComboBox<UsuarioItem> cmbUsuarios;  // Nuevo combo para usuarios
    private JPanel panelTotales;

    private int compraId;
    private int clienteSeleccionado = -1;
    private int usuarioSeleccionado = -1;
    private final tiket_dao ticketDao = new tiket_dao();
    private final Ventas_Controler ventasController = new Ventas_Controler();

    public FacturaTickets() {
        super("Factura de Tickets", true, false, false, false);
        setSize(1100, 750);
        quitarBarraTitulo();
        generarNuevoCompraId();
        initComponents();
        cargarTicketsDisponibles();
        actualizarHoraFecha();
    }

    private void quitarBarraTitulo() {
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        this.setBorder(null);
    }

    private void generarNuevoCompraId() {
        this.compraId = new Random().nextInt(90000) + 10000;
        if (lblCompraId != null) lblCompraId.setText("Factura ID: " + compraId);
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        // Panel izquierdo: clientes y tabla de tickets
        JPanel panelIzq = new JPanel(new BorderLayout());

        JPanel panelSuperior = new JPanel(new GridLayout(2, 1, 5, 5));
        JPanel panelClientes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelClientes.add(new JLabel("Cliente:"));
        cmbClientes = new JComboBox<>();
        cargarClientes();
        cmbClientes.addActionListener(e -> {
            ClienteItem selected = (ClienteItem) cmbClientes.getSelectedItem();
            clienteSeleccionado = (selected != null) ? selected.getId() : -1;
        });
        panelClientes.add(cmbClientes);

        JPanel panelUsuarios = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelUsuarios.add(new JLabel("Vendedor:"));
        cmbUsuarios = new JComboBox<>();
        cargarUsuarios();
        cmbUsuarios.addActionListener(e -> {
            UsuarioItem selected = (UsuarioItem) cmbUsuarios.getSelectedItem();
            usuarioSeleccionado = (selected != null) ? selected.getId() : -1;
        });
        panelUsuarios.add(cmbUsuarios);

        panelSuperior.add(panelClientes);
        panelSuperior.add(panelUsuarios);
        panelIzq.add(panelSuperior, BorderLayout.NORTH);

        // Tabla de tickets disponibles
        modeloTickets = new DefaultTableModel(new Object[]{"Seleccionar", "ID Ticket", "Partido", "Asiento", "Sección", "Precio (Q)"}, 0) {
            @Override
            public Class<?> getColumnClass(int col) {
                return (col == 0) ? Boolean.class : (col == 1) ? Integer.class : String.class;
            }
            @Override
            public boolean isCellEditable(int row, int col) {
                return col == 0; // Solo la columna de selección es editable
            }
        };
        tblTickets = new JTable(modeloTickets);
        tblTickets.getColumnModel().getColumn(1).setMaxWidth(70);
        tblTickets.getColumnModel().getColumn(4).setMaxWidth(100);
        JScrollPane scrollTickets = new JScrollPane(tblTickets);
        panelIzq.add(scrollTickets, BorderLayout.CENTER);

        // Botones
        JPanel panelBotones = new JPanel();
        btnGenerarFactura = new JButton("Generar Factura y Vender");
        btnResetear = new JButton("Limpiar Selección");
        panelBotones.add(btnGenerarFactura);
        panelBotones.add(btnResetear);
        panelIzq.add(panelBotones, BorderLayout.SOUTH);

        // Panel derecho: factura
        JPanel panelDer = new JPanel(new BorderLayout());
        JPanel panelEncabezado = new JPanel(new GridLayout(3, 1));
        panelEncabezado.add(new JLabel("-------------------- TICKET SHOP --------------------", SwingConstants.CENTER));
        lblHoraFecha = new JLabel();
        lblCompraId = new JLabel("Factura ID: " + compraId);
        panelEncabezado.add(lblHoraFecha);
        panelEncabezado.add(lblCompraId);
        panelDer.add(panelEncabezado, BorderLayout.NORTH);

        txtDetalleFactura = new JTextArea();
        txtDetalleFactura.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        txtDetalleFactura.setEditable(false);
        panelDer.add(new JScrollPane(txtDetalleFactura), BorderLayout.CENTER);

        panelTotales = new JPanel(new GridLayout(5, 1));
        actualizarPanelTotales(0, 0, 0);
        panelDer.add(panelTotales, BorderLayout.SOUTH);

        add(panelIzq, BorderLayout.WEST);
        add(panelDer, BorderLayout.CENTER);

        // Acciones
        btnGenerarFactura.addActionListener(this::venderTicketsYFacturar);
        btnResetear.addActionListener(e -> limpiarSeleccion());
    }

    private void cargarClientes() {
        Conexion conexion = new Conexion();
        String sql = "SELECT id, nombre FROM cliente ORDER BY nombre";
        try (Connection con = conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            cmbClientes.removeAllItems();
            while (rs.next()) {
                cmbClientes.addItem(new ClienteItem(rs.getInt("id"), rs.getString("nombre")));
            }
            if (cmbClientes.getItemCount() > 0) {
                cmbClientes.setSelectedIndex(0);
                clienteSeleccionado = ((ClienteItem) cmbClientes.getSelectedItem()).getId();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error cargando clientes: " + ex.getMessage());
        }
    }

    private void cargarUsuarios() {
        Conexion conexion = new Conexion();
        String sql = "SELECT id, username FROM usuario ORDER BY username";
        try (Connection con = conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            cmbUsuarios.removeAllItems();
            while (rs.next()) {
                cmbUsuarios.addItem(new UsuarioItem(rs.getInt("id"), rs.getString("username")));
            }
            if (cmbUsuarios.getItemCount() > 0) {
                cmbUsuarios.setSelectedIndex(0);
                usuarioSeleccionado = ((UsuarioItem) cmbUsuarios.getSelectedItem()).getId();
            } else {
                // Si no hay usuarios, mostrar un mensaje y deshabilitar la venta
                JOptionPane.showMessageDialog(this, "No hay usuarios registrados. No se pueden realizar ventas.");
                btnGenerarFactura.setEnabled(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error cargando usuarios: " + ex.getMessage());
        }
    }

    private void cargarTicketsDisponibles() {
        modeloTickets.setRowCount(0);
        List<modelotikets> tickets = ticketDao.Listatodo();
        for (modelotikets t : tickets) {
            if ("DISPONIBLE".equals(t.getEstado())) {
                String nombrePartido = obtenerNombrePartido(t.getPartidoId());
                modeloTickets.addRow(new Object[]{
                    false,
                    t.getId(),
                    nombrePartido,
                    t.getNumero_asiento(),
                    t.getSeccion(),
                    t.getPrecion()
                });
            }
        }
    }

    // CORREGIDO: usa equipo_local y equipo_visitante
    private String obtenerNombrePartido(int partidoId) {
        String sql = "SELECT equipo_local, equipo_visitante FROM partido WHERE id = ?";
        try (Connection con = new Conexion().getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, partidoId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String local = rs.getString("equipo_local");
                String visitante = rs.getString("equipo_visitante");
                return local + " vs " + visitante;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Partido #" + partidoId;
    }

    private void limpiarSeleccion() {
        for (int i = 0; i < modeloTickets.getRowCount(); i++) {
            modeloTickets.setValueAt(false, i, 0);
        }
        txtDetalleFactura.setText("");
        actualizarPanelTotales(0, 0, 0);
    }

    private void actualizarPanelTotales(double subtotal, double iva, double total) {
        panelTotales.removeAll();
        panelTotales.add(new JLabel("---------------------------------------------------", SwingConstants.CENTER));
        panelTotales.add(new JLabel(String.format("Subtotal (sin IVA): Q%.2f", subtotal)));
        panelTotales.add(new JLabel(String.format("IVA (12%%): Q%.2f", iva)));
        panelTotales.add(new JLabel(String.format("TOTAL a pagar: Q%.2f", total)));
        panelTotales.add(new JLabel("------------ Gracias por su preferencia ------------", SwingConstants.CENTER));
        panelTotales.revalidate();
        panelTotales.repaint();
    }

    private void venderTicketsYFacturar(ActionEvent evt) {
        // Validar cliente seleccionado
        if (clienteSeleccionado == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente");
            return;
        }
        // Validar usuario seleccionado
        if (usuarioSeleccionado == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un vendedor (usuario)");
            return;
        }

        // Obtener tickets seleccionados
        List<Integer> ticketsSeleccionados = new ArrayList<>();
        double subtotal = 0;
        for (int i = 0; i < modeloTickets.getRowCount(); i++) {
            Boolean seleccionado = (Boolean) modeloTickets.getValueAt(i, 0);
            if (seleccionado != null && seleccionado) {
                int idTicket = (int) modeloTickets.getValueAt(i, 1);
                double precio = (double) modeloTickets.getValueAt(i, 5);
                ticketsSeleccionados.add(idTicket);
                subtotal += precio;
            }
        }

        if (ticketsSeleccionados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione al menos un ticket");
            return;
        }

        // Validar disponibilidad y capacidad
        try {
            for (int id : ticketsSeleccionados) {
                modelotikets t = ticketDao.buscarId(id);
                if (t == null || !"DISPONIBLE".equals(t.getEstado())) {
                    throw new Exception("El ticket ID " + id + " ya no está disponible.");
                }
                if (!ticketDao.hayCapacidadDisponible(t.getPartidoId(), 1)) {
                    throw new Exception("No hay cupo para el partido del ticket " + id);
                }
            }

            double iva = subtotal * 0.12;
            double total = subtotal + iva;

            java.sql.Date fechaActual = new java.sql.Date(System.currentTimeMillis());
            // Usar el usuario seleccionado del combo
            int idVenta = ventasController.procesarVenta(fechaActual, clienteSeleccionado, usuarioSeleccionado, ticketsSeleccionados, subtotal);

            if (idVenta > 0) {
                StringBuilder detalle = new StringBuilder();
                detalle.append("FACTURA N° ").append(compraId).append("\n");
                detalle.append("Cliente: ").append(((ClienteItem) cmbClientes.getSelectedItem()).getNombre()).append("\n");
                detalle.append("Vendedor: ").append(((UsuarioItem) cmbUsuarios.getSelectedItem()).getNombre()).append("\n");
                detalle.append("---------------------------------------------------\n");
                detalle.append(String.format("%-4s %-20s %-8s %-10s\n", "ID", "Asiento", "Sección", "Precio"));
                for (int id : ticketsSeleccionados) {
                    modelotikets t = ticketDao.buscarId(id);
                    detalle.append(String.format("%-4d %-20s %-8s Q%-10.2f\n",
                            t.getId(), t.getNumero_asiento(), t.getSeccion(), t.getPrecion()));
                }
                detalle.append("---------------------------------------------------\n");
                detalle.append(String.format("SUBTOTAL: Q%.2f\n", subtotal));
                detalle.append(String.format("IVA (12%%): Q%.2f\n", iva));
                detalle.append(String.format("TOTAL: Q%.2f\n", total));
                detalle.append("---------------------------------------------------\n");
                detalle.append("¡Venta exitosa! Los tickets han sido marcados como VENDIDOS.\n");
                txtDetalleFactura.setText(detalle.toString());
                actualizarPanelTotales(subtotal, iva, total);

                int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea guardar el recibo en PDF?", "Factura", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    guardarPDF(subtotal, iva, total, ticketsSeleccionados);
                }

                cargarTicketsDisponibles();
                limpiarSeleccion();
                generarNuevoCompraId();
                lblCompraId.setText("Factura ID: " + compraId);
            } else {
                JOptionPane.showMessageDialog(this, "Error al procesar la venta.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    private void guardarPDF(double subtotal, double iva, double total, List<Integer> ticketsIds) {
        PDDocument doc = new PDDocument();
        try {
            PDPage page = new PDPage();
            doc.addPage(page);
            File fontFile = new File("src/Otros_recursos/Roboto-Medium.ttf");
            PDType0Font font = PDType0Font.load(doc, fontFile);

            PDPageContentStream content = new PDPageContentStream(doc, page);
            content.beginText();
            content.setFont(font, 11);
            content.newLineAtOffset(50, 750);

            content.showText("-------------------- TICKET SHOP --------------------");
            content.newLineAtOffset(0, -20);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            content.showText("Fecha: " + sdf.format(new Date()));
            content.newLineAtOffset(0, -20);
            content.showText("Factura ID: " + compraId);
            content.newLineAtOffset(0, -20);
            ClienteItem cli = (ClienteItem) cmbClientes.getSelectedItem();
            content.showText("Cliente: " + (cli != null ? cli.getNombre() : "N/A"));
            content.newLineAtOffset(0, -20);
            UsuarioItem usu = (UsuarioItem) cmbUsuarios.getSelectedItem();
            content.showText("Vendedor: " + (usu != null ? usu.getNombre() : "N/A"));
            content.newLineAtOffset(0, -20);
            content.showText("---------------------------------------------------");
            content.newLineAtOffset(0, -20);
            content.showText(String.format("%-4s %-20s %-8s %-10s", "ID", "Asiento", "Sección", "Precio"));
            content.newLineAtOffset(0, -20);

            for (int id : ticketsIds) {
                modelotikets t = ticketDao.buscarId(id);
                content.showText(String.format("%-4d %-20s %-8s Q%-10.2f",
                        t.getId(), t.getNumero_asiento(), t.getSeccion(), t.getPrecion()));
                content.newLineAtOffset(0, -20);
            }

            content.showText("---------------------------------------------------");
            content.newLineAtOffset(0, -20);
            content.showText(String.format("SUBTOTAL: Q%.2f", subtotal));
            content.newLineAtOffset(0, -20);
            content.showText(String.format("IVA (12%%): Q%.2f", iva));
            content.newLineAtOffset(0, -20);
            content.showText(String.format("TOTAL: Q%.2f", total));
            content.newLineAtOffset(0, -20);
            content.showText("------------ Gracias por su preferencia ------------");
            content.endText();
            content.close();

            File folder = new File("src/Recibos");
            if (!folder.exists()) folder.mkdirs();
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File pdfFile = new File(folder, "factura_" + timestamp + ".pdf");
            doc.save(pdfFile);
            JOptionPane.showMessageDialog(this, "PDF guardado en:\n" + pdfFile.getAbsolutePath());
            Desktop.getDesktop().open(pdfFile);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error guardando PDF: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try { doc.close(); } catch (IOException e) { e.printStackTrace(); }
        }
    }

    private void actualizarHoraFecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        lblHoraFecha.setText("Fecha y hora: " + sdf.format(new Date()));
        Timer timer = new Timer(1000, e -> {
            lblHoraFecha.setText("Fecha y hora: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
        });
        timer.start();
    }

    // Clases internas
    private static class ClienteItem {
        private final int id;
        private final String nombre;
        ClienteItem(int id, String nombre) { this.id = id; this.nombre = nombre; }
        int getId() { return id; }
        String getNombre() { return nombre; }
        @Override public String toString() { return nombre; }
    }

    private static class UsuarioItem {
        private final int id;
        private final String nombre;
        UsuarioItem(int id, String nombre) { this.id = id; this.nombre = nombre; }
        int getId() { return id; }
        String getNombre() { return nombre; }
        @Override public String toString() { return nombre; }
    }
}