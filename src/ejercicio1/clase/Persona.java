package ejercicio1.clase;

/**
 * @author Guido
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String direccion;

    /**
     * Constructor por defecto
     */
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre +
                ", Apellido = " + apellido +
                ", Direccion = " + direccion;
    }
}
