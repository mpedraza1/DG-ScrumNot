package Controlador;

import static Controlador.ClientesController.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import modelo.Conexion;
import vista.Cliente;
import vista.ModificarBanco;

public class ClientesController {

    static Conexion conn = new Conexion();
    public static Cliente cl = new Cliente();

    public static void btnAgregar(String nombre, String rut, String celular, String telefono, String correo, String id, Date chosenDate) {
        Consultas cs = new Consultas();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fecha = sdf.format(chosenDate);
        int celularInt = Integer.parseInt(celular);
        int telefonoInt = Integer.parseInt(telefono);
        int idInt = Integer.parseInt(id);
        cs.doQueryPost("INSERT INTO cliente (rut_cl, nombre_cl, fono_cl, fn_cl, mail_cl, celular_cl, id_red) VALUES ('"+rut+"','"+nombre+"',"+telefonoInt+",'"+fecha+"','"+correo+"',"+celularInt+","+idInt+")");
        
        
                
     //   conn.guardarCliente(nombre, rut, celular, telefono, correo, id);
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

    public static void mostrar() {
        cl.setVisible(true);

    }

    public static void btnModificar() {

        if (cl.tablaCliente.getSelectedRow() != -1) {

            String nombre = (String) cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 0);
            String id = Banco.ObtenerId(nombre);

            int estado = (int) cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 1);

            ModificarBanco modificar = new ModificarBanco(nombre, estado, id);
            modificar.setVisible(true);
        }

        System.out.println(cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 0));
        System.out.println(cl.tablaCliente.getModel().getValueAt(cl.tablaCliente.getSelectedRow(), 1));
    }

   

    public static void btnCrear(String nombre, String rut, String celular, String telefono, String correo, String id) {

        /*conn.guardarCliente(nombre, rut, celular, telefono, correo, id);
        System.out.println(nombre);

    }

    /* public static ResultSet btnEditar() {
        if (!"".equals(nombre) && estado > 0) {
            DefaultTableModel tblModel = new DefaultTableModel();

            Banco banco = new Banco();

            ResultSet bncActivos = banco.getBancoActualiza(estado);

            return bncActivos;
        }
        return null;*/
    }

    public static void main(String[] args) {
        cl.setVisible(true);

    }
/*
    public static void dataRows(JTable tablaCliente) {
        DefaultTableModel table = (DefaultTableModel) tablaCliente.getModel();
        tablaCliente.setModel(table);
        table.setRowCount(0);

        try {

            Consultas cs = new Consultas();
            PreparedStatement sentencia = cl.getBancosActivos();

            ResultSetMetaData rsMd = sentencia.getMetaData();
            int columnSize = rsMd.getColumnCount();

            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                Object[] filas = new Object[columnSize];

                for (int i = 0; i < columnSize; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                table.addRow(filas);
            }

        } catch (SQLException e) {
            System.err.println(e);
        }
     */
}
