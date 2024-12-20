public class Furgone extends Veicolo{
    private double capacitaCarico;
    private int numeroAssi;
    private double altezzaMax;
    private String alimentazione;
    public Furgone(String targa,String marca,String modello,double peso,int annoImmatricolazione,double capacitaCarico,int numeroAssi,double altezzaMax,String alimentazione){
        super(targa, marca, modello, peso, annoImmatricolazione);
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
}
