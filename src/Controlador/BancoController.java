package Controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Consultas;
import vista.Bancos;
import vista.ModificarBanco;

public class BancoController {

    static Connection con;
    static Conexion conn = new Conexion();
    public static Bancos bc = new Bancos();

    public static void mostrar() {
        bc.setVisible(true);
    }

    public static void btnCrear(String nombre, int status) {

        Consultas cs = new Consultas();
        String SQL = "INSERT INTO bancos (nombre_banco, estado_banco) VALUES('" + nombre + "'," + status + ")";

        if (cs.InsertarDatos(SQL)) {
            JOptionPane.showMessageDialog(null, "Banco añadido a la base");
        } else {
            {
                JOptionPane.showMessageDialog(null, "Banco no se pudo añadir a la base");
            }
        }

        System.out.println("##########");
    }

    public static void Rellenar() {

        Consultas cs = new Consultas();
        String SQL = "SELECT * FROM BANCOS";

        try {

            var tabla = (DefaultTableModel) bc.tablaBanco.getModel();
            tabla.setRowCount(0);
            String datos[] = new String[2];

            var rs = cs.PedirDatos(SQL);

            while (rs.next()) {
                datos[0] = rs.getString("nombre_banco");
                datos[1] = rs.getString("estado_banco");

                tabla.addRow(datos);
            }
            rs.close();

            bc.tablaBanco.setModel(tabla);

        } catch (SQLException ex) {
            System.out.println("error " + ex);
        }
    }

    public static boolean ActualizarDatos(String nombre, int status, String id) {

        Consultas cs = new Consultas();
        String SQL = "UPDATE bancos SET nombre_banco='" + nombre + "',estado_banco=" + status + " WHERE id_banco=" + id;

        try {
            cs.InsertarDatos(SQL);
            System.out.println(SQL);

        } catch (Exception ex) {

        }
        return true;
    }

    public ResultSet Actualizacion(String nombre, int status, int id) {

        Consultas cs = new Consultas();
        String SQL = "SELECT nombre_banco,estado_banco FROM bancos WHERE id = ?";

        try {
            cs.PedirDatos(SQL);

        } catch (Exception e) {
            System.out.println("sdasadda");
        }
        return null;
    }

    public static String ObtenerId(String banco) {

        Consultas cs = new Consultas();
        String SQL = "SELECT id_banco FROM bancos WHERE nombre_banco='" + banco + "'";
        try {

            String id = "";

            cs.PedirDatos(SQL);
            ResultSet rs = cs.PedirDatos(SQL);
            if (rs.next()) {
                id = rs.getString("id_banco");
            }

            return id;
        } catch (Exception ex) {
        }
        return null;
    }

    public static void btnModificar() {

        if (bc.tablaBanco.getSelectedRow() != -1) {

            String nombre = (String) bc.tablaBanco.getModel().getValueAt(bc.tablaBanco.getSelectedRow(), 0);
            String id = ObtenerId(nombre);

            int estado = Integer.parseInt(bc.tablaBanco.getModel().getValueAt(bc.tablaBanco.getSelectedRow(), 1).toString());

            ModificarBanco modificar = new ModificarBanco(nombre, estado, id);
            modificar.setVisible(true);
        }

        System.out.println(bc.tablaBanco.getModel().getValueAt(bc.tablaBanco.getSelectedRow(), 0));
        
    }

    public static void main(String[] args) {
        bc.setVisible(true);
    }
}
