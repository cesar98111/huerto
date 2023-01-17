public class Productor extends Thread {
    private String name;
    private String verdura;
    private Tienda huerto;
    private int verdurasProducidas = 0;
    private int totalVerduras;



    public Productor (String name ,int totalVerduras, Tienda tienda){
        this.name = name;
        this.totalVerduras = totalVerduras;
        this.huerto = tienda;
        this.setPriority(MAX_PRIORITY);
    }


    public int tiempoCrecimiento(){
        return (int)(Math.random()*20+1);
    }
    @Override
    public void run (){

        try{

            while (verdurasProducidas < totalVerduras ){

                Thread.sleep(tiempoCrecimiento());
                this.huerto.vender(Verduras.generarVerdura(), this.name);
                this.huerto.showStock();
                verdurasProducidas++;

            }


        }catch (InterruptedException e){
            System.out.println("no produzco");
        }


    }


}
