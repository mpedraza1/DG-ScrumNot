package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.*;
import modelo.Conexion;
import vista.Cliente;import javax.swing.table.DefaultTableModel;

import vista.ModificarCliente;

public class ClientesController {

    static Conexion conn = new Conexion();
    public static Cliente cl = new Cliente();

    public static void btnAgregar(String nombre, String rut, String telefono, String celular, String correo, int red, Date chosenDate) {

        Consultas cs = new Consultas();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fecha = sdf.format(chosenDate);
        String SQL = "INSERT INTO cliente (nombre_cl, rut_cl, fono_cl, celular_cl, mail_cl, id_red, fn_cl) VALUES('" + nombre + "','" + rut + "'," + telefono + "," + celular + ",'" + correo + "'," + red + ",'" + fecha + "')";

        if (cs.InsertarDatos(SQL)) {
            JOptionPane.showMessageDialog(null, "Cliente añadido a la base");
        } else {
            {
                JOptionPane.showMessageDialog(null, "Cliente no se pudo añadir a la base");
            }
        }
        System.out.println("##############################");

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
    
    public static boolean ActualizarDatos(String nombre, String rut, String telefono, String celular, String correo, int red, Date chosenDate) {

        Consultas cs = new Consultas();
        String SQL = "UPDATE cliente SET nombre_cl='" + nombre + "', fono_cl='" + telefono + "', celular_cl='" + celular + "', fn_cl='" + chosenDate + "', mail_cl='" + correo + "', id_red=" + red + " WHERE rut_cl ='" + rut+"'";

        try {
            cs.InsertarDatos("SET FOREIGN_KEY_CHECKS= 0");
            cs.InsertarDatos(SQL);
            cs.InsertarDatos("SET FOREIGN_KEY_CHECKS= 1");
            System.out.println(SQL);

        } catch (Exception ex) {

        }
        return true;
    }

    public ResultSet Actualizacion(String nombre, String rut, String telefono, String celular, String correo, int red, Date chosenDate) {

        Consultas cs = new Consultas();
        String SQL = "SELECT nombre_cl, fono_cl, celular_cl, fn_cl, mail_cl, id_red FROM cliente WHERE rut = ?";

        try {
            cs.PedirDatos(SQL);

        } catch (Exception e) {
            System.out.println("Actualizado");
        }
        return null;
    }
    
    
    public static String ObtenerRut(String nombre) {

        Consultas cs = new Consultas();
        String SQL = "SELECT rut_cl FROM cliente WHERE nombre_cl='" + nombre + "'";
        try {

            String rut = "";

            cs.PedirDatos(SQL);
            ResultSet rs = cs.PedirDatos(SQL);
            if (rs.next()) {
                rut = rs.getString("rut_cl");
            }
         
            return rut;
        } catch (Exception ex) {
        }
        return null;
    }
    

    public static void btnModificar() {

        if (cl.tablaCliente.getSelectedRow() != -1) {

            String nombre =  (String) cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 0);
            String rut = ObtenerRut(nombre);
            String telefono = (String) cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 2);
            String celular = (String) cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 3);
            String correo = (String) cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 4);
            int red = Integer.parseInt(cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 5).toString());
            
            
            Date chosenDate = (Date) cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 6);
            
            
            
            ModificarCliente modificar = new ModificarCliente(nombre, rut, telefono, celular, correo, red, chosenDate);
            modificar.setVisible(true);
        }
           
        

        System.out.println(cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 0));
        System.out.println(cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 1));
    }

    
    public static void mostrar() {
        cl.setVisible(true);

    }
    
    
    public static void main(String[] args) {
        cl.setVisible(true);

    }
    
}
