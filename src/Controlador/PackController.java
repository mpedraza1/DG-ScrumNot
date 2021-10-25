
package Controlador;

import static Controlador.ClientesController.cl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Consultas;
import vista.ModificarPack;
import vista.Packs;


public class PackController {
    
     static Conexion conn = new Conexion();
    public static Packs ps = new Packs();
    
    public static void btnAgregar(int pack, int codigo, int precio, int articulo, int estado) {

        Consultas cs = new Consultas();
        String SQL = "INSERT INTO packs (nombre_pack, codigo_pack, precio_pack, stock_pack, productos_pack) VALUES('" + pack + "'," + codigo + "," + precio + "," + articulo + "," + estado + ")";

        if (cs.InsertarDatos(SQL)) {
            JOptionPane.showMessageDialog(null, "Pack añadido a la base");
        } else {
            {
                JOptionPane.showMessageDialog(null, "Pack no se pudo añadir a la base");
            }
        }
        System.out.println("##############################");

    }
    
    public static void Rellenar(){
    
        try {
            
            Consultas cs = new Consultas();
            String SQL = "SELECT * FROM packs";
            var tabla = (DefaultTableModel) ps.tablaPacks.getModel();
            tabla.setRowCount(0);
            String datos[] = new String[7];
            
            var rs = cs.PedirDatos(SQL);
            
            while (rs.next()) {
              datos[0] =  rs.getString("nombre_pack");
              datos[1] =  rs.getString("codigo_pack");
              datos[2] =  rs.getString("precio_pack");
              datos[3] =  rs.getString("stock_pack");
              datos[4] =  rs.getString("productos_pack");
              tabla.addRow(datos);
            }
            rs.close();
            
            cl.tablaCliente.setModel(tabla);
            
            
        } catch (SQLException ex) {
            System.out.println("error " + ex);
        }
    
    }
    
    public static boolean ActualizarDatos(int pack, String codigo, int precio, int articulo, int estado) {

        Consultas cs = new Consultas();
        String SQL = "UPDATE packs SET nombre_pack='" + pack + "', precio_pack='" + precio + "', stock_pack='" + articulo + "', productos_pack='" + estado + "' WHERE codigo_pack='" + codigo + "'";

        try {
            cs.InsertarDatos("SET FOREIGN_KEY_CHECKS= 0");
            cs.InsertarDatos(SQL);
            cs.InsertarDatos("SET FOREIGN_KEY_CHECKS= 1");
            System.out.println(SQL);

        } catch (Exception ex) {

        }
        return true;
    }
    public ResultSet Actualizacion(int pack, String codigo, int precio, int articulo, int estado) {

        Consultas cs = new Consultas();
        String SQL = "SELECT nombre_pack, precio_pack, productos_pack, stock_pack FROM packs WHERE codigo = ?";

        try {
            cs.PedirDatos(SQL);

        } catch (Exception e) {
            System.out.println("Actualizado");
        }
        return null;
    }
    
    public static String ObtenerCodigo(int pack) {

        Consultas cs = new Consultas();
        String SQL = "SELECT codigo_pack FROM packs WHERE nombre_pack=" + pack + "";
        try {

            String codigo = "";

            cs.PedirDatos(SQL);
            ResultSet rs = cs.PedirDatos(SQL);
            if (rs.next()) {
                codigo = rs.getString("codigo_pack");
            }
         
            return codigo;
        } catch (Exception ex) {
        }
        return null;
    }
    
    public static void btnModificar() {

        if (ps.tablaPacks.getSelectedRow() != -1) {

            int pack = Integer.parseInt(ps.tablaPacks.getModel().getValueAt(ps.tablaPacks.getSelectedRow(), 0).toString());
            String codigo = ObtenerCodigo(pack);
            int precio = Integer.parseInt(ps.tablaPacks.getModel().getValueAt(ps.tablaPacks.getSelectedRow(), 2).toString());
            int articulo = Integer.parseInt(ps.tablaPacks.getModel().getValueAt(ps.tablaPacks.getSelectedRow(), 3).toString());
            int estado = Integer.parseInt(ps.tablaPacks.getModel().getValueAt(ps.tablaPacks.getSelectedRow(), 4).toString());

            ModificarPack modificar = new ModificarPack(pack, codigo,precio, articulo, estado);
            modificar.setVisible(true);
        }

        System.out.println(ps.tablaPacks.getModel().getValueAt(ps.tablaPacks.getSelectedRow(), 0));
        
    }
    
    
     public static void main(String[] args) {
        ps.setVisible(true);

    }
}
