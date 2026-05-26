/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Partidos;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class viestaPartido extends javax.swing.JInternalFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(viestaPartido.class.getName());

    private final Partidos_Controler Controler = new Partidos_Controler();
    
    private DefaultTableModel ModeloTabla = new DefaultTableModel(new Object[]{"ID", "Equipo Local","Equipo Visitante","Fecha","Estadio","Ciudad","Capacidad", "Estado"},0);
            
            
    public viestaPartido() {
        initComponents();
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        TablaPartido.setModel(ModeloTabla);
        CargarTabla();
    }

    private void CargarTabla(){
    
        ModeloTabla.setRowCount(0);
        for(PartidosModel PartMod: Controler.LIstaTodos() ){
        ModeloTabla.addRow(new Object[]{PartMod.getId(),PartMod.getEquipoLocal(),PartMod.getEquipoVisitante(),PartMod.getFecha(),PartMod.getEstadio(),PartMod.getCiudad(),PartMod.getCapacidad(),PartMod.getEstado()});
        }
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
        txtEquipoLocal = new javax.swing.JTextField();
        txtEquipoVisitante = new javax.swing.JTextField();
        txtEstadio = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPartido = new javax.swing.JTable();
        bntLimpiar = new javax.swing.JButton();
        bntConsultar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        bntActualizar = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        bntGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCiudad1 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1030, 740));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel1.setText("Equipo Local");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel2.setText("Equipo Visitante");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel3.setText("Fecha");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel4.setText("Estadio");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel5.setText("Ciudad");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        txtEquipoLocal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEquipoLocal.setBorder(null);
        background.add(txtEquipoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 280, 30));

        txtEquipoVisitante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEquipoVisitante.setBorder(null);
        background.add(txtEquipoVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 280, 30));

        txtEstadio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEstadio.setBorder(null);
        background.add(txtEstadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 280, 30));

        txtCiudad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCiudad.setBorder(null);
        txtCiudad.addActionListener(this::txtCiudadActionPerformed);
        background.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 280, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 280, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 280, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 280, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 280, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 280, 10));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setText("Ingresar");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        TablaPartido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaPartido);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1030, 450));

        bntLimpiar.setBackground(new java.awt.Color(47, 78, 254));
        bntLimpiar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        bntLimpiar.setText("Limpiar");
        bntLimpiar.addActionListener(this::bntLimpiarActionPerformed);
        background.add(bntLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, 100, 40));

        bntConsultar.setBackground(new java.awt.Color(47, 78, 254));
        bntConsultar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntConsultar.setForeground(new java.awt.Color(255, 255, 255));
        bntConsultar.setText("Consultar");
        bntConsultar.addActionListener(this::bntConsultarActionPerformed);
        background.add(bntConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 100, 40));

        bntEliminar.setBackground(new java.awt.Color(47, 78, 254));
        bntEliminar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntEliminar.setForeground(new java.awt.Color(255, 255, 255));
        bntEliminar.setText("Eliminar");
        bntEliminar.addActionListener(this::bntEliminarActionPerformed);
        background.add(bntEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 100, 40));

        bntActualizar.setBackground(new java.awt.Color(47, 78, 254));
        bntActualizar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntActualizar.setForeground(new java.awt.Color(255, 255, 255));
        bntActualizar.setText("Actualizar");
        bntActualizar.addActionListener(this::bntActualizarActionPerformed);
        background.add(bntActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 100, 40));
        background.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 280, -1));

        bntGuardar.setBackground(new java.awt.Color(47, 78, 254));
        bntGuardar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        bntGuardar.setForeground(new java.awt.Color(255, 255, 255));
        bntGuardar.setText("Guardar");
        bntGuardar.setBorder(null);
        bntGuardar.addActionListener(this::bntGuardarActionPerformed);
        background.add(bntGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, 100, 40));

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel7.setText("Ciudad");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        txtCiudad1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCiudad1.setBorder(null);
        txtCiudad1.addActionListener(this::txtCiudad1ActionPerformed);
        background.add(txtCiudad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 280, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 280, 10));

        jLabel8.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel8.setText("Capacidad");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        txtCapacidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCapacidad.setBorder(null);
        txtCapacidad.addActionListener(this::txtCapacidadActionPerformed);
        background.add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 280, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 280, 10));

        jLabel9.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel9.setText("Estado");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        txtEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEstado.setBorder(null);
        txtEstado.addActionListener(this::txtEstadoActionPerformed);
        background.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 280, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 280, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void bntConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConsultarActionPerformed
  
        String ids = JOptionPane.showInputDialog("ingrese a id a buscar");
        
        try{
        
            int id = Integer.parseInt(ids);
            searchbyid(id);
        }catch(NumberFormatException e){
        
            JOptionPane.showMessageDialog(this, "ID invalido");
        }
    
    }//GEN-LAST:event_bntConsultarActionPerformed

    private void bntActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntActualizarActionPerformed
    int fila = TablaPartido.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un partido para editar");
        return;
    }
        
        String EquipoLocal = txtEquipoLocal.getText();
        String Equipobisitante = txtEquipoVisitante.getText();
        java.sql.Date fecha = new java.sql.Date(txtFecha.getDate().getTime());
        String Estadio = txtEstadio.getText();
        String ciudad  = txtCiudad.getText();
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        String Estado = txtEstado.getText();
        
    
    if(Controler.ModificarPartido(Integer.parseInt(TablaPartido.getValueAt(fila, 0).toString()), EquipoLocal, Equipobisitante, fecha, Estadio, ciudad,capacidad,Estado)){
    
    JOptionPane.showMessageDialog(this, "Partido modificado");
    CargarTabla();
    }else{
    
    JOptionPane.showMessageDialog(this, "Error al modificar partido");
    }
    }//GEN-LAST:event_bntActualizarActionPerformed

    private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed
       int fila = TablaPartido.getSelectedRow();
       if(fila == -1){
       
           JOptionPane.showMessageDialog(this, "Seleccione un partido a eliminar");
           return;
       }
        
       int id = Integer.parseInt(TablaPartido.getValueAt(fila, 0).toString());
       
       int confirmar = JOptionPane.showConfirmDialog(this, "¿Eliminar partido con ID: " + id + "?", "Confirmar", JOptionPane.YES_NO_OPTION);
       
       if(confirmar == JOptionPane.YES_OPTION){
           if(Controler.EliminarPartido(id)){
           
               JOptionPane.showMessageDialog(this, "partido Eliminado con exito");
           }else{
           
               JOptionPane.showMessageDialog(this, "Error a eliminar partido");
           }
       }
    }//GEN-LAST:event_bntEliminarActionPerformed

    private void bntLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimpiarActionPerformed
        
        Limpiar();
    }//GEN-LAST:event_bntLimpiarActionPerformed

    private void bntGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarActionPerformed
       
        String EquipoLocal = txtEquipoLocal.getText();
        String Equipobisitante = txtEquipoVisitante.getText();
        


    java.sql.Date fecha = new java.sql.Date(txtFecha.getDate().getTime());
    


        String Estadio = txtEstadio.getText();
        String ciudad  = txtCiudad.getText();
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        String Estado = txtEstado.getText();
        
        Controler.GuardarPartido(EquipoLocal, Equipobisitante, fecha, Estadio, ciudad, capacidad, Estado);
        CargarTabla();
    }//GEN-LAST:event_bntGuardarActionPerformed

    private void txtCiudad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudad1ActionPerformed

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

private void searchbyid(int id) {
    ModeloTabla.setRowCount(0); // Limpiar tabla
    PartidosModel partido = Controler.ConsultarPartido(id);
    if (partido != null) {
        ModeloTabla.addRow(new Object[]{
            partido.getId(),
            partido.getEquipoLocal(),
            partido.getEquipoVisitante(),
            partido.getFecha(),
            partido.getEstadio(),
            partido.getCiudad(),
            partido.getCapacidad(),
            partido.getEstado()
        });
    } else {
        JOptionPane.showMessageDialog(this, "Partido no encontrado, con ID: " + id);
    }
}

private void Limpiar(){

    txtEquipoLocal.setText("");
    txtEquipoVisitante.setText("");
    txtFecha.setDate(null);
    txtEstadio.setText("");
    txtCiudad.setText("");
    txtCapacidad.setText("");
    txtEstado.setText("");
    
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
        java.awt.EventQueue.invokeLater(() -> new viestaPartido().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPartido;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCiudad1;
    private javax.swing.JTextField txtEquipoLocal;
    private javax.swing.JTextField txtEquipoVisitante;
    private javax.swing.JTextField txtEstadio;
    private javax.swing.JTextField txtEstado;
    private com.toedter.calendar.JDateChooser txtFecha;
    // End of variables declaration//GEN-END:variables
}
