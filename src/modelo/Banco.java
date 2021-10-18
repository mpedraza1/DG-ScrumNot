
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Banco {
    Connection conn = null;
    private String banco;
    private String estado;
    public DefaultTableModel modelo;

    @Override
    public String toString() {
        return "Banco{" + "banco=" + banco + ", estado=" + estado + '}';
    }
    
    public Banco (String banco, String estado) {
        this.banco = banco;
        this.estado = estado;
        this.modelo = new DefaultTableModel();
    }
    public Banco () {
        
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public PreparedStatement getBancosActivos() {
            Conexion cn = new Conexion();
            Connection cnn = cn.Conexion();
     
            try{
                    
            String consulta = "select nombre_banco,estado_banco from bancos";
            PreparedStatement sentencia= cnn.prepareStatement(consulta);

            return sentencia;
            
            }catch(Exception e){
                System.out.println("sdasadda");
            }
        return null;
            
    }
    
        public ResultSet getBancoActualiza(int id) {
            Conexion cn = new Conexion();
            Connection cnn = cn.Conexion();
     
            try{
                    
            String consulta = "select nombre_banco,estado_banco from bancos WHERE id = ?";
            PreparedStatement sentencia= cnn.prepareStatement(consulta);
            sentencia.setInt(1, id);
            ResultSet rs = sentencia.executeQuery();
            return rs;
            
            }catch(Exception e){
                System.out.println("sdasadda");
            }
        return null;
            
    }
}

       
         //PreparedStatement pstmt = con.prepareStatement("select * from bancos");


       //modelo.addRow(new Object[]{this.banco});
    

    


      
    
       
       
       
    







               

        
    
    


