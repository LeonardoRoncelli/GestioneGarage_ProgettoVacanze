public class Box {
    private int numeroBox;
    private String tipologiaBox;
    private boolean isOccupato;
    public void setNumeroBox(int numeroBox){
        this.numeroBox=numeroBox;
    }
    public int getNumeroBox(){
        return numeroBox;
    }
    public void setTipologiaBox(String tipologiaBox){
        this.tipologiaBox=tipologiaBox;
    }
    public String getTipologiaBox(){
        return tipologiaBox;
    }
    public void setIsOccupato(boolean isOccupato){
        this.isOccupato=isOccupato;
    }
    public boolean getIsOccupato(){
        return isOccupato;
    }
    public Box(int numeroBox,String tipologiaBox,boolean isOccupato){
        this.numeroBox=numeroBox;
        this.tipologiaBox=tipologiaBox;
        this.isOccupato=isOccupato;
    }
}