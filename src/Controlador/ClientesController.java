package Controlador;

import static Controlador.ClientesController.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import modelo.Conexion;
import vista.Cliente;
import vista.ModificarBanco;
import vista.ModificarCliente;

public class ClientesController {

    static Conexion conn = new Conexion();
    public static Cliente cl = new Cliente();

public static void btnAgregar(String nombre, String rut, String telefono, String celular, String correo, int red, Date chosenDate) {

        Consultas cs = new Consultas();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fecha = sdf.format(chosenDate);
        String SQL = "INSERT INTO cliente (nombre_cl, rut_cl, fono_cl, celular_cl, mail_cl, id_red, fn_cl) VALUES('" + nombre + "','" + rut + "'," + telefono + "," + celular + ",'" + correo + "',"+ red +",'" + fecha + "')";
        
        
        
        if (cs.InsertarDatos(SQL)) {
            JOptionPane.showMessageDialog(null, "Cliente aladido a la base");
        } else {
            {
                JOptionPane.showMessageDialog(null, "Cliente no se pudo añadir a la base");
            }
        }

// conn.guardarCliente(nombre, rut, celular, telefono, correo, id);
        System.out.println("##############################");

        System.out.println(fecha);

        /*public static ResultSet btnEditar (String nombre, String rut, String celular, String telefono, String correo, String id){
        if(){
            DefaultTableModel tblModel = new DefaultTableModel();
           
            Cliente cl = new Cliente();
           
            ResultSet bncActivos=cl.getBancoActualiza(rut);
           
           return bncActivos;
        }
         return null;*/
    }
    
    
    public static void Rellenar(){
    
        try {
            
            Consultas cs = new Consultas();
            String SQL = "SELECT * FROM CLIENTE";
            var tabla = (DefaultTableModel) cl.tablaCliente.getModel();
            tabla.setRowCount(0);
            String datos[] = new String[7];
            
            var rs = cs.PedirDatos(SQL);
            
            
            while (rs.next()) {
              datos[0] =  rs.getString("nombre_cl");
              datos[1] =  rs.getString("rut_cl");
              datos[2] =  rs.getString("fn_cl");
              datos[3] =  rs.getString("celular_cl");
              datos[4] =  rs.getString("fono_cl");
              datos[5] =  rs.getString("mail_cl");
              datos[6] =  rs.getString("id_red");
              tabla.addRow(datos);
            }
            rs.close();
            
            cl.tablaCliente.setModel(tabla);
            
            
        } catch (SQLException ex) {
            System.out.println("error " + ex);
        }
    
    }

    public static void mostrar() {
        cl.setVisible(true);

    }

    public static void btnEditar(String nombre, String rut, String celular, String telefono, String correo, int red, Date chosenDate) {

        if (cl.tablaCliente.getSelectedRow() != -1) {

           
            
            String sql = "UPDATE cliente SET nombre_cl, fono_cl, fn_cl, mail_cl, celular_cl,id_red WHERE rut_cl = ";
           // ModificarCliente modificar = new ModificarCliente(nombre, rut, celular, telefono, correo, chosenDate, red);
           // modificar.setVisible(true);
        }

        System.out.println(cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 0));
        System.out.println(cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 1));
    }

    
   
    
    
    public static void main(String[] args) {
        cl.setVisible(true);

    }
    
}
