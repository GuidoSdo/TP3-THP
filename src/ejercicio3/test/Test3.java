package ejercicio3.test;

import ejercicio3.clase.SuperHeroe;

/**
 * @author Guido
 */
public class Test3 {

    public static void main(String[] args) {

        SuperHeroe superHeroe1 = new SuperHeroe("Batman",90,70,0);

        SuperHeroe superHeroe2 = new SuperHeroe("Superman",95,60,70);

        System.out.println("El super heroe " + superHeroe2.getNombre() + " jugo con el super heroe: " + superHeroe1.getNombre()
                + ", el resultado del juego fue: " + superHeroe2.jugar(superHeroe1));

        System.out.println("El super heroe " + superHeroe1.getNombre() + " jugo con el super heroe: " + superHeroe2.getNombre()
                + ", el resultado del juego fue: " + superHeroe1.jugar(superHeroe2));







    }
}
