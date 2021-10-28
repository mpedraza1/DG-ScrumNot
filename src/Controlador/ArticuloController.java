
package Controlador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Consultas;
import vista.Articulo;

public class ArticuloController {
    static Connection con;
    static Conexion conn = new Conexion();
    public static Articulo ar = new Articulo();

    public static void mostrar() {
        ar.setVisible(true);
    }

    public static void btnCrear( String txtcodigo,int txtcantidad ,JComboBox cbxcat ,String txtmarca , String txtdescripcion,String txtven , String txtrut, String txtnombre) {

        Consultas cs = new Consultas();
        String SQL = "INSERT INTO stock de articulos (codigo_prod, cantidad_prod,categoria_prod,marca_prod,descripcion_prod,fvenc_prod,rut_proveedor,nombre_prod) VALUES"
                + " ("+ txtcodigo +","+ txtcantidad + ","+ cbxcat +","+ txtmarca +","+ txtdescripcion+","+ txtven +", "+txtrut +","+txtnombre+")"; 

        if (cs.InsertarDatos(SQL)) {
            JOptionPane.showMessageDialog(null, "Articulo añadido a la base");
        } else {
            {
                JOptionPane.showMessageDialog(null, "Articulo no se pudo añadir a la base");
            }
        }

        System.out.println("##########");
    }
    
    
    
    
    
    
    
    
}
