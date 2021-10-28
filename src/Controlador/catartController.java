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
import modelo.Conexion;
import modelo.categoriaarticulos;
import vista.CategoriaArt;

/**
 *
 * @author usuario
 */
public class catartController {
    
    static Conexion conn = new Conexion();
    public static CategoriaArt  ca = new CategoriaArt();
     

     public static void mostrar(){
        ca.setVisible(true);
     }        
      
    public static void btnAgregar(String nombre, int status){
       
       conn.guardarCat(nombre, status);
       System.out.println(nombre);
    }
    
     public static void dataRows(JTable tablaCat) {
        DefaultTableModel table = (DefaultTableModel) tablaCat.getModel();
        tablaCat.setModel(table);
        table.setRowCount(0);
        
        try{
            
            categoriaarticulos bc = new categoriaarticulos();
            PreparedStatement sentencia = bc.getCatactivos();

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
