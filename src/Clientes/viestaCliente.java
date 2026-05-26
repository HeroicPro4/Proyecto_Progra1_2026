/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clientes;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class viestaCliente extends javax.swing.JInternalFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(viestaCliente.class.getName());

    private final ControladorCliente Controler = new ControladorCliente();
    
    private DefaultTableModel ModeloTabla = new DefaultTableModel(new Object[]{"ID", "Nombre","Apellido","Telefono","Email","Direccion"},0);
            
            
    public viestaCliente() {
        initComponents();
        TablaCliente.setModel(ModeloTabla);
        CargarTabla();
        SoloLetra(txtNombre);
        SoloLetra(txtApellido);
        SoloNumeros(txtTelefono);
    }

    private void CargarTabla(){
    
        ModeloTabla.setRowCount(0);
        for(ClienteModel CliMod: Controler.LIstaTodos() ){
        ModeloTabla.addRow(new Object[]{CliMod.getId(),CliMod.getNombre(),CliMod.getApellido(),CliMod.getTelefono(),CliMod.getEmail(),CliMod.getDireccion()});
        }
    }
    
     public void SoloLetra(JTextField a){
    
        a.addKeyListener(new KeyAdapter() {
        
            public void keyTyped(KeyEvent e){
            
                char c=e.getKeyChar();
                if(!Character.isLetter(c) && !Character.isWhitespace(c)){
                    getToolkit().beep();
                    e.consume();
                }
            }
        });  
    }
     
      public void SoloNumeros(JTextField a){
    
        a.addKeyListener(new KeyAdapter() {
        
            public void keyTyped(KeyEvent e){
            
                char c=e.getKeyChar();
                if(Character.isLetter(c)){
                    getToolkit().beep();
                    e.consume();
                }
            }
        });  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        background = new javax.swing.JPanel();
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
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        bntGuardar = new javax.swing.JButton();
        bntLimpiar = new javax.swing.JButton();
        bntConsultar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        bntActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 750));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1030, 740));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel3.setText("Telefono");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel4.setText("Email");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel5.setText("Direccion");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 280, 30));

        txtApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtApellido.setBorder(null);
        background.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 280, 30));

        txtTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefono.setBorder(null);
        background.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 280, 30));

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setBorder(null);
        background.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 280, 30));

        txtDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDireccion.setBorder(null);
        txtDireccion.addActionListener(this::txtDireccionActionPerformed);
        background.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 280, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 280, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 280, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 280, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 280, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 280, 10));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setText("Ingresar");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaCliente);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, 370));

        bntGuardar.setBackground(new java.awt.Color(47, 78, 254));
        bntGuardar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntGuardar.setForeground(new java.awt.Color(255, 255, 255));
        bntGuardar.setText("Guardar");
        bntGuardar.setBorder(null);
        bntGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntGuardarMouseExited(evt);
            }
        });
        bntGuardar.addActionListener(this::bntGuardarActionPerformed);
        background.add(bntGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 100, 40));

        bntLimpiar.setBackground(new java.awt.Color(47, 78, 254));
        bntLimpiar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        bntLimpiar.setText("Limpiar");
        bntLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntLimpiarMouseExited(evt);
            }
        });
        bntLimpiar.addActionListener(this::bntLimpiarActionPerformed);
        background.add(bntLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 100, 40));

        bntConsultar.setBackground(new java.awt.Color(47, 78, 254));
        bntConsultar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntConsultar.setForeground(new java.awt.Color(255, 255, 255));
        bntConsultar.setText("Consultar");
        bntConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntConsultarMouseExited(evt);
            }
        });
        bntConsultar.addActionListener(this::bntConsultarActionPerformed);
        background.add(bntConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 33, -1, 40));

        bntEliminar.setBackground(new java.awt.Color(47, 78, 254));
        bntEliminar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntEliminar.setForeground(new java.awt.Color(255, 255, 255));
        bntEliminar.setText("Eliminar");
        bntEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntEliminarMouseExited(evt);
            }
        });
        bntEliminar.addActionListener(this::bntEliminarActionPerformed);
        background.add(bntEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 33, 90, 40));

        bntActualizar.setBackground(new java.awt.Color(47, 78, 254));
        bntActualizar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntActualizar.setForeground(new java.awt.Color(255, 255, 255));
        bntActualizar.setText("Actualizar");
        bntActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntActualizarMouseExited(evt);
            }
        });
        bntActualizar.addActionListener(this::bntActualizarActionPerformed);
        background.add(bntActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 33, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void bntGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarActionPerformed
      
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String telefono = txtTelefono.getText();
        String email = txtEmail.getText();
        String direccion = txtDireccion.getText();
        
        Controler.GuardarCliente(nombre, apellido, telefono, email, direccion);
        
        CargarTabla();
    }//GEN-LAST:event_bntGuardarActionPerformed

    private void bntConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConsultarActionPerformed
  
        String ids = JOptionPane.showInputDialog("ingrese a id a buscar");
        
        if(ids == null){
        
            return;
        }
        
        try{
        
            int id = Integer.parseInt(ids);
            searchbyid(id);
        }catch(NumberFormatException e){
        
            JOptionPane.showMessageDialog(this, "ID invalido");
        }
    
    }//GEN-LAST:event_bntConsultarActionPerformed

    private void bntActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntActualizarActionPerformed
    int fila = TablaCliente.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un cliente para editar");
        return;
    }
        
    String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String telefono = txtTelefono.getText();
        String email = txtEmail.getText();
        String direccion = txtDireccion.getText();
    
    if(Controler.ActualizarCliente(Integer.parseInt(TablaCliente.getValueAt(fila, 0).toString()), nombre, apellido, telefono, email, direccion)){
    
    JOptionPane.showMessageDialog(this, "Cliente actualizado");
    CargarTabla();
    }else{
    
    JOptionPane.showMessageDialog(this, "Error al actualizar cliente");
    }
    }//GEN-LAST:event_bntActualizarActionPerformed

    private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed
       int fila = TablaCliente.getSelectedRow();
       if(fila == -1){
       
           JOptionPane.showMessageDialog(this, "Seleccione un cliente a eliminar");
           return;
       }
        
       int id = Integer.parseInt(TablaCliente.getValueAt(fila, 0).toString());
       
       int confirmar = JOptionPane.showConfirmDialog(this, "¿Eliminar cliente con ID: " + id + "?", "Confirmar", JOptionPane.YES_NO_OPTION);
       
       if(confirmar == JOptionPane.YES_OPTION){
           if(Controler.EliminarCliente(id)){
           
               JOptionPane.showMessageDialog(this, "Cliente Eliminado con exito");
           }else{
           
               JOptionPane.showMessageDialog(this, "Error a eliminar cliente");
           }
       }
    }//GEN-LAST:event_bntEliminarActionPerformed

    private void bntLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimpiarActionPerformed
        
        Limpiar();
    }//GEN-LAST:event_bntLimpiarActionPerformed

    private void bntGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntGuardarMouseEntered
       bntGuardar.setBackground(new Color(129, 176,254));
    }//GEN-LAST:event_bntGuardarMouseEntered

    private void bntLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntLimpiarMouseEntered
        bntLimpiar.setBackground(new Color(129, 176,254));
    }//GEN-LAST:event_bntLimpiarMouseEntered

    private void bntConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntConsultarMouseEntered
        bntConsultar.setBackground(new Color(129, 176,254));
    }//GEN-LAST:event_bntConsultarMouseEntered

    private void bntEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntEliminarMouseEntered
       bntEliminar.setBackground(new Color(129, 176,254));
    }//GEN-LAST:event_bntEliminarMouseEntered

    private void bntActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntActualizarMouseEntered
        bntActualizar.setBackground(new Color(129, 176,254));
    }//GEN-LAST:event_bntActualizarMouseEntered

    private void bntGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntGuardarMouseExited
       bntGuardar.setBackground(new Color(47, 78,254));
    }//GEN-LAST:event_bntGuardarMouseExited

    private void bntLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntLimpiarMouseExited
        bntLimpiar.setBackground(new Color(47, 78,254));
    }//GEN-LAST:event_bntLimpiarMouseExited

    private void bntConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntConsultarMouseExited
        bntConsultar.setBackground(new Color(47, 78,254));
    }//GEN-LAST:event_bntConsultarMouseExited

    private void bntEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntEliminarMouseExited
       bntEliminar.setBackground(new Color(47, 78,254));
    }//GEN-LAST:event_bntEliminarMouseExited

    private void bntActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntActualizarMouseExited
       bntActualizar.setBackground(new Color(47, 78,254));
    }//GEN-LAST:event_bntActualizarMouseExited

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        
    }//GEN-LAST:event_txtNombreMousePressed

private void searchbyid(int id) {
    ModeloTabla.setRowCount(0); // Limpiar tabla
    ClienteModel cliente = Controler.ConsultarCliente(id);
    if (cliente != null) {
        ModeloTabla.addRow(new Object[]{
            cliente.getId(),
            cliente.getNombre(),
            cliente.getTelefono(),
            cliente.getDireccion(),
            cliente.getEmail()
        });
    } else {
        JOptionPane.showMessageDialog(this, "Cliente no encontrado con ID: " + id);
    }
}

private void Limpiar(){

    txtNombre.setText("");
    txtApellido.setText("");
    txtTelefono.setText("");
    txtEmail.setText("");
    txtDireccion.setText("");
    
}
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
        java.awt.EventQueue.invokeLater(() -> new viestaCliente().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCliente;
    private javax.swing.JPanel background;
    private javax.swing.JButton bntActualizar;
    private javax.swing.JButton bntConsultar;
    private javax.swing.JButton bntEliminar;
    private javax.swing.JButton bntGuardar;
    private javax.swing.JButton bntLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
