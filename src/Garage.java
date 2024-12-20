public class Garage {
    private int numeroBox;
    public Garage(int numeroBox){
        this.numeroBox=numeroBox;
    }
    public void setNumeroBox(int numeroBox){
        this.numeroBox=numeroBox;
    }
    public int getNumeroBox(){
        return numeroBox;
    }
    Veicolo []boxes=new Veicolo[numeroBox];
    public String parcheggiaVeicolo(Veicolo veicoloAgg){
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]==null){
                boxes[i]=veicoloAgg;
                break;
            }
        }
        return "VEICOLO AGGIUNTO CON SUCCESSO";
    }
}
