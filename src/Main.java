public class Main {
    public static void main(String[] args) {

        final int CONSUMICION = 10;
        Tienda miHuerto = new Tienda();

        Productor paco = new Productor("Paco",CONSUMICION,miHuerto);


        Cliente jose = new Cliente("jose",CONSUMICION,miHuerto);


        
        paco.start();


        jose.start();



    }
}