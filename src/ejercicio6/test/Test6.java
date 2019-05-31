package ejercicio6.test;


import ejercicio6.clase.Vuelo;

/**
 * @author Guido
 */
public class Test6 {

    public static void main(String[] args) {

        Vuelo vuelo = new Vuelo("Aeroparque","Miami","01/06/2018",1234,250);

        vuelo.setAsientosOcupados(15);
        System.out.println(vuelo.reservar(200));
        System.out.println(vuelo.reservar(260));
    }
}
