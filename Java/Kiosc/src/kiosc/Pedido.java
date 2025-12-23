
package kiosc;


public class Pedido {

    private Cliente c;
    private Producto p;

    public Pedido(Cliente c, Producto p) {
        this.c = c;
        this.p = p;
    }
    
    
    
    public void MostrarPedido(){
        System.out.println("El cliente :" + c.getNombre() + " " + c.getApellido());
        System.out.println("El producto: " + p.getNombre() + " tiene el precio: " + p.getPrecio() );
        System.out.println("");
    }
    
    
}
