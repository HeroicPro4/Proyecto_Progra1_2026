/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventas;

import Factura.FacturaTickets;
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
    private final DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"ID", "Fecha", "IdCliente", "IdUsuario", "Total"}, 0);

    public viewVentas() {
        initComponents();
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        TablaVentas.setModel(modeloTabla);
        CargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bntActualizar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        bntConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtIdUsuario = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        bntGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de Ventas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bntActualizar.setBackground(new java.awt.Color(47, 78, 254));
        bntActualizar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntActualizar.setForeground(new java.awt.Color(255, 255, 255));
        bntActualizar.setText("Actualizar");
        bntActualizar.addActionListener(this::bntActualizarActionPerformed);

        bntEliminar.setBackground(new java.awt.Color(47, 78, 254));
        bntEliminar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntEliminar.setForeground(new java.awt.Color(255, 255, 255));
        bntEliminar.setText("Eliminar");
        bntEliminar.addActionListener(this::bntEliminarActionPerformed);

        bntConsultar.setBackground(new java.awt.Color(47, 78, 254));
        bntConsultar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntConsultar.setForeground(new java.awt.Color(255, 255, 255));
        bntConsultar.setText("Consultar");
        bntConsultar.addActionListener(this::bntConsultarActionPerformed);

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel1.setText("ID Cliente");

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel2.setText("Fecha (yyyy-MM-ddTHH:mm)");

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel3.setText("Total");

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel4.setText("ID Usuario");

        txtIdCliente.setBorder(null);
        txtIdCliente.addActionListener(this::txtIdClienteActionPerformed);

        txtIdUsuario.setBorder(null);

        txtTotal.setBorder(null);

        bntGuardar.setBackground(new java.awt.Color(47, 78, 254));
        bntGuardar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntGuardar.setForeground(new java.awt.Color(255, 255, 255));
        bntGuardar.setText("Guardar");
        bntGuardar.addActionListener(this::bntGuardarActionPerformed);

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaVentas);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdUsuario)
                            .addComponent(txtTotal)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bntActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(bntConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bntEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bntGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(bntGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

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
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVentas;
    private javax.swing.JButton bntActualizar;
    private javax.swing.JButton bntConsultar;
    private javax.swing.JButton bntEliminar;
    private javax.swing.JButton bntGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
