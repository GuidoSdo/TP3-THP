package ejercicio3.clase;

/**
 * @author Guido
 */
public class SuperHeroe {
    private String nombre;
    private int fuerza;
    private int resistencia;
    private int superPoderes;

    /**
     * Constructor por defecto
     */
    public SuperHeroe() {
    }

    /**
     * Constructor parametrizado
     *
     * @param nombre
     * @param fuerza
     * @param resistencia
     * @param superPoderes
     */
    public SuperHeroe(String nombre, int fuerza, int resistencia, int superPoderes) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.superPoderes = superPoderes;
    }

    /**
     * Compara atributos entre superHeroes al azar.
     * Devuelve 1 si gano u 2 si perdió
     * @param superHeroe
     * @return
     */
    public int jugar(SuperHeroe superHeroe) {
        int seleccion = azar(3, 1);
        int response = 0;
        switch (seleccion) {

            case 1:
                response = compararAtributos(this.fuerza,superHeroe.getFuerza());
                break;
            case 2:
                response = compararAtributos(this.resistencia,superHeroe.getResistencia());
                break;
            case 3:
                response = compararAtributos(this.superPoderes,superHeroe.getSuperPoderes());
                break;

        }
        return response;
    }

    private static int azar(int tope, int base) {
        int resul;
        resul = (int) (Math.random() * (tope + 1 - base)) + base;
        return resul;
    }

    private int compararAtributos(int miAtributo, int elAtributoDelOtro){
        int response = 2;
        if (miAtributo > elAtributoDelOtro){
            response = 1;
        }
        return response;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getSuperPoderes() {
        return superPoderes;
    }

    public void setSuperPoderes(int superPoderes) {
        this.superPoderes = superPoderes;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", resistencia=" + resistencia +
                ", superPoderes=" + superPoderes +
                '}';
    }
}
