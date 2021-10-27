
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Usuarios {
    static Connection conn = null;
    
        public PreparedStatement getuseractivos() {
            Conexion cn = new Conexion();
            conn = cn.Conexion();
     
            try{
                    
            String consulta = "select * from control_usuarios";
            PreparedStatement sentencia= conn.prepareStatement(consulta);

            return sentencia;
            
            }catch(Exception e){
                System.out.println("sdasadda");
            }
        return null;
            
    }
    
}
