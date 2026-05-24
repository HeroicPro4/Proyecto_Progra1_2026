/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tickets;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author adrir
 */
public class vistaTikets extends javax.swing.JInternalFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(vistaTikets.class.getName());


    private final controladorTikets controlerTikets = new controladorTikets();
    DefaultTableModel Modelotabla = new DefaultTableModel(new Object[]{"id","ID partido","numero de asiento","Seccion","Precios","Estado"}, 0);
    
    public vistaTikets() {
        initComponents();
        TablaTiket.setModel(Modelotabla);
        Cargartabla();
    }


    private void Cargartabla(){
    Modelotabla.setRowCount(0);
    for(modelotikets mtk : controlerTikets.Listatodos()){
        Modelotabla.addRow(new Object[]{mtk.getId(), mtk.getPartidoId(), mtk.getNumero_asiento(), mtk.getSeccion(), mtk.getPrecion(), mtk.getEstado()});
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDpartido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumerodeAsiento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSeccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        bntGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTiket = new javax.swing.JTable();
        bntModificar = new javax.swing.JButton();
        bntConsultar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id partido");

        jLabel2.setText("Numero de asiento");

        jLabel3.setText("seccion");

        jLabel4.setText("precio");

        jLabel5.setText("estado");

        bntGuardar.setText("Guardar");
        bntGuardar.addActionListener(this::bntGuardarActionPerformed);

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

        bntModificar.setText("Modificar");
        bntModificar.addActionListener(this::bntModificarActionPerformed);

        bntConsultar.setText("Consultar");
        bntConsultar.addActionListener(this::bntConsultarActionPerformed);

        bntEliminar.setText("Eliminar");
        bntEliminar.addActionListener(this::bntEliminarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(52, 52, 52)
                                    .addComponent(txtEstado))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(40, 40, 40)
                                    .addComponent(txtIDpartido, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(79, 79, 79)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(86, 86, 86)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                        .addComponent(txtSeccion)
                                        .addComponent(txtNumerodeAsiento)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(bntGuardar)
                            .addGap(31, 31, 31)
                            .addComponent(bntModificar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                            .addComponent(bntConsultar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(bntEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDpartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumerodeAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntGuardar)
                    .addComponent(bntModificar)
                    .addComponent(bntConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntEliminar)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarActionPerformed
        
        int id = Integer.parseInt(txtIDpartido.getText());
        String numeroAsiento = txtNumerodeAsiento.getText();
        String seccion = txtSeccion.getText();
        double precio = Double.parseDouble(txtPrecio.getText());
        String estado = txtEstado.getText();
        
        controlerTikets.guardar(id, numeroAsiento, seccion, precio, estado);
        Cargartabla();
    }//GEN-LAST:event_bntGuardarActionPerformed

    private void bntModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntModificarActionPerformed
       
            int fila = TablaTiket.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona uno para editar");
        return;
    }
    
    int id = Integer.parseInt(TablaTiket.getValueAt(fila, 0).toString());
    int partidoID = Integer.parseInt(txtIDpartido.getText());
    String numeroAsiento = txtNumerodeAsiento.getText();
    String Seccion = txtSeccion.getText();
    Double precios = Double.parseDouble(txtPrecio.getText());
    String estado = txtEstado.getText();
    
    if(controlerTikets.Modificar(id, partidoID, numeroAsiento, Seccion, precios, estado)){
    
        JOptionPane.showMessageDialog(this, "Se logro modificar");
        Cargartabla();
    }else{
    
        JOptionPane.showMessageDialog(this, "NO se logro modificar");
    }
            
    
    }//GEN-LAST:event_bntModificarActionPerformed

    private void bntConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConsultarActionPerformed
        
        String ids = JOptionPane.showInputDialog("Ingrese id a Buscar");
        
        try{
        
            int id = Integer.parseInt(ids);
            searchbyid(id);
        }catch(NumberFormatException e){
        
            JOptionPane.showMessageDialog(this, "Error al buscar");
        }
    }//GEN-LAST:event_bntConsultarActionPerformed

    private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed
        
        int fila = TablaTiket.getSelectedRow();
        if(fila == -1){
        
            JOptionPane.showMessageDialog(this, "Seleccion algo tabla");
            return;
        }
        
        int id = Integer.parseInt(TablaTiket.getValueAt(fila, 0).toString());
        
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Esta seguro de que quiere elminar "+id+" ?","confirmar" , JOptionPane.YES_NO_OPTION);
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(controlerTikets.Eliminar(id)){
            
                JOptionPane.showMessageDialog(this, "Se logro Eliminar con exito");
            }else{
            
                JOptionPane.showMessageDialog(this, "Error al eliminar");
            }
        }
    }//GEN-LAST:event_bntEliminarActionPerformed

 
private void searchbyid(int id) {
    Modelotabla.setRowCount(0); // Limpiar tabla
    modelotikets ticket = controlerTikets.ConsultarTicket(id);
    if (ticket != null) {
        Modelotabla.addRow(new Object[]{
            ticket.getId(),
            ticket.getPartidoId(),
            ticket.getNumero_asiento(),
            ticket.getSeccion(),
            ticket.getPrecion(),
            ticket.getEstado()
        });
    } else {
        JOptionPane.showMessageDialog(this, "Partido no encontrado, con ID: " + id);
    }
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
        java.awt.EventQueue.invokeLater(() -> new vistaTikets().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaTiket;
    private javax.swing.JButton bntConsultar;
    private javax.swing.JButton bntEliminar;
    private javax.swing.JButton bntGuardar;
    private javax.swing.JButton bntModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIDpartido;
    private javax.swing.JTextField txtNumerodeAsiento;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSeccion;
    // End of variables declaration//GEN-END:variables
}
