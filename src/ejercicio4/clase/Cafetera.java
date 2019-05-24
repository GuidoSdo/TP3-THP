package ejercicio4.clase;

/**
 * @author Guido
 */
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    /**
     * Constructor por defecto
     */
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    /**
     * Constructor con parametro de capacidad maxima
     * @param capacidadMaxima
     */
    public Cafetera(int capacidadMaxima){
        this.cantidadActual = capacidadMaxima;

    }

    /**
     * Constructor con parametro capacidad maxima y cantidad actual
     * @param capacidadMaxima
     * @param cantidadActual
     */
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        validarCapacidad();
    }

    private void  validarCapacidad(){
        if(cantidadActual > capacidadMaxima){
            setCantidadActual(capacidadMaxima);
        }
    }

    public void llenarCafetera(){
        setCantidadActual(this.capacidadMaxima);
    }

    public void servirTaza(int capacidadAServirEnUnaTaza){
        if(capacidadAServirEnUnaTaza <= cantidadActual){
            System.out.println("Se servio la taza completa");
        } else {
            System.out.println("No alcanza cafe para llenar la taza, se sirvio hasta donde se pudo");
        }

    }

    public void vaciarCafetera(){
        setCantidadActual(0);
    }

    public void agregarCafe(int cantidadCafe){
        cantidadActual = cantidadActual + cantidadCafe;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
