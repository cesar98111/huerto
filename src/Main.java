public class Main {
    public static void main(String[] args) {

        Tienda miHuerto = new Tienda();

        Productor paco = new Productor("Paco",4,miHuerto);
        Cliente pedro = new Cliente("Pedro",miHuerto);
        paco.start();
        pedro.start();


    }
}