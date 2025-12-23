
package sistemaeducativo;


public class Curso {
    
    private String modalidad;
    private String nombre;

    public Curso(String nombre, String modalidad) {
        this.modalidad = modalidad;
        this.nombre = nombre;
    }

    public String getModalidad() {
        return modalidad;
    }

    public String getNombre() {
        return nombre;
    }
    
}
