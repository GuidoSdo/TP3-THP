package ejercicio3.test;

import ejercicio3.clase.SuperHeroe;

/**
 * @author Guido
 */
public class Test3 {

    public static void main(String[] args) {

        SuperHeroe superHeroe1 = new SuperHeroe("Batman",90,70,0);

        SuperHeroe superHeroe2 = new SuperHeroe("Superman",95,60,70);

        quienGana(superHeroe1,superHeroe2);

    }

    public static void quienGana(SuperHeroe superHeroe1, SuperHeroe superHeroe2){
        int cantidad = 0;
        int sumaGanadasHeroe1 = 0;
        int sumaGanadasHeroe2 = 0;

        String elGanador;
        while (cantidad < 3){
            cantidad++;

            int resultadoJuego = superHeroe1.jugar(superHeroe2);
            if(resultadoJuego == 2){
                sumaGanadasHeroe2 ++;
            }
            if(resultadoJuego == 1){
                sumaGanadasHeroe1 ++;
            }
            if(resultadoJuego == 3){
                sumaGanadasHeroe1++;
                sumaGanadasHeroe2++;
            }

        }

        if(sumaGanadasHeroe1 > sumaGanadasHeroe2){
            elGanador = superHeroe1.getNombre();
        } else {
            elGanador = superHeroe2.getNombre();
        }

        System.out.println("El ganador del juego es: " + elGanador);

    }
}
