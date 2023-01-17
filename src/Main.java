public class Main {
    public static void main(String[] args) {

        final int CONSUMICION = 5;
        Tienda miTienda = new Tienda();

        Productor paco = new Productor("Paco",CONSUMICION,miTienda);


        Cliente jose = new Cliente("jose",CONSUMICION,miTienda);



        paco.start();


        jose.start();



    }
}