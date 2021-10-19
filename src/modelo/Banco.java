
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Banco {
    static Connection conn = null;
    
    
    
    public Banco () {
        
    }

    

    
    
    public PreparedStatement getBancosActivos() {
            Conexion cn = new Conexion();
            conn = cn.Conexion();
     
            try{
                    
            String consulta = "select nombre_banco,estado_banco from bancos";
            PreparedStatement sentencia= conn.prepareStatement(consulta);

            return sentencia;
            
            }catch(Exception e){
                System.out.println("sdasadda");
            }
        return null;
            
    }
    
    public ResultSet getBancoActualiza(int id) {
            Conexion cn = new Conexion();
            Connection cnn = cn.Conexion();
     
            try{
                    
            String consulta = "select nombre_banco,estado_banco from bancos WHERE id = ?";
            PreparedStatement sentencia= cnn.prepareStatement(consulta);
            sentencia.setInt(1, id);
            ResultSet rs = sentencia.executeQuery();
            return rs;
            
            }catch(Exception e){
                System.out.println("sdasadda");
            }
        return null;
            
    }
    
    
    public static String ObtenerId(String banco){
        try {

            String id = "";
            Conexion cn = new Conexion();
            conn = cn.Conexion();
            String SQL = "select id_banco from bancos where nombre_banco='" + banco + "'";
            var st = conn.createStatement();
            var rs = st.executeQuery(SQL);

            if (rs.next()) {
                id = rs.getString("id_banco");
            }

            return id;
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static boolean ActualizarDatos(String nombre,int estado, String id){
    
        try {
            Conexion cn = new Conexion();
            conn = cn.Conexion();
            String SQL = "Update bancos SET nombre_banco='"+nombre+"',estado_banco="+estado+" where id_banco="+id;
            System.out.println(SQL);
            System.out.println(SQL);
            System.out.println(SQL);
            var st = conn.createStatement();
            st.executeUpdate(SQL);
           
           return true;
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}



       
         //PreparedStatement pstmt = con.prepareStatement("select * from bancos");


       //modelo.addRow(new Object[]{this.banco});
    

    


      
    
       
       
       
    







               

        
    
    


