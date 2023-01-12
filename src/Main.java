public class Main {
    public static void main(String[] args) {

        final int CONSUMICION = 10;
        Tienda miHuerto = new Tienda();

        Productor paco = new Productor("Paco",CONSUMICION,miHuerto);
        Productor manuel = new Productor("manuel",CONSUMICION,miHuerto);

        Cliente jose = new Cliente("jose",CONSUMICION,miHuerto);
        Cliente miguel = new Cliente("miguel",CONSUMICION,miHuerto);

        
        paco.start();
        manuel.start();

        jose.start();
        miguel.start();


    }
}