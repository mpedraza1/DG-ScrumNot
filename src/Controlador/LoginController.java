
package Controlador;

import com.mysql.jdbc.Connection;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Usuarios;
import vista.controlusuarios;

public class LoginController {
    
    static Conexion conn = new Conexion();
    public static controlusuarios  cu = new controlusuarios();
    
    
     public static void mostrar(){
        cu.setVisible(true);
     }

    public static void jButton1 (String usuario, String pass){
       
       conn.guardarusuario(usuario, pass);
       System.out.println(usuario);
    }
    
     public static void dataRows(JTable jTable1) {
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        jTable1.setModel(table);
        table.setRowCount(0);
        
        try{
            
            Usuarios bc = new Usuarios();
            PreparedStatement sentencia = bc.getuseractivos();

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
