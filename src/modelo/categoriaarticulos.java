/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author usuario
 */
public class categoriaarticulos {
    
    static Connection conn = null;
    
    public categoriaarticulos () {
        
    }

    public PreparedStatement getCatactivos() {
            Conexion cn = new Conexion();
            conn = cn.Conexion();
     
            try{
                    
            String consulta = "select * from categoria_articulos";
            PreparedStatement sentencia= conn.prepareStatement(consulta);

            return sentencia;
            
            }catch(Exception e){
                System.out.println("sdasadda");
            }
        return null;
            
    }
    
}
