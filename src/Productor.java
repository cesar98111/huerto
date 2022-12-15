public class Productor extends Thread {
    private String name;
    private String verdura;
    private Tienda huerto;
    private int verdurasProducidas;
    private int numeroSemillas;

    public Productor (String name ,int numeroSemillas, Tienda huerto){
        this.name = name;
        this.numeroSemillas = numeroSemillas;
        this.huerto = huerto;


    }

    public String generarVerdura(){
         return Verduras.verduras[(int)(Math.random()*10+1)];
    }
    public int tiempoCrecimiento(){
        return (int)(Math.random()*20+1);
    }
    @Override
    public void run (){

        try{

            Thread.sleep(tiempoCrecimiento());
            this.huerto.vender(generarVerdura(), this.name);
            verdurasProducidas++;

        }catch (InterruptedException e){
            System.out.println("no produzco");
        }


    }


}
