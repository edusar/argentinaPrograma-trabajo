

package javaapplication4;


public class Persona {
    public String nombre, apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return ("Nombre: " + nombre + " Apellido: " + apellido);
    }
    
    

}
