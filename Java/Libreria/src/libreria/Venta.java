package libreria;

public class Venta {
    
    private Cliente c;
    private Libro l;

    public Venta(Cliente c, Libro l) {
        this.c = c;
        this.l = l;
    }
    
    public void mostrarVenta(){    
        System.out.println("El cliente: " + c.getNombre() + " " + c.getApellido());
        System.out.println("compro el libro: " + l.getNombre() + " que cuesta $ " + l.getPrecio());
        System.out.println("");
    }
    
}
