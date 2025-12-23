
package quiosco;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiosco {

    
    public static void main(String[] args) {
        
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Venta> ventas = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        
        productos.add(new Producto("Gaseosa",30));
        productos.add(new Producto("Agua",40));
        productos.add(new Producto("Galletitas",50));
        productos.add(new Producto("Chocolate",20));
        productos.add(new Producto("Caramelos",70));
        
        int opc;
        int opcSelec;
        
        Scanner sc = new Scanner(System.in);
        
        do{
            
            System.out.println("BIENVENIDO AL QUIOSQUITO");
            System.out.println("1-Cargar venta \n2-Listar todas las ventas");
            System.out.println("3-Listar todos los productos \n4-Salir ");
            
            opc = sc.nextInt();
            sc.nextLine();
            
            switch(opc){
                case 1:
                    for(int i=0 ; i<productos.size() ; i++){
                        
                        System.out.println((i+1) + "-" + productos.get(i).getNombre() + "cuesta: " + productos.get(i).getPrecio() );
                    }
                    
                    System.out.println("Seleccione el producto: ");
                    opcSelec = sc.nextInt() - 1;
                    sc.nextLine();
                    
                    Producto p = productos.get(opcSelec);       //SIN NEW, NO ES NADA NUEVO
                    
                    System.out.println("Ingrese nombre: ");
                    String nombre;
                    nombre = sc.nextLine();
                    
                    System.out.println("Ingrese apellido: ");
                    String apellido;
                    apellido = sc.nextLine();
                    
                    System.out.println("Ingrese dni: ");
                    int dni;
                    dni = sc.nextInt();
                    sc.nextLine();
                    
                    
                    Cliente c = new Cliente(nombre,apellido,dni);
                    clientes.add(c);
                    
                    Venta v = new Venta(c,p);
                    ventas.add(v);
                    
                    System.out.println("Cargado exitosamente!");
                    break;
                    
                case 2:
                    System.out.println("Las ventas hasta ahora son: ");
                    
                    for(int i=0;i<ventas.size();i++){
                        System.out.println((i+1)+" )  ");
                        ventas.get(i).mostrarVenta();
                    }
                    break;
                    
                case 3:
                    System.out.println("LOS PRODUCTOS SON: ");
                    for(int i=0 ; i<productos.size() ; i++){
                        System.out.println((i+1) + "-" + productos.get(i).getNombre() + "cuesta: " + productos.get(i).getPrecio() );
                    }
                    break;
                    
                case 4:
                    System.out.println("Adios!");
                    break;
                    
                default:
                    System.out.println("Opcion invalida!");
            }
            
        }while(opc!=4);

    }
    
}
