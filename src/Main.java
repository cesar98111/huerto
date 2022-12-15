public class Main {
    public static void main(String[] args) {

        Tienda miHuerto = new Tienda();

        Productor paco = new Productor("Paco",10,miHuerto);

        paco.start();


    }
}