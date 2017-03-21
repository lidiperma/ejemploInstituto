
package Humanos;
//El ArrayList llama a Asignatura
import Gestion.Asignatura;
import Utilidades.Imprime;
//Importamos Enum
import Utilidades.NivelFormativo;
import java.util.ArrayList;


public class Profesor extends Persona implements Imprime {
 
    private int idProfesor;
    private String direccion; 
    private String telefono;
    private Enum<NivelFormativo> nF;
    //Relación entre profesores y asignaturas
    private ArrayList<Asignatura> listaProfesorAsignatura;

    public Profesor() {
        super();
    }

    public Profesor(String direccion, String telefono, Enum<NivelFormativo> nF, ArrayList<Asignatura> listaProfesorAsignatura, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.direccion = direccion;
        this.telefono = telefono;
        this.nF = nF;
        this.listaProfesorAsignatura = listaProfesorAsignatura;
    }

    
    public ArrayList<Asignatura> getListaProfesorAsignatura() {
        return listaProfesorAsignatura;
    }

    public void setListaProfesorAsignatura(ArrayList<Asignatura> listaProfesorAsignatura) {
        this.listaProfesorAsignatura = listaProfesorAsignatura;
    }
    
    public Enum<NivelFormativo> getnF() {
        return nF;
    }

    public void setnF(Enum<NivelFormativo> nF) {
        this.nF = nF;
    }
    
    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void imprimeAlumnoProfesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeProfesorAsignatura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeCursoProfesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeCursoAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeCursoAsignatura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeCursoCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
