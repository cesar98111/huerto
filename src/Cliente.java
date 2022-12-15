import java.util.ArrayList;

public class Cliente extends Thread{

    private String nombre;

    private Tienda tienda;

    public Cliente (String nombre, Tienda tienda){
        this.nombre = nombre;
        this.tienda = tienda;

    }


    public void run (){
       String verduraObtenida = this.tienda.recoger(this.nombre);

       System.out.println(this.nombre + "ha comprado " + verduraObtenida);
    }



}
