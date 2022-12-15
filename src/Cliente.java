import java.util.ArrayList;

public class Cliente extends Thread{


    private String nombre;

    private Tienda tienda;
    private int maximoVerduras;

    public Cliente (String nombre,int maximoVerduras, Tienda tienda){
        this.nombre = nombre;
        this.tienda = tienda;
        this.maximoVerduras = maximoVerduras;

    }

    public int tiempoConsumision(){
        return (int)(Math.random()*20+1);
    }
    public void run (){
        int verdurasConsumidas = 0;
        while(this.maximoVerduras > verdurasConsumidas){
            try{
                sleep(tiempoConsumision());
                String verduraObtenida = this.tienda.recoger(this.nombre);
                System.out.println(this.nombre + "ha comprado " + verduraObtenida);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            verdurasConsumidas++;
        }


    }



}
