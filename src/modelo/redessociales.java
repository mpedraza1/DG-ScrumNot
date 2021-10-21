
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class redessociales {
    static Connection conn = null;
    
    
    
    public redessociales () {
        
    }


    public PreparedStatement getrrssactivos() {
            Conexion cn = new Conexion();
            conn = cn.Conexion();
     
            try{
                    
            String consulta = "select * from redsocial";
            PreparedStatement sentencia= conn.prepareStatement(consulta);

            return sentencia;
            
            }catch(Exception e){
                System.out.println("sdasadda");
            }
        return null;
            
    }
    
    public static String ObtenerId(String rrss){
        try {

            String id = "";
            Conexion cn = new Conexion();
            conn = cn.Conexion();
            String SQL = "select id_red from redsocial where nombre_red='" + rrss + "'";
            var st = conn.createStatement();
            var rs = st.executeQuery(SQL);

            if (rs.next()) {
                id = rs.getString("id_red");
            }

            return id;
        } catch (SQLException ex) {
            Logger.getLogger(redessociales.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}