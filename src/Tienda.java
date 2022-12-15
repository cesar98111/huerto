import java.util.ArrayList;

public class Tienda {
    private final int MAXIMO_VERDURA = 10;
    private final int POCICION = 1;
    private ArrayList<String> verduras = new ArrayList<>(MAXIMO_VERDURA);


    public Tienda(){

    }
    synchronized public void vender(String verdura , String productorName){
        verduras.add(verdura);
        System.out.println("una " + verdura+ "ha sido introducida por " + productorName);
    }
    synchronized public String recoger (String clienteName){
        if()
            return verduras.remove(POCICION);
    }


}
