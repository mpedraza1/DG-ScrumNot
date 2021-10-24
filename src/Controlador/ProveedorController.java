
package Controlador;

import static Controlador.ClientesController.cl;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Consultas;
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
         
         
         public static void Rellenar(){
    
        try {
            
            Consultas cs = new Consultas();
            String SQL = "SELECT * FROM PROVEEDORES";
            var tabla = (DefaultTableModel) pv.tablaProveedor.getModel();
            tabla.setRowCount(0);
            String datos[] = new String[6];
            
            var rs = cs.PedirDatos(SQL);
            
            
            while (rs.next()) {
              datos[0] =  rs.getString("rut_proveedor");
              datos[1] =  rs.getString("razon_social");
              datos[2] =  rs.getString("direccion_proveedor");
              datos[3] =  rs.getString("nombre_contacto");
              datos[4] =  rs.getString("fono_contacto");
              datos[5] =  rs.getString("mail_contacto");
              
              tabla.addRow(datos);
            }
            rs.close();
            
            pv.tablaProveedor.setModel(tabla);
            
            
        } catch (SQLException ex) {
            System.out.println("error " + ex);
        }
    
         }
         
        public static void main(String[] args) {
        pv.setVisible(true);

    }
        
    }
         
    

