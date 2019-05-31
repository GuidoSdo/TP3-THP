package ejercicio6.clase;

/**
 * @author Guido
 */
public class Vuelo {

    private String origen;
    private String destino;
    private String fecha;
    private int numero;
    private int capacidad;
    private int asientosOcupados;


    /**
     * Constructor parametrizado para punto a)
     * @param origen
     * @param destino
     * @param fecha
     * @param capacidad
     */
    public Vuelo(String origen, String destino, String fecha, int numero, int capacidad) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.numero = numero;
        this.capacidad = capacidad;
    }

    //todo: revisar el enunciado creo que le pifie
    public boolean reservar(int cantidadPersonasParaReservar){
        boolean response = false;
        if(cantidadPersonasParaReservar<= capacidad){
            asientosOcupados = asientosOcupados + cantidadPersonasParaReservar;
            response = true;
        }
        return response;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha='" + fecha + '\'' +
                ", numero=" + numero +
                ", capacidad=" + capacidad +
                ", asientosOcupados=" + asientosOcupados +
                '}';
    }
}
