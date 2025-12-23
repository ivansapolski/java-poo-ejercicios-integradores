package sistemaeducativo;

public class Inscripcion {
    
    private Estudiante e;
    private Curso c;
    private String m;
    
    public Inscripcion(Estudiante e, Curso c, String m) {
        this.e = e;
        this.c = c;
        this.m = m;
    }
    
    public void mostrarInscripciones(){
        
        System.out.println(" " + c.getNombre() );
        System.out.println("Modalidad: " + m );
        System.out.println("Estudiante: ");
        System.out.println("Nombre " + e.getNombre() );
        System.out.println("Apellido " + e.getApellido() );
        
        System.out.println("");
    }
    
}
