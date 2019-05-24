package ejercicio2.clase;

/**
 * @author Guido
 */
public class TarjetaDeCredito {
    private String numero;
    private String titular;
    private double limite;
    private double disponible;

    /**
     * Consturctor por defecto
     */
    public TarjetaDeCredito() {

    }

    /**
     * Constructor parametrizado
     * @param numero
     * @param titular
     * @param limite
     */
    public TarjetaDeCredito(String numero, String titular, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.limite = limite;
        this.disponible = limite;
    }

    private boolean puedoComprar(double monto){
        boolean response = false;
        if(monto <= disponible){
            response = true;
        }
        return response;
    }

    public boolean realizarCompra(double monto){
        boolean response = false;
        if(puedoComprar(monto)){
            disponible = disponible - monto;
            response = true;
        }
        return response;
    }

    public void actualizarLimite(double nuevoLimite){
        if (nuevoLimite < this.limite){
            disponible = disponible - (limite - nuevoLimite);
            setLimite(nuevoLimite);
            if( disponible < 0 ){
                setDisponible(0);
            }
        }

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getDisponible() {
        return disponible;
    }

    public void setDisponible(double disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Numero = " + numero +
                ", titular = " + titular +
                ", limite = " + limite +
                ", disponible = " + disponible;
    }
}
