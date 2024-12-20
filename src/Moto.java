public class Moto extends Veicolo{
    private int cilindrata;
    private String tipologia;
    private int numTempi;
    private double capienzaSerbatoio;
    public Moto(String targa,String marca,String modello,double peso,int annoImmatricolazione,int cilindrata,String tipologia,int numTempi,double capienzaSerbatoio){
        super(targa, marca, modello, peso, annoImmatricolazione);
        this.cilindrata=cilindrata;
        this.tipologia=tipologia;
        this.numTempi=numTempi;
        this.capienzaSerbatoio=capienzaSerbatoio;
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
    public int getNumTempi() {
        return numTempi;
    }
    public void setNumTempi(int numTempi) {
        this.numTempi = numTempi;
    }
    public double getCapienzaSerbatoio() {
        return capienzaSerbatoio;
    }
    public void setCapienzaSerbatoio(double capienzaSerbatoio) {
        this.capienzaSerbatoio = capienzaSerbatoio;
    }
}
