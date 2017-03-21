
package EjemplosDao;

import Utilidades.ConexionBd;
import static Utilidades.ConexionBd.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DaoProfesor {
    
    //private Connection conexion=null;
    
    public Connection conexionDaoProfesor () throws ClassNotFoundException, SQLException{
       
        ConexionBd.conexion=null;
        conexion=ConexionBd.conectar();
        return conexion;
        
    }
    
    //Método con parámetro
      public void buscarPorNombre(String nombreBuscado) throws SQLException{
      
      String sql= "select * from Profesor where nombreProfesor=?";
      PreparedStatement buscar=conexion.prepareStatement(sql);
      buscar.setString(1, nombreBuscado);
      ResultSet rs=buscar.executeQuery();
      while (rs.next()){
          System.out.println("Id Profesor:"+rs.getString(1));
          System.out.println("NombreProfesor:"+rs.getString(2));
          System.out.println("Apellido Profesor:"+rs.getString(3));
          System.out.println("Direccion Profesor"+rs.getString(4));
          System.out.println("Teléfono  Profesor"+rs.getString(5));
          System.out.println("Edad Profesor"+rs.getString(6));
          
      }
      //cerramos el PreparedStatement
      buscar.close();
      //cerramos el resuelt
      rs.close();
      }
      
      public void actualizarPorNombre(String nombreProfesor, int idProfesor) throws SQLException{
     
       String sql="update Profesor set nombreProfesor=? where idProfesor=?";
       PreparedStatement buscar=conexion.prepareStatement(sql);  
       buscar.setString(1, nombreProfesor);
       buscar.setInt(2, idProfesor);
       int filasAfectadas=buscar.executeUpdate();
       System.out.println("Filas afectadas:"+filasAfectadas); 
       
     }        
      
      public void borrarRegistro(int idProfesor) throws SQLException{
        
        PreparedStatement buscar=conexion.prepareStatement("delete from Profesor  where idProfesor=?");
        buscar.setInt(1, idProfesor);
        int filasAfectadas=buscar.executeUpdate();
        System.out.println("Filas afectadas:"+filasAfectadas); 
     }
      
      public void insertarRegistro (String nombreProfesor, String apellidoProfesor, String direccionPorfesor, String telefonoPorfesor, int edadProfesor) throws SQLException{
            
          String sql="insert into Profesor(nombreProfesor,apellidoProfesor,direccionPorfesor,telefonoPorfesor,edadProfesor) values (?,?,?,?,?)";
              PreparedStatement buscar=conexion.prepareStatement(sql);
                    buscar.setString(1,nombreProfesor);
                    buscar.setString(2,apellidoProfesor);
                    buscar.setString(3,direccionPorfesor);
                    buscar.setString(4,telefonoPorfesor);
                    buscar.setInt(5,edadProfesor);
                    int filasAfectadas=buscar.executeUpdate();
                    System.out.println("Filas Afectadas: "+filasAfectadas);
              }
      
      
       //Método SIN parámetro
      public void listarProfesores () throws SQLException {
      
      String sql="select * from Profesor";
      //El statement es para listas sin parámetros
      Statement stm=null;
      stm=conexion.createStatement();
      //rellenamos la lista de Profesores en un Resultset, on objeto de la clase java sql
      ResultSet rs=stm.executeQuery(sql);
      while(rs.next()){
          
          System.out.println("Id Profesor:"+rs.getString(1));
          System.out.println("NombreProfesor:"+rs.getString(2));
          System.out.println("Apellido Profesor:"+rs.getString(3));
          System.out.println("Direccion Profesor"+rs.getString(4));
          System.out.println("Teléfono  Profesor"+rs.getString(5));
          System.out.println("Edad Profesor"+rs.getString(6));
          
      }
      stm.close();
      rs.close();
      
      
      }
      
      public void cerrarConexion() throws SQLException{
      
          conexion.close();
      
      } 
    
}
