public class Productor extends Thread {
    private String name;
    private String verdura;
    private Huerto huerto;
    private int verdurasProducidas;
    private int numeroSemilla;

    public Productor (String name ,int numeroSemilla, Huerto huerto){
        this.name = name;
        this.numeroSemilla = numeroSemilla;
        this.huerto = huerto;

    }

    public void generarSemilla(){
        int numero = (int)(Math.random()*10+1);
    }
    @Override
    public void run (){

        try{

            wait(5);
            this.huerto.sembrar(this.verdura, this.name);
            verdurasProducidas++;

        }catch (InterruptedException e){
            System.out.println("no produzco");
        }


    }


}
