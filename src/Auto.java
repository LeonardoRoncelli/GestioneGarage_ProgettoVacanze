public class Auto extends Veicolo{
    private int numPorte;
    private String alimentazione;
    private int cilindrata;
    private String tipologia;
    public Auto(String targa,String marca,String modello,double peso,int annoImmatricolazione,double prezzoBox,int numPorte,String alimentazione,int cilindrata,String tipologia){
        super(targa,marca,modello,peso,annoImmatricolazione,prezzoBox);
        this.numPorte=numPorte;
        this.alimentazione=alimentazione;
        this.cilindrata=cilindrata;
        this.tipologia=tipologia;
    }
    public int getNumPorte() {
        return numPorte;
    }
    public void setNumPorte(int numPorte) {
        this.numPorte = numPorte;
    }
    public String getAlimentazione() {
        return alimentazione;
    }
    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }
    public int getCilindrata() {
        return cilindrata;
    }
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
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
                "Peso dell'auto: "+getPeso()+"\n"+
                "Anno immatricolazione del veicolo: "+getAnnoImmatricolazione()+"\n"+
                "Numero di porte del veicolo: "+numPorte+"\n"+
                "Tipo di alimentazione del veicolo: "+alimentazione+"\n"+
                "Cilindrata del veicolo: "+cilindrata+"\n"+
                "Tipologia del veicolo (es.: suv, station wagon...): "+getTipologia()+"\n"+
                "Prezzo del box";
    }
}