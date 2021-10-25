
package modelo;
import java.sql.*;
import javax.swing.JOptionPane;

public class Consultas {
    
    private final Conexion cc = new Conexion();
    private final java.sql.Connection   conexionSQL   = cc.Conexion();
    
    
    public Consultas(){}
    
   
    
    public boolean consultaBooleana(String SQL){
        boolean validacion = false;
        
        try{
            var st = conexionSQL.createStatement();
            var rs = st.executeQuery(SQL);
            validacion = rs.next();
            if(validacion){
                System.out.println("consulta confirmada");
                return true;
            }
            
        } catch(SQLException e) {
            System.out.println("error: "+ e);
        
        }
        
        return false;
    }
    
    
    
    // Select Queries
    public ResultSet PedirDatos(String SQL) {
        try {
            var st = conexionSQL.createStatement(); // Statement Object
            var rs = st.executeQuery(SQL); // ResultSet Object
            
            return rs;
            
        } catch (SQLException e) {
            System.out.println("Error consultas.doQueryGet: " +  e.getLocalizedMessage());
        }
        
        return null;
    }
    
    
    
    //Insert & Update Queries
    public boolean InsertarDatos(String SQL) {
        try {
            var st = conexionSQL.createStatement();
                st.executeUpdate("SET FOREIGN_KEY_CHECKS= 0");
                st.executeUpdate(SQL);
                st.executeUpdate("SET FOREIGN_KEY_CHECKS= 1");
                 return true;
                
            } catch (SQLException e) {
                System.out.println("Error consultas.InsertarDatos: " +  e.getLocalizedMessage());
                return false;
            }
        
    }
    
    //Excepcion para Llave Foranea
  public boolean InsertarProveedor(String SQL) {
       try {
          var st = conexionSQL.createStatement();

          st.executeUpdate("SET FOREIGN_KEY_CHECKS= 0");
          st.executeUpdate(SQL);
          st.executeUpdate("SET FOREIGN_KEY_CHECKS= 1");
          
          JOptionPane.showMessageDialog(null, "Registro realizado con éxito");
          return true;

      } catch (SQLException e) {
          System.out.println("Error consultas.InsertarProveedor: " + e.getLocalizedMessage());
          return false;
      }
        
        
    }
        
}
    
    
    
    

