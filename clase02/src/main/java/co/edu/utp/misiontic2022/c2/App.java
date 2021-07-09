package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
            MiPrimerClase mpc = new MiPrimerClase();
            MiPrimerClase mpc2 = new MiPrimerClase(50);
            MiPrimerClase mpc3 = new MiPrimerClase(10,20);

            mpc.incrementarContador(5);
            System.out.println("Valor atributo contador : " + mpc.getContador());
            mpc.setContador(20);
            System.out.println("Valor atributo : " + mpc.getContador());
            
            System.out.println("mpc2 atributo : " + mpc2.getContador());
            mpc2.incrementarContador(50);
            System.out.println("mpc2 atributo : " + mpc2.getContador());
            
            System.out.println("mpc3 atributo : " + mpc3.getContador());
            System.out.println("mpc3 atributo numHoras : " + mpc3.getNumHoras());
        */

        Vehiculo vehiculo = new Vehiculo();
        Coche coche = new Coche();
        Coche coche2 = new Coche("azul",121212,4);

        Barco barco = new Barco();

        coche.setColor("rojo");
        System.out.println("color de objeto coche1 es :" + coche.getColor());

        System.out.println("coche2 su num serie es :"  + coche2.getNumSerie() 
                            + " y tiene " + coche2.getNumRuedas() + " ruedas");


    }
}
