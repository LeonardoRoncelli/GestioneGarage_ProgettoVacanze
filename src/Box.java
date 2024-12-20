public class Box {
    private String tipologiaBox;
    private boolean isOccupato;
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
    public Box(String tipologiaBox,boolean isOccupato){
        this.tipologiaBox=tipologiaBox;
        this.isOccupato=isOccupato;
    }
}