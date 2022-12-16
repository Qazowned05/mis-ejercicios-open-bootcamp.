public class Main {
    public static void main(String[] args) {
     int resultado = 0;
     resultado = suma(2, 6, 16);
     System.out.println(resultado);

     Coche miCoche = new Coche();
     miCoche.colocarpuertas();
        miCoche.colocarpuertas();
        miCoche.colocarpuertas();
        miCoche.colocarpuertas();
        miCoche.colocarpuertas();
        System.out.println("el numero de puertas es " + miCoche.puertas );
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
