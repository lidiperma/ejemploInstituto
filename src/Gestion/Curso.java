
package Gestion;

import Humanos.Alumno;
import Humanos.Profesor;
import Utilidades.Imprime;
import java.util.ArrayList;


public class Curso implements Imprime{
    
    private int idCurso;
    private String nombreCurso;
    private String fechaInicio;
    private String fechaFin;
    //Relaciones alumnos, asignatura y profesores para realizar un listado
    private ArrayList<Profesor> listaCursoPofesor;
    private ArrayList<Alumno> listaCursoAlumno;
    private ArrayList<Asignatura> listaCursoAsignatura;

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Profesor> getListaCursoPofesor() {
        return listaCursoPofesor;
    }

    public void setListaCursoPofesor(ArrayList<Profesor> listaCursoPofesor) {
        this.listaCursoPofesor = listaCursoPofesor;
    }

    public ArrayList<Alumno> getListaCursoAlumno() {
        return listaCursoAlumno;
    }

    public void setListaCursoAlumno(ArrayList<Alumno> listaCursoAlumno) {
        this.listaCursoAlumno = listaCursoAlumno;
    }

    public ArrayList<Asignatura> getListaCursoAsignatura() {
        return listaCursoAsignatura;
    }

    public void setListaCursoAsignatura(ArrayList<Asignatura> listaCursoAsignatura) {
        this.listaCursoAsignatura = listaCursoAsignatura;
    }

    @Override
    public void imprimeAlumnoProfesor() {
        
    }
    
    @Override
    public void imprimeProfesorAsignatura() {
        
    }

    @Override
    public void imprimeCursoProfesor() {
        //imprimeCursoCurso();
        
        System.out.println("Datos del curso: "+this.getNombreCurso());
        
        for (int i = 0; i < listaCursoPofesor.size(); i++) {
            Profesor profesor = listaCursoPofesor.get(i);
            
            System.out.println("Listado de profesores del curso: "+profesor.getNombre()+" "+profesor.getApellido());
            //Podemos pedir el más cosas
            
        }
    
    }

    @Override
    public void imprimeCursoAlumno() {
        //imprimeCursoCurso();
        
        System.out.println("Datos del curso: "+this.getNombreCurso());
        
        for (int i = 0; i < listaCursoAlumno.size(); i++) {
            Alumno alumno  = listaCursoAlumno.get(i);
            
            System.out.println("Listado de alumno del curso: "+alumno.getNombre()+" "+alumno.getApellido());
            
        }
        
    }

    @Override
    public void imprimeCursoAsignatura() {
        //imprimeCursoCurso();
        
        System.out.println("Datos del curso: "+this.getNombreCurso());
        
        for (int i = 0; i < listaCursoAsignatura.size(); i++) {
            Asignatura asignatura = listaCursoAsignatura.get(i);
            
            System.out.println("Listado de asignaturas del curso: "+asignatura.getNombreAsignatura());
            
        }
       
    }
    
    @Override
    public void imprimeCursoCurso() {
        
        System.out.println("Nombre del curso: "+this.getNombreCurso());
        System.out.println("Fecha de inicio del curso: "+this.getFechaInicio());
        System.out.println("Fecha de fin: "+this.getFechaFin());
    }

    @Override
    public void imprimeAll() {
        //Imprime solo datos del curso
        imprimeCursoCurso();
        //Imprime Profesores del curso
        imprimeCursoProfesor();
        //Imprime Alumnos del curso
        imprimeCursoAlumno();
        //Imprime Asignaturas del curso
        imprimeCursoAsignatura();
        
    }

    public void imprimirAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
