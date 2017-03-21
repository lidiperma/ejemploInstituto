
package Utilidades;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionBd {
    //variable global
    //los objetos, métodos estáticos son de la Clase, por lo tanto sus
    //Valores son compartidos por los objetos de la clase
    public static Connection conexion=null;
    
      public static Connection conectar () throws ClassNotFoundException, SQLException{
      
          
        
            //Cargar driver para que sea disponible
            //Class.forName("org.sqlite.JDBC");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
                //Pedimos una conexion en la base de datos
                conexion=DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS;"+"databaseName=Instituto3", "sa", "root");
                
                //conexion=DriverManager.getConnection("jdbc:sqlserver://192.168.1.110\\SQL2012EXPRESS_1;"
                  //     +"databaseName=Academia", "sa", "root");

        //Comprobamos que ha realizado la conexion  
        /*if(conexion!=null){
            
            dm=conexion.getMetaData();
            
            System.out.println("Conexion establecida");
            System.out.println("DriverName"+dm.getDriverName());
            System.out.println("DriverVersion"+dm.getDriverVersion());
            System.out.println("DB Name"+dm.getDatabaseProductName());
        }*/
        
        return conexion;
      }
      
public void cerrarConexion() throws SQLException{
      
          conexion.close();
      
      } 
}
