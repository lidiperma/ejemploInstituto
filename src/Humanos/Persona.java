/*
Esto es un POJO.
Un POJO es una instancia de una clase que extiende o implementa.
Puede tener lógica de negocio.
 */
package Humanos;

public class Persona extends Humano{
    
    private int idPersona;
    private String nombre;
    private String apellido;
    private int edad;

    //Constructor vacio
    public Persona() { 
    }
    //Constructor de la SUPERCLASE para Alumno y para Profesor con parámetros
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
