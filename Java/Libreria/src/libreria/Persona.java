package libreria;

public class Persona {
    
    private String nombre;
    private String apellido;                                     //ATRIBUTOS
    private int dni;

    public Persona(String nombre, String apellido, int dni) {   //CONSTRUCTOR
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
   
    public String getNombre() {                                 //GETTERS
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }
    
}