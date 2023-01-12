import java.util.ArrayList;

public class Cliente extends Thread{


    private String nombre;

    private Tienda tienda;
    private int maximoVerduras;

    public Cliente (String nombre,int maximoVerduras, Tienda tienda){
        this.nombre = nombre;
        this.tienda = tienda;
        this.maximoVerduras = maximoVerduras;
        this.setPriority(10);

    }

    public int tiempoConsumision(){
        return (int)(Math.random()*20+1);
    }
    public void run (){
        int verdurasConsumidas = 0;
        while(this.maximoVerduras > verdurasConsumidas){
            try{

                this.tienda.recoger(this.nombre);
                sleep(tiempoConsumision());
            }catch (InterruptedException e){
                System.out.println(e);
            }
            verdurasConsumidas++;
        }


    }



}
