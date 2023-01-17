import java.util.ArrayList;
import java.util.Iterator;

public class Tienda {
    private final int MAXIMO_VERDURA = 10;
    private ArrayList<String> verduras = new ArrayList<>();


    public Tienda(){

    }
    synchronized public void vender(String verdura , String productorName){
        try{
            while(verduras.size() >= MAXIMO_VERDURA){
                wait();
            }
            verduras.add(verdura);

            System.out.println("una " + verdura+ " ha sido introducida por " + productorName);
            notify();
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }
    synchronized  public void showStock (){
        String mensaje = "no hay verduras en el mercado";
        if(verduras.size() != 0){
            mensaje ="en el mercado hay: [";
            Iterator stock = verduras.iterator();

            while(stock.hasNext()){
                mensaje += " "+ stock.next() +" ";
            }
            mensaje += "]";

        }
        System.out.println(mensaje);

    }
    synchronized public void recoger (String clienteName){
        try{
            while(verduras.size() == 0){
                wait();

            }
            System.out.println(clienteName + " ha comprado " + verduras.remove(0));
            showStock();
            notify();


        }catch (InterruptedException e) {
            System.out.println(e);

        }
    }


}

