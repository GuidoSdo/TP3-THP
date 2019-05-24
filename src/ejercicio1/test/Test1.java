package ejercicio1.test;

import ejercicio1.clase.Persona;

/**
 * @author Guido
 */
public class Test1 {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Diego");
        persona1.setApellido("Diaz");
        persona1.setDireccion("Roosevelt 3313");

        System.out.println(persona1.toString());

        Persona persona2 = new Persona();
        persona2.setNombre("Pablo");
        persona2.setApellido("Gomez");
        persona2.setDireccion("Virrey del Pino 2284");

        System.out.println(persona2.toString());

    }
}
