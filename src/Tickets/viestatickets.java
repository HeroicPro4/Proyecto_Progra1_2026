/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tickets;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class viestatickets extends javax.swing.JInternalFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(viestatickets.class.getName());

    private final controladorTikets controlerTickets = new controladorTikets();
    
    private DefaultTableModel ModeloTabla = new DefaultTableModel(new Object[]{"ID","ID partido","numero de asiento","Seccion","Precios","Estado"},0);
            
            
    public viestatickets() {
        initComponents();
        TablaTiket.setModel(ModeloTabla);
        CargarTabla();
    }

    private void CargarTabla(){
    
        ModeloTabla.setRowCount(0);
        for(modelotikets mtk: controlerTickets.Listatodos() ){
        ModeloTabla.addRow(new Object[]{mtk.getId(), mtk.getPartidoId(), mtk.getNumero_asiento(), mtk.getSeccion(), mtk.getPrecion(), mtk.getEstado()});
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
        txtIDpartido = new javax.swing.JTextField();
        txtNumerodeAsiento = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTiket = new javax.swing.JTable();
        bntGuardar = new javax.swing.JButton();
        bntLimpiar = new javax.swing.JButton();
        bntConsultar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        bntActualizar = new javax.swing.JButton();
        CbEstado = new javax.swing.JComboBox<>();
        CbSeccion = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 750));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1030, 740));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel1.setText("ID partido");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel2.setText("Numero de asiento");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel3.setText("Seccion");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel4.setText("Precio");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel5.setText("Estado");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        txtIDpartido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtIDpartido.setBorder(null);
        background.add(txtIDpartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 280, 30));

        txtNumerodeAsiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumerodeAsiento.setBorder(null);
        background.add(txtNumerodeAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 280, 30));

        txtPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPrecio.setBorder(null);
        background.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 280, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 280, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 280, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 280, 10));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setText("Ingresar");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 110, 40));

        TablaTiket.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaTiket);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 520, 550));

        bntGuardar.setBackground(new java.awt.Color(47, 78, 254));
        bntGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        background.add(bntGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 100, 40));

        bntLimpiar.setBackground(new java.awt.Color(47, 78, 254));
        bntLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        background.add(bntLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 90, 40));

        bntConsultar.setBackground(new java.awt.Color(47, 78, 254));
        bntConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        background.add(bntConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 110, 40));

        bntEliminar.setBackground(new java.awt.Color(47, 78, 254));
        bntEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        background.add(bntEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 90, 40));

        bntActualizar.setBackground(new java.awt.Color(47, 78, 254));
        bntActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        background.add(bntActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 110, 40));

        CbEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "DISPONIBLE", "VENDIDO", "RESERVADO" }));
        CbEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(CbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 280, -1));

        CbSeccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CbSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "VIP", "PREFERENCIAL", "GENERAL" }));
        CbSeccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(CbSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 280, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Corbel", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 420, 360));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Corbel", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 550, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarActionPerformed
      
        int idpartido = Integer.parseInt(txtIDpartido.getText());
        String numeroasiento = txtNumerodeAsiento.getText();
        String seccion = CbSeccion.getSelectedItem().toString();
        double precio = Double.parseDouble(txtPrecio.getText());
        String estado = CbEstado.getSelectedItem().toString();
        
        controlerTickets.guardar(idpartido, numeroasiento, seccion, precio, estado);
        
        CargarTabla();
    }//GEN-LAST:event_bntGuardarActionPerformed

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
    int fila = TablaTiket.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona uno para editar");
        return;
    }
        
        int idpartido = Integer.parseInt(txtIDpartido.getText());
        String numeroasiento = txtNumerodeAsiento.getText();
        String seccion = CbSeccion.getSelectedItem().toString();
        double precio = Double.parseDouble(txtPrecio.getText());
        String estado = CbEstado.getSelectedItem().toString();
    
    if(controlerTickets.Modificar(Integer.parseInt(TablaTiket.getValueAt(fila, 0).toString()),idpartido, numeroasiento, seccion, precio, estado)){
    
    JOptionPane.showMessageDialog(this, "Cliente actualizado");
    CargarTabla();
    }else{
    
    JOptionPane.showMessageDialog(this, "Error al actualizar cliente");
    }
    }//GEN-LAST:event_bntActualizarActionPerformed

    private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed
       int fila = TablaTiket.getSelectedRow();
       if(fila == -1){
       
           JOptionPane.showMessageDialog(this, "Seleccione un cliente a eliminar");
           return;
       }
        
       int id = Integer.parseInt(TablaTiket.getValueAt(fila, 0).toString());
       
       int confirmar = JOptionPane.showConfirmDialog(this, "¿Eliminar cliente con ID: " + id + "?", "Confirmar", JOptionPane.YES_NO_OPTION);
       
       if(confirmar == JOptionPane.YES_OPTION){
           if(controlerTickets.Eliminar(id)){
           
               JOptionPane.showMessageDialog(this, "Se eliminado con exito");
           }else{
           
               JOptionPane.showMessageDialog(this, "Error al eliminar");
           }
       }
    }//GEN-LAST:event_bntEliminarActionPerformed

    private void bntLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimpiarActionPerformed
        
        Limpiar();
    }//GEN-LAST:event_bntLimpiarActionPerformed

    private void bntGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntGuardarMouseEntered
        bntGuardar.setBackground(new Color(129,176,254));
    }//GEN-LAST:event_bntGuardarMouseEntered

    private void bntGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntGuardarMouseExited
        bntGuardar.setBackground(new Color(47, 78, 254));
    }//GEN-LAST:event_bntGuardarMouseExited

    private void bntLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntLimpiarMouseEntered
       bntLimpiar.setBackground(new Color(129,176,254));
    }//GEN-LAST:event_bntLimpiarMouseEntered

    private void bntConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntConsultarMouseEntered
       bntConsultar.setBackground(new Color(129,176,254));
    }//GEN-LAST:event_bntConsultarMouseEntered

    private void bntEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntEliminarMouseEntered
        bntEliminar.setBackground(new Color(129,176,254));
    }//GEN-LAST:event_bntEliminarMouseEntered

    private void bntActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntActualizarMouseEntered
        bntActualizar.setBackground(new Color(129,176,254));
    }//GEN-LAST:event_bntActualizarMouseEntered

    private void bntLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntLimpiarMouseExited
        bntLimpiar.setBackground(new Color(47, 78, 254));
    }//GEN-LAST:event_bntLimpiarMouseExited

    private void bntConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntConsultarMouseExited
        bntConsultar.setBackground(new Color(47, 78, 254));
    }//GEN-LAST:event_bntConsultarMouseExited

    private void bntEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntEliminarMouseExited
        bntEliminar.setBackground(new Color(47, 78, 254));
    }//GEN-LAST:event_bntEliminarMouseExited

    private void bntActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntActualizarMouseExited
        bntActualizar.setBackground(new Color(47, 78, 254));
    }//GEN-LAST:event_bntActualizarMouseExited

private void searchbyid(int id) {
    ModeloTabla.setRowCount(0); // Limpiar tabla
    modelotikets MTK = controlerTickets.ConsultarTicket(id);
    if (MTK != null) {
        ModeloTabla.addRow(new Object[]{
            MTK.getId(),
            MTK.getPartidoId(),
            MTK.getNumero_asiento(),
            MTK.getSeccion(),
            MTK.getPrecion(),
            MTK.getEstado()
        });
    } else {
        JOptionPane.showMessageDialog(this, "No se ha encontrado: " + id);
    }
}

private void Limpiar(){

    txtIDpartido.setText("");
    txtNumerodeAsiento.setText("");
    CbSeccion.setSelectedItem(" ");
    txtPrecio.setText("");
    CbEstado.setSelectedItem(" ");
    
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
        java.awt.EventQueue.invokeLater(() -> new viestatickets().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbEstado;
    private javax.swing.JComboBox<String> CbSeccion;
    private javax.swing.JTable TablaTiket;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtIDpartido;
    private javax.swing.JTextField txtNumerodeAsiento;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
