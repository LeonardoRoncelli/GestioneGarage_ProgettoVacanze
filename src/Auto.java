public class Auto extends Veicolo{
    private String tipologia;
    public Auto(String targa,String marca,String modello,String tipologia){
        super(targa,marca,modello);
        this.tipologia=tipologia;
    }
    public String getTipologia() {
        return tipologia;
    }
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    public String toString(){
        return "Targa dell'auto: "+getTarga()+"\n"+
                "Marca dell'auto: "+getMarca()+"\n"+
                "Modello dell'auto: "+getModello()+"\n"+
                "Tipologia del veicolo (es.: suv, station wagon...): "+getTipologia();
    }
}