import java.util.ArrayList;

public class Cliente extends Thread{

    private String nombre;
    private ArrayList<String> verdurasObtenidas;
    private Tienda tienda;

    public Cliente (String nombre, Tienda tienda){
        this.nombre = nombre;
        this.tienda = tienda;

    }


    public void run (){
        this.tienda.recoger(this.nombre);
    }



}
