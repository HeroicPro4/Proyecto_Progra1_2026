/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_1;
import Login.Login_View;
/**
 *
 * @author tonit
 */
public class Proyecto_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Login_View().setVisible(true);
        }
    });
    }
    
}
