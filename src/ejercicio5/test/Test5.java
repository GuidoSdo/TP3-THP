package ejercicio5.test;

import ejercicio5.clase.Hotel;

/**
 * @author Guido
 */
public class Test5 {

    public static void main(String[] args) {

        Hotel hotelPrueba  = new Hotel("Hilton", "Caba", 200, 15);

        boolean respuesta = hotelPrueba.ocuparHabitaciones(10);

        System.out.println("respuesta : " + respuesta);
        boolean respuesta2 = hotelPrueba.ocuparHabitaciones(30);
        System.out.println("respuesta: " + respuesta2);

        System.out.println(hotelPrueba.getNombre());
        System.out.println(hotelPrueba.getLocalidad());
        System.out.println(hotelPrueba.getHabitaciones());
        System.out.println(hotelPrueba.getHabitacionesDisponibles());
        System.out.println(hotelPrueba.toString());






    }
}
