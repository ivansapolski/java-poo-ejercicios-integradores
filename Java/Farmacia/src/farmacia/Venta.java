
package farmacia;

public class Venta {

    private Producto p;
    private Cliente c;
    
    
    public Venta(Producto p, Cliente c){
        
    this.p = p;
    this.c = c;
   
}
    
   public void mostrarVenta(){
       
       System.out.println("Producto: " + p.getNombre() + "| Precio: " + p.getPrecio());
       System.out.println("Cliente : ");
       System.out.println("Nombre: " + c.nombre + "| Apellido: " + c.apellido);
       System.out.println("");
   }
    
}
