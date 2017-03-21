
package Gestion;
/*
Esto si es un JAVABEANS puro y duro.
Un JavaBean (o también conocido simplemente como Bean) es una clase simple 
en Java que cumple con ciertas normas con los nombres de sus propiedades y métodos.
Es la capa más cercana en las capas de programación para acceder a la base 
de datos: No puede tener lógica de negocio(operaciones matemáticas)
Seguir leyendo en: 
http://carlospesquera.com/que-es-un-pojo-ejb-y-un-bean/
*/
public class Asignatura {
    
    private int IdAsignatura;
    private String nombreAsignatura;

    //Constructor vacio
    public Asignatura() {
        
    }
    //Constructor con solo nombreAsignatura pq el ID es autonumerico
    public Asignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
    

    public int getIdAsignatura() {
        return IdAsignatura;
    }

    public void setIdAsignatura(int IdAsignatura) {
        this.IdAsignatura = IdAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
    
    
}
