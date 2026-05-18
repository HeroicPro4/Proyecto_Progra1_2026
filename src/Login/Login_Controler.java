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
    public void iniciarSesion(LoginModel loginModel, javax.swing.JFrame vistaLogin){
        Login_DAO dao = new Login_DAO();
        
        if (dao.Validacion(loginModel)){
           Dashboard dashboard = new Dashboard();
           dashboard.setVisible(true);
            vistaLogin.dispose();
        } else {
            JOptionPane.showMessageDialog(vistaLogin, "Usuario o contrasena incorrecta");
        }
    }
    
}
