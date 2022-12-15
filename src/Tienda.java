import java.util.ArrayList;

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
            System.out.println(verduras);
            System.out.println("una " + verdura+ "ha sido introducida por " + productorName);
            notifyAll();
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }
    synchronized public String recoger (String clienteName){
        try{
            while(verduras.size() == 0){
                wait();

            }
            notifyAll();
            return verduras.remove(0);

        }catch (InterruptedException e) {
            System.out.println(e);
            return null;
        }
    }


}
