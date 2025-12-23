package libreria;

public class Libro {
    private String nombre;                             //ATRIBUTO
    private double precio;

    public Libro(String nombre, double precio) {       //CONSTRUCTOR
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {                         //GETTERS
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
}
