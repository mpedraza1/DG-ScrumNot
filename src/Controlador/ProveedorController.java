
package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Consultas;
import vista.ModificarProveedor;
import vista.Proveedor;


public class ProveedorController {
    
    static Conexion conn = new Conexion();
    public static Proveedor pv = new Proveedor();
    
    
    public static void btnAgregar(String razon, String rut, String nombre, String direccion, String correo, String telefono) {

        Consultas cs = new Consultas();
        String SQL = "INSERT INTO proveedores (rut_proveedor, razon_social, direccion_proveedor, nombre_contacto, fono_contacto, mail_contacto) VALUES('" + rut + "','" + razon + "','" + direccion + "','" + nombre + "','" + correo + "','" + telefono + "')";
        
        
        
        if (cs.InsertarProveedor(SQL)) {
            JOptionPane.showMessageDialog(null, "Proveedor añadido a la base");
        } else {
            {
                JOptionPane.showMessageDialog(null, "Proveedor no se pudo añadir a la base");
            }
        }
         System.out.println("###############");
         
    }
         
         
       public static void Rellenar() {

        try {

            Consultas cs = new Consultas();
            String SQL = "SELECT * FROM proveedores";
            var tabla = (DefaultTableModel) pv.tablaProveedor.getModel();
            tabla.setRowCount(0);
            String datos[] = new String[6];
            
            var rs = cs.PedirDatos(SQL);

            while (rs.next()) {
                datos[0] = rs.getString("razon_social");
                datos[1] = rs.getString("rut_proveedor");
                datos[2] = rs.getString("nombre_contacto");
                datos[3] = rs.getString("direccion_proveedor");
                datos[4] = rs.getString("fono_contacto");
                datos[5] = rs.getString("mail_contacto");

                tabla.addRow(datos);
            }
            rs.close();

            pv.tablaProveedor.setModel(tabla);

        } catch (SQLException ex) {
            System.out.println("error " + ex);
        }

    }
    
    public static boolean ActualizarDatos(String razon, String rut, String nombre, String direccion, String correo, String telefono) {

        Consultas cs = new Consultas();
        String SQL = "UPDATE proveedores SET razon_social='" + razon + "', direccion_proveedor='" + direccion + "', nombre_contacto='" + nombre + "', fono_contacto='" + telefono + "', mail_contacto'" + correo + "' WHERE rut_proveedor =" + rut;

        try {
            cs.InsertarDatos(SQL);
            System.out.println(SQL);

        } catch (Exception ex) {

        }
        return true;
    }
    
    public ResultSet Actualizacion(String razon, String rut, String nombre, String direccion, String telefono, String correo) {

        Consultas cs = new Consultas();
        String SQL = "SELECT razon_social, direccion_proveedor, nombre_contacto, fono_contacto, mail_contacto FROM proveedores WHERE rut_proveedor  = ?";

        try {
            cs.PedirDatos(SQL);

        } catch (Exception e) {
            System.out.println("Actualizado");
        }
        return null;
    }

    public static String ObtenerRut(String razon) {

        Consultas cs = new Consultas();
        String SQL = "SELECT rut_proveedor FROM proveedores WHERE razon_social='" + razon + "'";
        try {

            String rut = "";

            cs.PedirDatos(SQL);
            ResultSet rs = cs.PedirDatos(SQL);
            if (rs.next()) {
                rut = rs.getString("rut_proveedor");
            }

            return rut;
        } catch (Exception ex) {
        }
        return null;
    }
    
    public static void btnModificar() {

        if (pv.tablaProveedor.getSelectedRow() != -1) {

            String razon =  (String) pv.tablaProveedor.getModel().getValueAt(pv.tablaProveedor.getSelectedRow(), 0);
            String rut = ObtenerRut(razon);
            String nombre = (String) pv.tablaProveedor.getModel().getValueAt(pv.tablaProveedor.getSelectedRow(), 1);
            String direccion = (String) pv.tablaProveedor.getModel().getValueAt(pv.tablaProveedor.getSelectedRow(), 2);
            String correo = (String) pv.tablaProveedor.getModel().getValueAt(pv.tablaProveedor.getSelectedRow(), 3);
            String telefono = (String) pv.tablaProveedor.getModel().getValueAt(pv.tablaProveedor.getSelectedRow(), 4);
           
            ModificarProveedor modificar = new ModificarProveedor(razon, rut, nombre, direccion, correo, telefono);
            modificar.setVisible(true);
        }

        System.out.println(pv.tablaProveedor.getModel().getValueAt(pv.tablaProveedor.getSelectedRow(), 0));
    }

    public static void main(String[] args) {
        pv.setVisible(true);

    }
    
    }


         
    

