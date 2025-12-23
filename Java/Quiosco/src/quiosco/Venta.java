
package quiosco;

public class Venta {
    
    private Cliente c;
    private Producto p;

    public Venta(Cliente c, Producto p) {
        this.c = c;
        this.p = p;
    }
    
    public void mostrarVenta(){
        System.out.println("El producto: " + p.getNombre() + "cuesta $" + p.getPrecio() );
        System.out.println("Lo compro el cliente " + c.getNombre() + " " + c.getApellido() );
        System.out.println("");
    }
    
}
