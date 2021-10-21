package Controlador;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.redessociales;
import modelo.Conexion;
import vista.RedesSociales;

//

public class rrssController {
    
     static Conexion conn = new Conexion();
     public static RedesSociales  bc = new RedesSociales();
     

     public static void mostrar(){
        bc.setVisible(true);
     }        
      
    public static void botoningresar(String nombre, int status){
       
       conn.guardarrrss(nombre, status);
       System.out.println(nombre);
    }
    
     public static void dataRows(JTable tablarrss) {
        DefaultTableModel table = (DefaultTableModel) tablarrss.getModel();
        tablarrss.setModel(table);
        table.setRowCount(0);
        
        try{
            
            redessociales bc = new redessociales();
            PreparedStatement sentencia = bc.getrrssactivos();

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