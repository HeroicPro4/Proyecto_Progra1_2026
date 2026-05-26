/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;
import javax.swing.JOptionPane;
import Dashboard.*;

/**
 *
 * @author tonit
 */
public class Login_Controler {
    public void iniciarSesion(Login_Model loginModel, javax.swing.JFrame vistaLogin){
        Login_DAO dao = new Login_DAO();
        
        // Obtener el rol del usuario tras validar credenciales
        String rol = dao.obtenerRol(loginModel);
        
        if (rol != null) {
            switch (rol.toLowerCase()) {
                case "admin":
                    Dashboard adminDash = new Dashboard();
                    adminDash.setVisible(true);
                    break;
                case "vendedor":
                    Dashboard1 vendedorDash = new Dashboard1();
                    vendedorDash.setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(vistaLogin, "Rol no reconocido.");
                    return;
            }
            vistaLogin.dispose(); // Cierra la ventana de login
        } else {
            JOptionPane.showMessageDialog(vistaLogin, "Usuario o contraseña incorrectos");
        }
    }
}