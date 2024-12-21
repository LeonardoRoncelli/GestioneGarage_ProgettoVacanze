public class Furgone extends Veicolo{
    private double capacitaCarico;
    private int numeroAssi;
    private double altezzaMax;
    private String alimentazione;
    public Furgone(String targa,String marca,String modello,double peso,int annoImmatricolazione,double prezzoBox,double capacitaCarico,int numeroAssi,double altezzaMax,String alimentazione){
        super(targa, marca, modello, peso, annoImmatricolazione,prezzoBox);
        this.capacitaCarico=capacitaCarico;
        this.numeroAssi=numeroAssi;
        this.altezzaMax=altezzaMax;
        this.alimentazione=alimentazione;
    }
    public double getCapacitaCarico() {
        return capacitaCarico;
    }
    public void setCapacitaCarico(double capacitaCarico) {
        this.capacitaCarico = capacitaCarico;
    }
    public int getNumeroAssi() {
        return numeroAssi;
    }
    public void setNumeroAssi(int numeroAssi) {
        this.numeroAssi = numeroAssi;
    }
    public double getAltezzaMax() {
        return altezzaMax;
    }
    public void setAltezzaMax(double altezzaMax) {
        this.altezzaMax = altezzaMax;
    }
    public String getAlimentazione() {
        return alimentazione;
    }
    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }
    public String toString(){
        return "Targa del furgone: "+getTarga()+"\n"+
                "Marca del furgone: "+getMarca()+"\n"+
                "Modello del furgone: "+getModello()+"\n"+
                "Peso del furgone: "+getPeso()+"\n"+
                "Anno immatricolazione del furgone: "+getAnnoImmatricolazione()+"\n"+
                "Capacità del carico del furgone: "+capacitaCarico+"\n"+
                "Numero di assi del furgone: "+numeroAssi+"\n"+
                "Altezza massima del furgone: "+altezzaMax+"\n"+
                "Alimentazione del furgone: "+alimentazione;
    }
}
