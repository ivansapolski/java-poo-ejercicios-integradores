package libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class Libreria {

    public static void main(String[] args) {
     
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Venta> ventas = new ArrayList<>();
        
        libros.add(new Libro("Matematica",180));
        libros.add(new Libro("Programacion",320));
        libros.add(new Libro("Base Datos",560));
        libros.add(new Libro("Redes",10));
        libros.add(new Libro("Sistema Operativo",190));
        
        Scanner sc = new Scanner(System.in);
        int opc;
        int opcSelec;
        
        do{
            System.out.println("BIENVENIDO A LA LIBRERIA: ");
            System.out.println("1- Cargar venta ");
            System.out.println("2- Listar todas las ventas ");
            System.out.println("3- Listar todos los libros ");
            System.out.println("4- Salir ");
            
        opc = sc.nextInt();
        sc.nextLine();
            
        switch(opc){
            case 1:
                //Lista productos
                for(int i=0;i<libros.size();i++){
                    System.out.println((i+1)+"- " + libros.get(i).getNombre() + "con el precio $" +libros.get(i).getPrecio() );
                }
                
                System.out.println("Ingrese el libro que desea: ");
                
                opcSelec = sc.nextInt() - 1;
                sc.nextLine();
                
                Libro l = libros.get(opcSelec);
                //libros.add(l);    NO VA, YA QUE NO AGREGAMOS NUEVOS LIBROS.
                
                System.out.println("Ingrese nombre: ");
                String nombre;
                nombre = sc.nextLine();
                
                System.out.println("Ingrese apellido; ");
                String apellido;
                apellido = sc.nextLine();
                
                System.out.println("Ingrese dni: ");
                int dni;
                dni = sc.nextInt();
                sc.nextLine();
                
                Cliente c = new Cliente(nombre,apellido,dni);
                clientes.add(c);
                
                Venta v = new Venta(c,l);
                ventas.add(v);
                
                System.out.println("Agregado con exito!");
                break;
                
            case 2:
                
                if(ventas.isEmpty()){
                    
                    System.out.println("Sin ventas :(  ");
                    
                }else{
                    
                    for(int i=0;i<ventas.size();i++){
                        System.out.println((i+1)+") ");
                        ventas.get(i).mostrarVenta();
                    }
                    
                }
                break;
                
            case 3:
                System.out.println("LISTA DE LIBROS:");
                for(int i=0;i<libros.size();i++){
                    System.out.println((i+1)+"- " + libros.get(i).getNombre() + "con el precio $" +libros.get(i).getPrecio() );
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
