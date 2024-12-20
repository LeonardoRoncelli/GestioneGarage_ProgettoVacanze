public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private double peso;
    private int annoImmatricolazione;

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }
    public Veicolo(String targa,String marca,String modello,double peso,int annoImmatricolazione){
        this.targa=targa;
        this.marca=marca;
        this.modello=modello;
        this.peso=peso;
        this.annoImmatricolazione=annoImmatricolazione;
    }
}
