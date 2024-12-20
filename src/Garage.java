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
    Box []boxes=new Box[numeroBox];
}
