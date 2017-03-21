/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosDao;

import Utilidades.ConexionBd;
import static Utilidades.ConexionBd.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class DaoAlumno {
     //private Connection conexion=null;
    
    public Connection conexionDaoAlumno () throws ClassNotFoundException, SQLException{
       
        ConexionBd.conexion=null;
        conexion=ConexionBd.conectar();
        return conexion;
        
    }
    
    //Método con parámetro
      public void buscarPorNombre(String nombreBuscado) throws SQLException{
      
      String sql= "select * from Alumno where nombreAlumno=?";
      PreparedStatement buscar=conexion.prepareStatement(sql);
      buscar.setString(1, nombreBuscado);
      ResultSet rs=buscar.executeQuery();
      while (rs.next()){
          System.out.println("Id Alumno:"+rs.getString(1));
          System.out.println("Nombre Alumno:"+rs.getString(2));
          System.out.println("Apellido Alumno:"+rs.getString(3));
          System.out.println("Direccion Alumno"+rs.getString(4));
          System.out.println("Teléfono  Alumno"+rs.getString(5));
          System.out.println("Edad Alumno"+rs.getString(6));
          
      }
      //cerramos el PreparedStatement
      buscar.close();
      //cerramos el resuelt
      rs.close();
      }
      
      public void actualizarPorNombre(String nombreAlumno, int idAlumno) throws SQLException{
     
       String sql="update Alumno set nombreAlumno=? where idAlumno=?";
       PreparedStatement buscar=conexion.prepareStatement(sql);  
       buscar.setString(1, nombreAlumno);
       buscar.setInt(2, idAlumno);
       //executeUpdate devuelve un numero de filas afectadas
       int filasAfectadas=buscar.executeUpdate();
       System.out.println("Filas afectadas:"+filasAfectadas); 
       
     }        
      
      public void borrarRegistro(int idAlumno) throws SQLException{
        
        PreparedStatement buscar=conexion.prepareStatement("delete from Alumno where idAlumno=?");
        buscar.setInt(1, idAlumno);
        int filasAfectadas=buscar.executeUpdate();
        System.out.println("Filas afectadas:"+filasAfectadas); 
     }
      
      public void insertarRegistro (String nombreAlumno, String apellidoAlumno, String direccionAlumno, String telefonoAlumno, int edadAlumno) throws SQLException{
            
          String sql="insert into Alumno(nombreAlumno,apellidoAlumno,direccionAlumno,telefonoAlumno,edadAlumno) values (?,?,?,?,?)";
              PreparedStatement buscar=conexion.prepareStatement(sql);
                    buscar.setString(1,nombreAlumno);
                    buscar.setString(2,apellidoAlumno);
                    buscar.setString(3,direccionAlumno);
                    buscar.setString(4,telefonoAlumno);
                    buscar.setInt(5,edadAlumno);
                    int filasAfectadas=buscar.executeUpdate();
                    System.out.println("Filas Afectadas: "+filasAfectadas);
                    
              }
      
      
       //Método SIN parámetro
      public void listarAlumno () throws SQLException {
      
      String sql="select * from Profesor";
      //El statement es para listas sin parámetros
      Statement stm=null;
      stm=conexion.createStatement();
      //rellenamos la lista de Profesores en un Resultset, on objeto de la clase java sql
      ResultSet rs=stm.executeQuery(sql);
      while(rs.next()){
          
          System.out.println("Id Alumno:"+rs.getString(1));
          System.out.println("Nombre Alumno:"+rs.getString(2));
          System.out.println("Apellido Alumno:"+rs.getString(3));
          System.out.println("Direccion Alumno:"+rs.getString(4));
          System.out.println("Teléfono Alumno:"+rs.getString(5));
          System.out.println("Edad Alumno:"+rs.getString(6));
          
      }
      stm.close();
      rs.close();
      
      
      }
      
      
}
