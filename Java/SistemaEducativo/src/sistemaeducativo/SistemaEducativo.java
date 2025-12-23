
package sistemaeducativo;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEducativo {

    public static void main(String[] args) {
       
        ArrayList <Estudiante> estudiantes = new ArrayList<>();
        ArrayList <Curso> cursos = new ArrayList<>();
        ArrayList <Inscripcion> inscripciones = new ArrayList<>();
        ArrayList <String> modalidades = new ArrayList<>();
        
        cursos.add(new Curso("Programacion Java","Virtual"));
        cursos.add(new Curso("Diseno Grafico","Semipresencial"));
        cursos.add(new Curso("Marketin Digital","Virtual"));
        cursos.add(new Curso("Redes informaticas","Presencial"));
        cursos.add(new Curso("Administracion de Empresas","Presencial"));
        
        modalidades.add("Virtual");
        modalidades.add("Presencial");
        modalidades.add("Semipresencial");
        
        int opc;
        int opcSelec;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("--- BIENVENIDO AL SISTEMA DE INSCRIPCIONES ---");
        do{
            System.out.println("\nQue quiere hacer ");
            System.out.println("1-Cargar inscripcion");
            System.out.println("2-Listar todas las inscripciones");
            System.out.println("3-Listar todos los cursos disponibles");
            System.out.println("4-Cargar todas las modalidades");
            System.out.println("5-Terminar programa \n");
            System.out.println("opcion: ");
            opc = sc.nextInt();
            sc.nextLine();
            
            switch(opc){
                case 1:
                    
                    for(int i=0; i<cursos.size(); i++){
                        System.out.println((i+1) + "- " + cursos.get(i).getNombre() );
                    }
                    
                    System.out.println("Seleccione su curso: ");
                    opcSelec = sc.nextInt() - 1;
                    sc.nextLine();
                    
                    System.out.println("1-Presencial \n2-Virtual \n3-Semipresencial");
                    System.out.println("Seleccione la modalidad:");
                    
                    int opcModalidad = sc.nextInt() - 1;
                    sc.nextLine();
                    
                    String modalidad = modalidades.get(opcModalidad);
                    
                    Curso c = cursos.get(opcSelec);
                    
                    System.out.println("Porfavor");
                    System.out.println("Ingrese su dni: ");
                    int dni = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Ingrese su apellido: ");
                    String apellido = sc.nextLine();
                    
                    System.out.println("Ingrese su nombre ");
                    String nombre = sc.nextLine();
                    
                    Estudiante e = new Estudiante(nombre,apellido,dni);
                    estudiantes.add(e);
                    
                    Inscripcion in = new Inscripcion(e,c,modalidad);
                    inscripciones.add(in);
                    
                    System.out.println("Cargado exitosamente!");
                    
                    break;
                    
                case 2:
                    System.out.println("Sus inscripciones hasta el momento son: ");
                    for(int i=0; i<inscripciones.size() ; i++){
                        System.out.println((i+1)+ " )  ");
                        inscripciones.get(i).mostrarInscripciones();
                    }
                    break;
                    
                case 3:
                    System.out.println("Los cursos disponibles son: ");
                    for(int i=0; i<cursos.size(); i++){
                        System.out.println((i+1) + "- " + cursos.get(i).getNombre() );
                    }
                    break;
                    
                case 4:
                    
                    System.out.println("Las modalidades son: ");
                    System.out.println("1-Presencial \n2-Virtual \n3-Semipresencial \n");
                    break;
                    
                case 5:
                    System.out.println("Adios! ");
                    break;
                    
                default:
                    System.out.println("Opcion invalida! ");
            }
            
        }while(opc!=5);
        
        //sc.close();
        
    }
    
}
