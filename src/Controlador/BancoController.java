package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Banco;
import modelo.Conexion;
import vista.Bancos;
import vista.ModificarBanco;

//

public class BancoController {
     static Conexion conn = new Conexion();
     static Bancos  bc = new Bancos();
     

     public static void mostrar(){
         bc.setVisible(true);
     }       
      
    public static void btnCrear(String nombre, String status){
       

       Conexion conn = new Conexion();
       
       
       boolean guardar = conn.guardarBanco(nombre, status);
       System.out.println(nombre);
        int estado=0;
       
       if(guardar)
       {
         estado = 1;
       }
          else
       {
          estado = 0 ;
       }
             System.out.println("este es el estado "+estado);

    }
    
     public void traerBanco(){
       Conexion conn = new Conexion();
       Connection con=conn.Conexion();
       String[] dato = new String[3];
       String sql = "SELECT * FROM bancos";
       
       PreparedStatement pstmt;
       
       DefaultTableModel tabla = new DefaultTableModel();
       JTable tablaBanco = new JTable (tabla);
       
       tabla.addColumn("Id");
       tabla.addColumn("Banco");
       tabla.addColumn("Estado");
       
       tablaBanco.setModel(tabla);
       
           
       try{
           pstmt = (PreparedStatement) con.createStatement();
           
          ResultSet result = pstmt.executeQuery(sql);
           
           while (result.next()){
               dato[0]=result.getString("id_banco");
               dato[1]=result.getString("nombre_banco");
               dato[2]=result.getString("estado_banco");
               
               tabla.addRow(dato);
                                             
           }
           
           tablaBanco.setModel(tabla);
            
        }catch(SQLException e){
            
           
           
       }
    }
     
    public static ResultSet btnActualizar (String nombre,int estado){
        if(nombre != "" && estado > 0){
           DefaultTableModel tblModel = new DefaultTableModel();
           
           Banco banco = new Banco();
           
           ResultSet bncActivos=banco.getBancoActualiza(estado);
          // ModificarBanco mdfbnc = new ModificarBanco();
         //  mdfbnc.
           return bncActivos;
        }
         return null;
    }
    
        
        public static void main(String[] args) {
             bc.setVisible(true);

        }
        
        
    public static void dataRows(JTable tablaBanco) {
        DefaultTableModel table = new DefaultTableModel();
        tablaBanco.setModel(table);
        
        
        table.addColumn("Nombre");
        table.addColumn("Estado");
        
        
        try{
            
            Banco bc = new Banco();
            PreparedStatement sentencia = bc.getBancosActivos();

            ResultSetMetaData rsMd  = sentencia.getMetaData();
            int columnSize  = rsMd.getColumnCount();
            
            ResultSet rs = sentencia.executeQuery();

            while(rs.next()){
               Object[] filas = new Object[columnSize];
               
               for (int i=0; i < columnSize; i++){
                   filas[i] = rs.getObject(i+1);
               }
                
                table.addRow(filas);
            }
            
        }catch (SQLException e){
               System.err.println(e);
        }

    

    }
}
       
        


   
