package modelo;
//
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

    public boolean  guardarBanco(String nom, int estado){
     
      try{
             
         System.out.println("************");
         System.out.println(nom+" "+estado);

         conn = Conexion();
        if (nom != "" ) {
        
            String sql = "INSERT INTO bancos (nombre_banco, estado_banco) VALUES (?,?)";
  
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
          
       
       }
       

           
           
       
          
       
   
      
    

    
         


       
        
           
           
       
          
       
   
      
    

    
         


       
        

