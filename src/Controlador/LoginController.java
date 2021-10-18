
package Controlador;

import vista.Login;

public class LoginController {
    
    public static Login bc =new Login();
    public static void mostrar(){bc.setVisible(true); }
    public static void ocultar(){bc.setVisible(false);}
    
    public static void eventoBotonIngresar(){
        System.out.println("Evento!!");
    
    }
    
}
