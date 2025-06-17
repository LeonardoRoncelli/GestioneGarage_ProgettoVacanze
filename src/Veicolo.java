import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private double prezzoBox;
    private LocalDateTime dataOraInserimento;
    public void setPrezzoBox(double prezzoBox){
        this.prezzoBox=prezzoBox;
    }
    public double getPrezzoBox(){
        return prezzoBox;
    }
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
    public LocalDateTime getDataOraInserimento(){
        return dataOraInserimento;
    }
    public String getDataOraInserimentoFormattata(){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataOraInserimento.format(formatter);
    }
    public Veicolo(String targa,String marca,String modello,double prezzoBox){
        this.targa=targa;
        this.marca=marca;
        this.modello=modello;
        this.prezzoBox=prezzoBox;
        this.dataOraInserimento=LocalDateTime.now();
    }
    public String toString(){
        return "Targa del veicolo: "+targa+"\n"+
                "Marca del veicolo: "+marca+"\n"+
                "Modello del veicolo: "+modello+"\n"+
                "Prezzo del box";
    }
}
