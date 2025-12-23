
package farmacia;

import java.util.ArrayList;
import java.util.Scanner;

public class Farmacia {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList <Producto> productos = new ArrayList<>();     //CREAMOS LOS ARRAY (nombre minuscula y plural)
        ArrayList <Cliente> clientes = new ArrayList<>();
        ArrayList <Venta> ventas = new ArrayList<>();
        
        productos.add(new Producto("Ibuprofeno",180));          //HARDCODEAMOS LOS Producto
        productos.add(new Producto("Paracetamol",720));
        productos.add(new Producto("Aspirina",555));
        productos.add(new Producto("Omeprazol",321));
        productos.add(new Producto("Rivotril",290));
        
        int opcion;
        
        do{
            
            System.out.println("Bienvenido al sistema farmacia");
            System.out.println("1-Cargar venta");
            System.out.println("2-Listar todas las ventas");
            System.out.println("3-Listar todos los productos");
            System.out.println("4-Terminar venta");
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
                case 1:
                    
                    //Mostramos productos disponibles
                    for(int i=0;i< productos.size();i++){
                        System.out.println((i+1)+ "-" + productos.get(i).getNombre() ); 
                    }
                    
                    System.out.println("Seleccione su producto: ");
                    int prodSeleccionado = sc.nextInt()-1;
                    sc.nextLine();
                    
                    Producto p = productos.get(prodSeleccionado);       //Temporal para guardar los valores
                    
                    System.out.println("Ingrese su DNI: ");
                    int dni = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Ingrese su nombre");
                    String nombre = sc.nextLine();
                    
                    System.out.println("Ingrese su apellido");
                    String apellido = sc.nextLine();
                    
                    Cliente c = new Cliente(nombre,apellido,dni);   //Creamos cliente con los valores pedidos 
                    clientes.add(c);                                //Agregamos al Arrray clientes
                    
                    Venta v = new Venta(p,c);                       //Creamos temp con los valores de producto y cliente 
                    ventas.add(v);                                  //Agregamos al array ventas
                            
                    System.out.println("Su venta es: " + p.getNombre() + " con el precio de " + p.getPrecio());
                    System.out.println("Cliente:");
                    System.out.println("Nombre: " + c.nombre + " Apellido: " + c.apellido);
                    break;
                    
                case 2:
                    
                    System.out.println("Las ventas hasta el momento son: ");
                    for(int i=0;i < ventas.size();i++){
                        System.out.println((i+1)+ ") ");
                        ventas.get(i).mostrarVenta();
                    }
                    
                    break;
                    
                case 3:
                    System.out.println("Los productos son:");
                    for(int i=0;i<productos.size();i++){
                        System.out.println((i+1)+" - "+ productos.get(i).getNombre());
                    }
                    break;
                    
                case 4:
                    System.out.println("Adios!");
                    break;
                    
                default:
                    System.out.println("Opcion invalida");
            }
            
        }while(opcion!=4);
        
        sc.close();
        
    }
    
}
