
package kiosc;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosc {

    public static void main(String[] args) {
    
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        productos.add(new Producto("Gaseosa",80));
        productos.add(new Producto("Chocolate",120));
        productos.add(new Producto("Papas Fritas",70));
        productos.add(new Producto("Alfajor",50));
        productos.add(new Producto("Agua mineral",30));
        
        int opc;
        
        do{
            
            System.out.println("BIENVENIDO AL SISTEMA DE KIOSCO");
            System.out.println(" 1- Cargar pedido  ");
            System.out.println(" 2- Listar todos los pedidos  ");
            System.out.println(" 3- Listar todos los productos  ");
            System.out.println(" 4- Salir  ");
            
            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();
            
            switch(opc){
                
                case 1:
                    
                    for(int i=0; i<productos.size();i++){
                        System.out.println((i+1) + "- " + productos.get(i).getNombre() + " $" + productos.get(i).getPrecio());
                    }
                    
                    System.out.println("Ingrese el producto: ");
                    int opcSeleccionada;
                    
                    opcSeleccionada = sc.nextInt() - 1;
                    sc.nextLine();
                    
                    Producto p = productos.get(opcSeleccionada);
                    
                    System.out.println("Ingrese su nombre: ");
                    String nombre;
                    nombre = sc.nextLine();
                    
                    System.out.println("Ingrese su apellido: ");
                    String apellido;
                    apellido = sc.nextLine();
                    
                    System.out.println("Ingrese su DNI:");
                    int dni;
                    dni = sc.nextInt();
                    sc.nextLine();
                    
                    Cliente c = new Cliente(nombre,apellido ,dni);
                    clientes.add(c);
                    
                    Pedido pe = new Pedido(c,p);
                    pedidos.add(pe);
                    
                    System.out.println("Cargado exitosamente!");
                    
                    break;

                case 2:
                    for(int i=0; i<pedidos.size();i++){
                        System.out.println((i+1)+" ) ");
                        pedidos.get(i).MostrarPedido();
                    }
                    break;
                    
                case 3:
                    for(int i=0; i<productos.size();i++){
                        System.out.println((i+1) + "- " + productos.get(i).getNombre() + " $" + productos.get(i).getPrecio());
                    }
                    break;
                    
                case 4:
                    System.out.println("Adios!");
                    break;
                    
                default:
                    System.out.println("opcion invalida!");
                
            }
            
        }while(opc !=4);
        
    }
    
}
