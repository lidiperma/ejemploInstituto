
package instituto;

/*
import Gestion.Asignatura;
import Gestion.Curso;
import Humanos.Alumno;
import Humanos.Persona;
import Humanos.Profesor;
import Utilidades.Imprime;
import Utilidades.NivelFormativo;
import java.util.ArrayList;
*/
import EjemplosDao.DaoAlumno;
import EjemplosDao.DaoProfesor;
import Humanos.Alumno;
import Utilidades.ConexionBd;
import java.sql.SQLException;

public class Instituto {

    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Alumno alumno1=new Alumno();
        alumno1.setNombre("Paco");
        alumno1.setApellido("Plaza");
        alumno1.setDireccion("Tarragona");
        alumno1.setTelefono("977000000");
        alumno1.setEdad(22);
        
        //Creo los DAOS
        DaoAlumno daoAlumno=new DaoAlumno();
        daoAlumno.conexionDaoAlumno();
        daoAlumno.insertarRegistro(alumno1.getNombre(), alumno1.getApellido(), alumno1.getDireccion(), alumno1.getTelefono(), alumno1.getEdad());
        
        //DaoProfesor daoProfesor=new DaoProfesor();
        //daoProfesor.conexionDaoProfesor();
        
        //ConexionBd conectar=new ConexionBd();
        //conectar.conectar();
        //conectar.insertarRegistro("Miguel", "Serrano", "Zaragoza", "976000000", 50);
        //conectar.buscarPorNombre("Lidiana");  
        //conectar.actualizarPorNombre("Lidiana","1");
        //conectar.listarProfesores();
        //conectar.borrarRegistro(6);
        
        
        
        
        
        /*
        Asignatura asignatura1=new Asignatura ("Java");
        Asignatura asignatura2=new Asignatura ("SQL");
        Asignatura asignatura3=new Asignatura ("JEE");
        
        
        /*
        Hablitualmente introducimos un nuevo profesor con todos los métodos de Profesor, como siempre
        Profesor profesor1= new Profesor ("Juan");
        */
        //Esta vez vamos a hacerlo con Poliformismo (Consultar en internet)
        /*
        Profesor profesor1= (Profesor) new Persona();
        Alumno alumno1= (Alumno) new Persona();
        //Declaro un objeto Imprime que me genera un nuevo profesor
        Imprime profesor2=new Profesor();
        //Declaro un objeto Persona que me genera un nuevo profesor
        Persona profesor3=new Profesor();
        */
        /*
        //Lista de asignaturas
        ArrayList<Asignatura> listaAsignatura=new ArrayList<>();
        listaAsignatura.add(asignatura1);
        listaAsignatura.add(asignatura2);
        listaAsignatura.add(asignatura3);
        
        //Crea mos profesores y lo seteamos en lugar de utilizar todo el Constructor
        Profesor profesor1=new Profesor ();
        profesor1.setNombre("Manolo");
        profesor1.setListaProfesorAsignatura(listaAsignatura);
        profesor1.setnF(NivelFormativo.TITULADO_SUPERIOR);
        
        Profesor profesor2=new Profesor ();
        profesor2.setNombre("Aurelio");
        profesor2.setListaProfesorAsignatura(listaAsignatura);
        profesor2.setnF(NivelFormativo.TITULADO_MEDIO);
        
        Profesor profesor3=new Profesor ();
        profesor3.setNombre("Avelino");
        profesor3.setListaProfesorAsignatura(listaAsignatura);
        profesor3.setnF(NivelFormativo.BACHILLER);
        
        //Lista de profesores
        ArrayList<Profesor> listaProfesor=new ArrayList<>();
        listaProfesor.add(profesor3);
        listaProfesor.add(profesor2);
        listaProfesor.add(profesor1);
        
        //Alumnos con constructor
        Alumno alumno1=new Alumno("Forum", "Aragon", 30, "Enero", null);
        Alumno alumno2=new Alumno("Patricio", "Esponja", 30, "Enero", null);
        
        //Lista de alumnos
        ArrayList<Alumno> listaAlumno=new ArrayList<>();
        listaAlumno.add(alumno1);
        listaAlumno.add(alumno2);
        
        //El curso lo seteamos pq no tiene constructor
        Curso curso1=new Curso();
        curso1.setNombreCurso("WEB");
        curso1.setFechaInicio("23 de Enero");
        curso1.setFechaFin("22 de Junio");
        curso1.setListaCursoAlumno(listaAlumno);
        curso1.setListaCursoAsignatura(listaAsignatura);
        curso1.setListaCursoPofesor(listaProfesor);
        
        curso1.imprimeAll();
        
        */
        
    }
    
}
