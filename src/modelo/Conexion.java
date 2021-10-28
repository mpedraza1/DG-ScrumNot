package modelo;
//
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class Conexion {
     Connection conn = null;

     
    public Connection Conexion() 
    {
        
           System.out.println("*****");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String unicode="useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scrumn´t?"+unicode, "root", "");
            System.out.println("conectado");
            return conn;
        }catch(Exception ex){
            System.out.println(ex);
            System.out.println("couldn't connect!");
            return null;
        }

    }
    
    public Connection getConnection(){
                 return conn;    
    }

    public boolean  guardarrrss(String nom, int estado){
     
      try{
             
         System.out.println("************");
         System.out.println(nom+" "+estado);

         conn = Conexion();
        if (nom != "" ) {
        
            String sql = "INSERT INTO redsocial (nombre_red, estado_red) VALUES (?,?)";
  
            var pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nom);
            pstmt.setInt(2, estado);

            int rowAffected = pstmt.executeUpdate();
            conn.close();
            if(rowAffected == 1)
            { JOptionPane.showMessageDialog(null, "Registro realizado con éxito");
                return true;
               
            }else{
                JOptionPane.showMessageDialog(null, "Error al crear nuevo registro");
             System.out.println(rowAffected);
            }
           
            return true;
            
        }
      }catch(HeadlessException | SQLException e){
          System.out.println(e);
               
    }
         return false;
   
    }

    public boolean  guardarusuario(String usuario, String pass){
     
      try{
             
         System.out.println("************");
         System.out.println(usuario+" "+pass+" ");

         conn = Conexion();
        if (usuario != "" ) {
        
            String sql = "INSERT INTO control_usuarios (nombre_control, contraseña_control) VALUES (?,?)";
  
            var pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, usuario);
            pstmt.setString(2, pass);

            int rowAffected = pstmt.executeUpdate();
            conn.close();
            if(rowAffected == 1)
            { JOptionPane.showMessageDialog(null, "Registro realizado con éxito");
                return true;
               
            }else{
                JOptionPane.showMessageDialog(null, "Error al crear nuevo registro");
             System.out.println(rowAffected);
            }
           
            return true;
            
        }
      }catch(Exception e){
          System.out.println(e);
               
    }
         return false;
   
    }
    
    public boolean  guardardespacho(String rut, String nombre, String mensaje, String fecha, String hora, String direccion, String comuna){
     
      try{
             
         System.out.println("************");
         System.out.println(rut+" "+nombre+" "+mensaje+" "+fecha+" "+hora+" "+direccion+" "+comuna+" ");

         conn = Conexion();
          System.out.println("asdasd");
        
        
            String sql = "INSERT INTO despacho (rut_cl, nombre_destinatario, mensaje_destinatario, fentrega_destinatario, hentrega_destinatario, direccion_destinatario, nombre_comuna) "
                    + "VALUES ('"+rut+"','"+nombre+"','"+mensaje+"','"+fecha+"','"+hora+"','"+direccion+"','"+comuna+"')";
            //"INSERT INTO control_usuarios (nombre_control, contraseña_control) VALUES (?,?)"
            var st = conn.createStatement();
            var rs = st.executeQuery(sql);
            //var pstmt = conn.prepareStatement(sql);
            System.out.println("2");
            /*
            pstmt.setString(1, rut);
            pstmt.setString(2, nombre);
            pstmt.setString(3, mensaje);
            pstmt.setString(4, fecha);
            pstmt.setString(5, hora);
            pstmt.setString(6, direccion);
            pstmt.setString(7, comuna);
            System.out.println("3");
            */

            //int rowAffected = pstmt.executeUpdate();
            conn.close();
            if(rs.next())
            { JOptionPane.showMessageDialog(null, "Registro realizado con éxito");
            rs.close();
            return true;
               
            }else{
                JOptionPane.showMessageDialog(null, "Error al crear nuevo registro");
             System.out.println();
            }
           
            
            
        
      }catch(HeadlessException | SQLException e){
          System.out.println(e);
               
    }
         return false;
   
    }
    
    public boolean  guardarCat(String nom, int estado){
     
      try{
             
         System.out.println("************");
         System.out.println(nom+" "+estado);

         conn = Conexion();
        if (nom != "" ) {
        
            String sql = "INSERT INTO categoria_articulos (nombre_categoria, estado_categoria) VALUES (?,?)";
  
            var pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nom);
            pstmt.setInt(2, estado);

            int rowAffected = pstmt.executeUpdate();
            conn.close();
            if(rowAffected == 1)
            { JOptionPane.showMessageDialog(null, "Registro realizado con éxito");
                return true;
               
            }else{
                JOptionPane.showMessageDialog(null, "Error al crear nuevo registro");
             System.out.println(rowAffected);
            }
           
            return true;
            
        }
      }catch(HeadlessException | SQLException e){
          System.out.println(e);
               
    }
         return false;
   
    }
    
    
}
       

           
           
       
          
       
   
      
    

    
         


       
        
           
           
       
          
       
   
      
    

    
         


       
        

