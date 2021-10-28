package modelo;
//
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import javax.swing.JComboBox;

public class Conexion {
     Connection conn = null;

     
    public Connection Conexion() 
    {
        
           System.out.println("*****");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String unicode="useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scrumn´t?"+unicode, "root", "");
            return conn;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("couldn't connect!");
            throw new RuntimeException(ex);
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
      }catch(Exception e){
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
        if (rut != "" ) {
        
            String sql = "INSERT INTO despacho";
            //"INSERT INTO control_usuarios (nombre_control, contraseña_control) VALUES (?,?)"
            var pstmt = conn.prepareStatement(sql);
            pstmt.setString(0, rut);
            pstmt.setString(1, nombre);
            pstmt.setString(2, mensaje);
            pstmt.setString(3, fecha);
            pstmt.setString(4, hora);
            pstmt.setString(5, direccion);
            pstmt.setString(6, comuna);

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
    public boolean  guardararticulo(String txtcodigo,String txtcantidad,String cbxcat,String txtmarca,String txtdescripcion,String txtven ,String txtrut,String txtnombre){
    try{
             
         System.out.println("************");
         System.out.println (  txtnombre + " "+ txtcantidad + " "+ cbxcat + ""+txtmarca+""+txtdescripcion+""+txtven+""+txtrut+""+txtnombre+"");
                                                
         conn = Conexion();
        if ( txtcodigo != "" ) {
        
            String sql = "INSERT INTO articulo";
            //"INSERT INTO control_usuarios (nombre_control, contraseña_control) VALUES (?,?)"
            var pstmt = conn.prepareStatement(sql);
            pstmt.setString(0, txtcodigo);
            pstmt.setString(1, txtcantidad);
            pstmt.setString(2,cbxcat);           
            pstmt.setString(3, txtmarca);
            pstmt.setString(4, txtdescripcion);
            pstmt.setString(5, txtven);
            pstmt.setString(6, txtrut);
            pstmt.setString(7,txtnombre);

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
        } }catch(Exception e){
          System.out.println(e);
               
                     }
         return false;
        }
    }

       

           
           
       
          
       
   
      
    

    
         


       
        
           
           
       
          
       
   
      
    

    
         


       
        

