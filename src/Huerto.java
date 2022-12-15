import java.util.ArrayList;

public class Huerto {
    private final int MAXIMO_VERDURA = 10;
    private ArrayList<String> verduras = new ArrayList<>(MAXIMO_VERDURA);

    public Huerto(){

    }
    synchronized public void sembrar (String verdura , String productorName){
        verduras.add(verdura);
        System.out.println("una " + verdura+ "ha sido introducida por " + productorName);
    }
    synchronized public String recoger (String clienteName){
       return verduras.remove(1);
    }


}
