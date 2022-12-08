package Introduccion;

public class Ejercicio3 {

    public static void main(String[] args) {

//Primera parte:

        sumarTres(2, 3, 3);

//Segunda parte:

        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println(miCoche.puertas);

    }


    private static void sumarTres(int a, int b, int c) {
        int resultado;
        resultado=a+b+c;
        System.out.println( resultado );
    }
    public static class Coche{
        public int puertas =0;
        public void aumentarPuertas() {
            this.puertas++;

        }
        }
}