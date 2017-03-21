
package Humanos;

import Utilidades.Imprime;
import java.util.ArrayList;

//Es un POJO pq depende de otros objetos, tiene un ArrayList
public class Alumno extends Persona implements Imprime {
    
    private int idAlumno;
    private String fechaAlta;
    //Establece la relación entre alumnos y profesores
    private ArrayList<Profesor> listaAlumnnoProfesor;
    private String direccion; 
    private String telefono;
    
   
    public Alumno() {
        super();
    }

    public Alumno(String fechaAlta, ArrayList<Profesor> listaAlumnnoProfesor) {
        super();
        this.fechaAlta = fechaAlta;
        this.listaAlumnnoProfesor = listaAlumnnoProfesor;
    }
    
    //Constructor con todo, pero sin ID que es autonumerico, que hereda las propiedades de Persona
    public Alumno(String nombre, String apellido, int edad, String fechaAlta, ArrayList<Profesor> listaAlumnnoProfesor) {
        super(nombre, apellido, edad);
        this.fechaAlta = fechaAlta;
        this.listaAlumnnoProfesor = listaAlumnnoProfesor;
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

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public ArrayList<Profesor> getListaAlumnnoProfesor() {
        return listaAlumnnoProfesor;
    }

    public void setListaAlumnnoProfesor(ArrayList<Profesor> listaAlumnnoProfesor) {
        this.listaAlumnnoProfesor = listaAlumnnoProfesor;
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
