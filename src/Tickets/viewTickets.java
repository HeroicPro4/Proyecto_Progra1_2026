/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tickets;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tonit
 */
public class viewTickets extends javax.swing.JInternalFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(viewTickets.class.getName());

    private final Tickets_Controler contro = new Tickets_Controler();
    private final DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"ID", "ID Cliente", "ID Partido", "Asiento", "Precio", "Estado"}, 0);

    public viewTickets() {
        initComponents();
        TablaTickets.setModel(modeloTabla);
        CargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtIdPartido = new javax.swing.JTextField();
        txtAsiento = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        bntGuardar = new javax.swing.JButton();
        bntActualizar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        bntConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTickets = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de Tickets");

        jLabel1.setText("ID Cliente");

        jLabel2.setText("ID Partido");

        jLabel3.setText("Asiento");

        jLabel4.setText("Precio");

        jLabel5.setText("Estado");

        bntGuardar.setText("Guardar");
        bntGuardar.addActionListener(this::bntGuardarActionPerformed);

        bntActualizar.setText("Actualizar");
        bntActualizar.addActionListener(this::bntActualizarActionPerformed);

        bntEliminar.setText("Eliminar");
        bntEliminar.addActionListener(this::bntEliminarActionPerformed);

        bntConsultar.setText("Consultar");
        bntConsultar.addActionListener(this::bntConsultarActionPerformed);

        TablaTickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID Cliente", "ID Partido", "Asiento", "Precio", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaTickets);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtIdPartido)
                            .addComponent(txtAsiento)
                            .addComponent(txtPrecio)
                            .addComponent(txtEstado))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntGuardar)
                            .addComponent(bntActualizar))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntEliminar)
                            .addComponent(bntConsultar))))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntGuardar)
                    .addComponent(bntEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntActualizar)
                    .addComponent(bntConsultar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarTabla() {
        modeloTabla.setRowCount(0);
        for (TicketsModel tk : contro.LIstaTodos()) {
            modeloTabla.addRow(new Object[]{tk.getId(), tk.getIdPartido(), tk.getAsiento(), tk.getPrecio(), tk.getEstado()});
        }
    }

    private void bntGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarActionPerformed
        try {
          //  int idCliente = Integer.parseInt(txtIdCliente.getText());
            int idPartido = Integer.parseInt(txtIdPartido.getText());
            String asiento = txtAsiento.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            String estado = txtEstado.getText();

            contro.GuardarTicket(idPartido, asiento, precio, estado);
            CargarTabla();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID Cliente, ID Partido y Precio deben ser numeros validos.");
        }
    }//GEN-LAST:event_bntGuardarActionPerformed

    private void bntActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntActualizarActionPerformed
        String codigo = JOptionPane.showInputDialog("Ingresar codigo a actualizar");
        try {
            int id = Integer.parseInt(codigo);
           // int idCliente = Integer.parseInt(txtIdCliente.getText());
            int idPartido = Integer.parseInt(txtIdPartido.getText());
            String asiento = txtAsiento.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            String estado = txtEstado.getText();

            contro.ModificarTicket(id, idPartido, asiento, precio, estado);
            CargarTabla();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valores numericos invalidos.");
        }
    }//GEN-LAST:event_bntActualizarActionPerformed

    private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed
        String codigo = JOptionPane.showInputDialog("Ingresar codigo a Eliminar");
        contro.EliminarTicket(Integer.parseInt(codigo));
        CargarTabla();
    }//GEN-LAST:event_bntEliminarActionPerformed

    private void bntConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConsultarActionPerformed
        String codigoString = JOptionPane.showInputDialog("Ingresar codigo a Consultar");
        int codigo = Integer.parseInt(codigoString);
        TicketsModel tk = contro.ConsultarTicket(codigo);

        //txtIdCliente.setText(String.valueOf(tk.getIdCliente()));
        txtIdPartido.setText(String.valueOf(tk.getIdPartido()));
        txtAsiento.setText(tk.getAsiento());
        txtPrecio.setText(String.valueOf(tk.getPrecio()));
        txtEstado.setText(tk.getEstado());

        CargarTabla();
    }//GEN-LAST:event_bntConsultarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new viewTickets().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaTickets;
    private javax.swing.JButton bntActualizar;
    private javax.swing.JButton bntConsultar;
    private javax.swing.JButton bntEliminar;
    private javax.swing.JButton bntGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAsiento;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdPartido;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
