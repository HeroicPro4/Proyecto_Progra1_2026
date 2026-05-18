/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clientes;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class viewCliente extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(viewCliente.class.getName());


    
    private final ControladorCliente contro = new ControladorCliente();
    private final DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"ID", "Nombre", "Apellido", "Telefono", "Email","Direccion"}, 0);
    
    public viewCliente() {
        initComponents();
        TablaEmpleado.setModel(modeloTabla);
        CargarTabla();
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        bntGuardar = new javax.swing.JButton();
        bntActualizar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        bntConsultar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaEmpleado = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Telefono");

        jLabel4.setText("Email");

        jLabel5.setText("Direccion");

        bntGuardar.setText("Guardar");
        bntGuardar.addActionListener(this::bntGuardarActionPerformed);

        bntActualizar.setText("Actualizar");
        bntActualizar.addActionListener(this::bntActualizarActionPerformed);

        bntEliminar.setText("Eliminar");
        bntEliminar.addActionListener(this::bntEliminarActionPerformed);

        bntConsultar.setText("Consultar");
        bntConsultar.addActionListener(this::bntConsultarActionPerformed);

        TablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TablaEmpleado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntActualizar)
                            .addComponent(bntGuardar))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntEliminar)
                            .addComponent(bntConsultar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntGuardar)
                            .addComponent(bntEliminar))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntActualizar)
                            .addComponent(bntConsultar))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarTabla(){
    
        modeloTabla.setRowCount(0);
        for(ClienteModel cli : contro.LIstaTodos()){
        
            modeloTabla.addRow(new Object[]{cli.getId(),cli.getNombre(),cli.getApellido(),cli.getTelefono(),cli.getEmail(),cli.getDireccion()});
        }
    }
    
    private void bntGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarActionPerformed
      
        
        contro.GuardarCliente(txtNombre.getText(), txtApellido.getText(), txtTelefono.getText(), txtEmail.getText(), txtDireccion.getText());
        CargarTabla();
    }//GEN-LAST:event_bntGuardarActionPerformed

    private void bntActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntActualizarActionPerformed
        
        String codigo = JOptionPane.showInputDialog("Ingresar codigo a actualizar");
        
        contro.ActualizarCliente(Integer.parseInt(codigo), txtNombre.getText(), txtApellido.getText(), txtTelefono.getText(), txtEmail.getText(), txtDireccion.getText());
        CargarTabla();
    }//GEN-LAST:event_bntActualizarActionPerformed

    private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed
        
        String codigo = JOptionPane.showInputDialog("Ingresar codigo a Eliminar");
        contro.EliminarCliente(Integer.parseInt(codigo));
        CargarTabla();
    }//GEN-LAST:event_bntEliminarActionPerformed

    private void bntConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConsultarActionPerformed
        String codigoSTring = JOptionPane.showInputDialog("Ingresar codigo a Eliminar");
        
        int codigo = Integer.parseInt(codigoSTring);
        ClienteModel Cli = contro.ConsultarCliente(codigo);
        
        txtNombre.setText(Cli.getNombre());
        txtApellido.setText(Cli.getApellido());
        txtTelefono.setText(Cli.getTelefono());
        txtEmail.setText(Cli.getEmail());
        txtDireccion.setText(Cli.getDireccion());
        
        CargarTabla();
    }//GEN-LAST:event_bntConsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        java.awt.EventQueue.invokeLater(() -> new viewCliente().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEmpleado;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
