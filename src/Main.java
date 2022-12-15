public class Main {
    public static void main(String[] args) {

        Tienda miHuerto = new Tienda();

        Productor paco = new Productor("Paco",20,miHuerto);
        Cliente pedro = new Cliente("Pedro",20,miHuerto);
        
        paco.start();
        pedro.start();


    }
}