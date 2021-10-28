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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Estadoventa;
import modelo.Conexion;
import vista.estadoventa;

/**
 *
 * @author usuario
 */
public class estadoventaController {
    
    static Conexion conn = new Conexion();
     public static estadoventa  ev = new estadoventa();
     

     public static void mostrar(){
        ev.setVisible(true);
     }        
      
    public static void btnAgregar(String nombre, int status){
       
       conn.guardarestado(nombre, status);
       System.out.println(nombre);
    }
    
     public static void dataRows(JTable tablaestado) {
        DefaultTableModel table = (DefaultTableModel) tablaestado.getModel();
        tablaestado.setModel(table);
        table.setRowCount(0);
        
        try{
            
            Estadoventa bc = new Estadoventa();
            PreparedStatement sentencia = bc.getestadoactivos();

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
