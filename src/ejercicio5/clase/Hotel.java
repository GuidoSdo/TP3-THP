package ejercicio5.clase;

/**
 * @author Guido
 */
public class Hotel {

    private String nombre;
    private String localidad;
    private int habitaciones;
    private int habitacionesDisponibles;

    public Hotel() {
    }

    public Hotel(String nombre, String localidad, int habitaciones, int habitacionesDisponibles) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.habitaciones = habitaciones;
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    public boolean ocuparHabitaciones(int cantidadHabitacionesOcupadas) {
        boolean response = false;
        if(cantidadHabitacionesOcupadas <= habitacionesDisponibles){
            response = true;
        }
        return response;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    public void setHabitacionesDisponibles(int habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", habitaciones=" + habitaciones +
                ", habitacionesDisponibles=" + habitacionesDisponibles +
                '}';
    }
}
