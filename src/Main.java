public class Main {
    public static void main(String[] args) {

        final int CONSUMICION = 10;
        Tienda miTienda = new Tienda();

        Productor paco = new Productor("Paco",CONSUMICION,miTienda);
        Productor manuel = new Productor("manuel",CONSUMICION,miTienda);

        Cliente jose = new Cliente("jose",CONSUMICION,miTienda);
        Cliente miguel = new Cliente("miguel",CONSUMICION,miTienda);

        
        paco.start();
        manuel.start();

        jose.start();
        miguel.start();


    }
}