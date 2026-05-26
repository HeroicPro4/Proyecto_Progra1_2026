/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factura;

import Ventas.VentasModel;
import Tickets.modelotikets;
import Detalle_venta.Detalle_ventaModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

/**
 *
 * @author tonit
 */
public class Factura {
     public static void generarFactura(VentasModel venta, List<modelotikets> tickets, List<Detalle_ventaModel> detalles) {
        StringBuilder sb = new StringBuilder();
        sb.append("========== FACTURA ==========\n");
        sb.append("Nº Venta: ").append(venta.getId()).append("\n");
        sb.append("Fecha: ").append(venta.getFecha()).append("\n");
        sb.append("Cliente ID: ").append(venta.getIdCliente()).append("\n");
        sb.append("Usuario ID: ").append(venta.getIdUsuario()).append("\n");
        sb.append("-----------------------------\n");
        sb.append("DETALLE DE TICKETS:\n");
        double subtotal = 0;
        double totalIva = 0;
        for (int i = 0; i < tickets.size(); i++) {
            modelotikets t = tickets.get(i);
            Detalle_ventaModel d = detalles.get(i);
            sb.append("Asiento: ").append(t.getNumero_asiento())
              .append(" | Sección: ").append(t.getSeccion())
              .append(" | Precio: $").append(t.getPrecion())
              .append(" | IVA: $").append(d.getIva()).append("\n");
            subtotal += t.getPrecion();
            totalIva += d.getIva();
        }
        sb.append("-----------------------------\n");
        sb.append("SUBTOTAL: $").append(subtotal).append("\n");
        sb.append("IVA (12%): $").append(totalIva).append("\n");
        sb.append("TOTAL: $").append(venta.getTotal()).append("\n");
        sb.append("=============================\n");
        sb.append("¡Gracias por su compra!");
        
        JTextArea textArea = new JTextArea(sb.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(500, 400));
        JOptionPane.showMessageDialog(null, scrollPane, "Factura de Venta", JOptionPane.INFORMATION_MESSAGE);
    }
}
