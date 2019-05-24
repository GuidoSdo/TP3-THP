package ejercicio2.test;

import ejercicio2.clase.TarjetaDeCredito;

/**
 * @author Guido
 */
public class Test2 {

    public static void main(String[] args) {

        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("4145414122221111", "Juan Perez", 10000);

        tarjetaDeCredito.realizarCompra(4000);

        tarjetaDeCredito.toString();

        tarjetaDeCredito.actualizarLimite(3000);

        tarjetaDeCredito.toString();


    }
}
