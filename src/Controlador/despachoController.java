/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import modelo.Conexion;
import vista.Despacho;
import modelo.despacho;

/**
 *
 * @author usuario
 */
public class despachoController {
    
    static Conexion conn = new Conexion();
    public static Despacho dc = new Despacho();
    
    

    public static void mostrar(){
        dc.setVisible(true);
     }        
      
    public static void btnIngresar(String rut, String nombre, String mensaje, Date chosenDate, String hora, String direccion, String comuna){
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       String fecha = sdf.format(chosenDate);
        System.out.println(fecha);
        System.out.println("1");
       conn.guardardespacho(rut, nombre, mensaje, fecha, hora, direccion, comuna);
       
    }
    
     public static void dataRows(JTable tabladespacho) {
        DefaultTableModel table = (DefaultTableModel) tabladespacho.getModel();
        tabladespacho.setModel(table);
        table.setRowCount(0);
        
        try{
            
            despacho bc = new despacho();
            PreparedStatement sentencia = bc.getdespachoactivos();

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
/*datos[0] = rs.getString("rut_cl");
                datos[1] = rs.getString("nombre_destinatario");
                datos[2] = rs.getString("mensaje_destinatario");
                datos[3] = rs.getString("fentrega_destinatario");
                datos[4] = rs.getString("hentrega_destinatario");
                datos[5] = rs.getString("direccion_destinatario");
                datos[6] = rs.getString("nombre_comuna");
                datos[7] = rs.getString("id_comuna_destinatario");*/
