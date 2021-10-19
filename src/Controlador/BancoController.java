
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Banco;
import modelo.Conexion;
import vista.Bancos;
import vista.ModificarBanco;



public class BancoController {
     
     static Conexion conn = new Conexion();
     public static Bancos  bc = new Bancos();
     

     public static void mostrar(){
        bc.setVisible(true);
     }       
    
    public static void btnModificar() {

        if (bc.tablaBanco.getSelectedRow() != -1) {
            
            String nombre = (String) bc.tablaBanco.getModel().getValueAt(bc.tablaBanco.getSelectedRow(), 0);
            String id = Banco.ObtenerId(nombre);
            
            int estado = (int) bc.tablaBanco.getModel().getValueAt(bc.tablaBanco.getSelectedRow(), 1);

            ModificarBanco modificar = new ModificarBanco(nombre, estado, id);
            modificar.setVisible(true);
        }
      
      
        System.out.println(bc.tablaBanco.getModel().getValueAt(bc.tablaBanco.getSelectedRow(), 0));
        System.out.println(bc.tablaBanco.getModel().getValueAt(bc.tablaBanco.getSelectedRow(), 1));
    }
    
    public static void GuardarModificar(String nombre, int status, String id){
        Banco.ActualizarDatos(nombre, status, id);
    
    
    }
    
     
    public static void btnCrear(String nombre, int status){
     
 
       conn.guardarBanco(nombre, status);
       System.out.println(nombre);
      
             

    }
    
   
    public static ResultSet btnActualizar (String nombre,int estado){
        if(!"".equals(nombre) && estado > 0){
            DefaultTableModel tblModel = new DefaultTableModel();
           
           Banco banco = new Banco();
           
           ResultSet bncActivos=banco.getBancoActualiza(estado);
          
           return bncActivos;
        }
         return null;
    }
    
        public static void main(String[] args) {
           bc.setVisible(true);

        }
        
        
    public static void dataRows(JTable tablaBanco) {
        DefaultTableModel table = (DefaultTableModel) tablaBanco.getModel();
        tablaBanco.setModel(table);
        table.setRowCount(0);
        
        
        
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
       
        


   
