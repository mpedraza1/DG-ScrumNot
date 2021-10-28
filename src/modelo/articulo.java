
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static modelo.Banco.conn;

public class articulo {
     public PreparedStatement getBancosActivos() {
            Conexion cn = new Conexion();
            conn = cn.Conexion();
     
            try{
                    
            String consulta = "select codigo_prod,cantidad_prod,categoria_prod,marca_prod,descripcion_prod,fvenc_prod,rut_proveedor,nombre_producto from stock de articulos";
            PreparedStatement sentencia= conn.prepareStatement(consulta);

            return sentencia;
            
            }catch(Exception e){
                System.out.println("sdasadda");
            }
        return null;
            
    }
}
