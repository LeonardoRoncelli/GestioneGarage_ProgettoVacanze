import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Garage {
    Veicolo []boxes=new Veicolo[500];
    public int parcheggiaVeicolo(Veicolo veicoloAgg){
        int numBox=-1;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]==null){
                boxes[i]=veicoloAgg;
                numBox=i;
                break;
            }
        }
        return numBox;
    }
    public String visualizzaTutti(){
        String risultato="";
        int contaNull=0;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]!=null){
                risultato+="BOX "+i+"\n";
                risultato+=boxes[i].toString()+"\n";
                risultato+="\n";
            }else {
                contaNull++;
            }
        }
        if(contaNull==boxes.length){
            risultato+="NON CI SONO VEICOLI ALL'INTERNO DEL PARCHEGGIO!"+"\n";
        }
        return risultato;
    }
    public int numBoxOccupati(){
        int contaOccupati=0;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]!=null){
                contaOccupati++;
            }
        }
        return contaOccupati;
    }
    public int numBoxLiberi(){
        int contaLiberi=0;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]==null){
                contaLiberi++;
            }
        }
        return contaLiberi;
    }
    public String ricercaConTarga(String targa){
        boolean isPresente=false;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]!=null&&boxes[i].getTarga().equalsIgnoreCase(targa)){
                isPresente=true;
                break;
            }
        }
        if(!isPresente){
            return"Veicolo con targa inserita NON PRESENTE";
        }else{
            return "Veicolo con targa inserita PRESENTE";
        }
    }
    public String liberaBox(int numBox){
        if(numBox>=0&&numBox<500) {
            if (boxes[numBox] == null) {
                return"BOX GIÁ LIBERO!";
            }else {
                boxes[numBox] = null;
                return"BOX LIBERATO CON SUCCESSO";
            }
        }else{
            return"BOX INESISTENTE!";
        }
    }
    public String verificaStatoBox(int numBox){
        boolean isOccupato=true;
        if(numBox>=0&&numBox<500) {
            if (boxes[numBox] == null) {
                isOccupato = false;
            }
            if(!isOccupato){
                return"Box NON OCCUPATO";
            }else {
                return"Box OCCUPATO";
            }
        }else {
            return"BOX INESISTENTE!";
        }
    }
    public String parcheggiaBoxSpecifico (int numBox,Veicolo veicolo){
        boolean pieno=true;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]==null){
                pieno=false;
                break;
            }
        }
        if(pieno){
            return"IL GARAGE É COMPLETO! VEICOLO NON PARCHEGGIATO!";
        }
        if(numBox>=0&&numBox<500){
            if(boxes[numBox]!=null){
                return"BOX GIÁ OCCUPATO!";
            }else {
                boxes[numBox]=veicolo;
                return"VEICOLO PARCHEGGIATO CON SUCCESSO!";
            }
        }else {
            return"BOX INESISTENTE!";
        }
    }
    public String modificaVeicolo(int numBox,Veicolo veicolo){
        if (numBox>=0&&numBox<500){
            if(boxes[numBox]==null){
                return"BOX LIBERO, IMPOSSIBILE MODIFICARE I DATI!";
            }else{
                boxes[numBox]=veicolo;
                return"DATI MODIFICATI CON SUCCESSO!";
            }
        }else {
            return"BOX INESISTENTE!";
        }
    }
    public double calcolaPrezzo(double tempo){
        double prezzo=0;
        double prezzoArrotondato=0;
        if(tempo>0){
            prezzo=1.50*tempo;
            BigDecimal arrotondamento=new BigDecimal(prezzo);
            arrotondamento=arrotondamento.setScale(2, RoundingMode.HALF_UP);
            prezzoArrotondato=arrotondamento.doubleValue();
            Box box=new Box(prezzoArrotondato);
        }
        return prezzoArrotondato;
    }
    public double ricavoTotale(){
        double ricavo=0;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]!=null){
                ricavo+=boxes[i].getPrezzoBox();
            }
        }
        return ricavo;
    }
    public boolean verificaPassword(String passwordInserita){
        String passwordAttuale;
        boolean accessoConsentito=false;
        try(BufferedReader br=new BufferedReader(new FileReader("accesso.txt"))){
            String linea=br.readLine();
            if (linea.equals(passwordInserita)){
                accessoConsentito=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return accessoConsentito;
    }
    public void cambioPassword(String nuovaPassword){
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("accesso.txt"))) {
            bw.write(nuovaPassword);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void salvaElenco(){
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("elencoVeicoli.txt"))) {
            for(int i=0;i<boxes.length;i++){
                if (boxes[i]!=null){
                    bw.write(boxes[i].toString());
                    bw.newLine();
                    bw.newLine();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public int contaPerMarca(String marca){
        int conta=0;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]!=null){
                if(boxes[i].getMarca().equalsIgnoreCase(marca)){
                    conta++;
                }
            }
        }
        return conta;
    }
    public double mediaPrezzo(){
        double somma=0;
        int conta=0;
        for(int i=0;i<boxes.length;i++){
            if (boxes[i]!=null) {
                somma += boxes[i].getPrezzoBox();
                conta++;
            }
        }
        if(conta>0){
            return somma/conta;

        }else {
            return 0;
        }
    }
}