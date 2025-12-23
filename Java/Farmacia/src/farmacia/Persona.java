
package farmacia;

public class Persona {
    
    //1.ATRIBUTOS
    protected String nombre;
    protected String apellido;
    protected int dni;
    
    
    //2.CONSTRUCTOR
    public Persona(String nombre, String apellido, int dni){
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //3.METODOS GETTERS Y SETTERS (en este caso no van, es opcional)
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
}
