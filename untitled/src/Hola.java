public class Hola {
    public static void main (String[] args) {
        System.out.println("Hola mundo");
        int a = 1;
        int b = 2;
        int c = 3;
        int d;
        d = suma(a, b, c);
        System.out.println("La suma es: " + d);

        coche miCoche = new coche();
        System.out.println("El coche tiene " + miCoche.masPuertas(miCoche.puertas) + " puertas");

    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
