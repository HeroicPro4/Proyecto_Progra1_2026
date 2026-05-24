/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventas;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tonit
 */
public class viewVentas extends javax.swing.JInternalFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(viewVentas.class.getName());

    private final Ventas_Controler contro = new Ventas_Controler();
    private final DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"ID", "ID Cliente", "Fecha", "Total", "Metodo Pago"}, 0);

    public viewVentas() {
        initComponents();
        TablaVentas.setModel(modeloTabla);
        CargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        bntGuardar = new javax.swing.JButton();
        bntActualizar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        bntConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        btnFactura = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de Ventas");

        jLabel1.setText("ID Cliente");

        jLabel2.setText("Fecha (yyyy-MM-ddTHH:mm)");

        jLabel3.setText("Total");

        jLabel4.setText("ID Usuario");

        bntGuardar.setText("Guardar");
        bntGuardar.addActionListener(this::bntGuardarActionPerformed);

        bntActualizar.setText("Actualizar");
        bntActualizar.addActionListener(this::bntActualizarActionPerformed);

        bntEliminar.setText("Eliminar");
        bntEliminar.addActionListener(this::bntEliminarActionPerformed);

        bntConsultar.setText("Consultar");
        bntConsultar.addActionListener(this::bntConsultarActionPerformed);

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "ID Cliente", "ID Usuario", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaVentas);

        btnFactura.setText("Factura");

        jButton1.setText("Reportes Ventas");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(txtTotal)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntGuardar)
                            .addComponent(bntActualizar)
                            .addComponent(btnFactura))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(bntEliminar)
                            .addComponent(bntConsultar))))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bntGuardar)
                        .addComponent(bntEliminar)
                        .addComponent(jLabel2))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bntActualizar)
                        .addComponent(bntConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFactura)
                    .addComponent(jButton1)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarTabla() {
        modeloTabla.setRowCount(0);
        for (VentasModel vt : contro.LIstaTodos()) {
            modeloTabla.addRow(new Object[]{vt.getId(), vt.getFecha(),  vt.getIdCliente(), vt.getIdUsuario(), vt.getTotal()});
        }
    }

    private void bntGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarActionPerformed
        try {
            java.sql.Date fecha = new java.sql.Date(txtFecha.getDate().getTime());
            int idCliente = Integer.parseInt(txtIdCliente.getText());
            int idUsuario = Integer.parseInt(txtIdUsuario.getText());
            double total = Double.parseDouble(txtTotal.getText());

            contro.GuardarVenta(fecha, idCliente, idUsuario, total);
            CargarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en los datos. Fecha debe ser: 2024-01-15T14:30");
        }
    }//GEN-LAST:event_bntGuardarActionPerformed

    private void bntActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntActualizarActionPerformed
        String codigo = JOptionPane.showInputDialog("Ingresar codigo a actualizar");
        try {
            int id = Integer.parseInt(codigo);
            java.sql.Date fecha = new java.sql.Date(txtFecha.getDate().getTime());
            int idCliente = Integer.parseInt(txtIdCliente.getText());
            int idUsuario = Integer.parseInt(txtIdUsuario.getText());
            double total = Double.parseDouble(txtTotal.getText());

            contro.ModificarVenta(id, fecha, idCliente, idUsuario, total);
            CargarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en los datos. Fecha debe ser: 2024-01-15T14:30");
        }
    }//GEN-LAST:event_bntActualizarActionPerformed

    private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed
        String codigo = JOptionPane.showInputDialog("Ingresar codigo a Eliminar");
        contro.EliminarVenta(Integer.parseInt(codigo));
        CargarTabla();
    }//GEN-LAST:event_bntEliminarActionPerformed

    private void bntConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConsultarActionPerformed
        String codigoString = JOptionPane.showInputDialog("Ingresar codigo a Consultar");
        int codigo = Integer.parseInt(codigoString);
        VentasModel vt = contro.ConsultarVenta(codigo);
        
        java.sql.Date fecha = new java.sql.Date(txtFecha.getDate().getTime());
        txtIdCliente.setText(String.valueOf(vt.getIdCliente()));
        txtIdUsuario.setText(String.valueOf(vt.getIdUsuario()));
        txtIdUsuario.setText(String.valueOf(vt.getTotal()));

        CargarTabla();
    }//GEN-LAST:event_bntConsultarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new viewVentas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVentas;
    private javax.swing.JButton bntActualizar;
    private javax.swing.JButton bntConsultar;
    private javax.swing.JButton bntEliminar;
    private javax.swing.JButton bntGuardar;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
