import java.math.BigDecimal;
import java.math.RoundingMode;

public class Garage {
    Veicolo []boxes=new Veicolo[500];
    public int parcheggiaVeicolo(Veicolo veicoloAgg){
        int numBox=-1;
        boolean pieno=true;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]==null){
                pieno=false;
                boxes[i]=veicoloAgg;
                numBox=i;
                break;
            }
        }
        if(pieno){
            System.out.println("IL GARAGE É COMPLETO! VEICOLO NON PARCHEGGIATO!");
        }
        return numBox;
    }
    public void visualizzaTutti(){
        int contaNull=0;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]!=null){
                System.out.println("BOX "+i);
                System.out.println(boxes[i].toString());
                System.out.println(" ");
            }else {
                contaNull++;
            }
        }
        if(contaNull==boxes.length){
            System.out.println("NON CI SONO VEICOLI ALL'INTERNO DEL PARCHEGGIO!");
        }
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
    public void parcheggiaBoxSpecifico (int numBox,Veicolo veicolo){
        boolean pieno=true;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]==null){
                pieno=false;
                break;
            }
        }
        if(pieno){
            System.out.println("IL GARAGE É COMPLETO! VEICOLO NON PARCHEGGIATO!");
        }
        if(numBox>=0&&numBox<500){
            if(boxes[numBox]!=null){
                System.out.println("BOX GIÁ OCCUPATO!");
            }else {
                boxes[numBox]=veicolo;
                System.out.println("VEICOLO PARCHEGGIATO CON SUCCESSO!");
            }
        }else {
            System.out.println("BOX INESISTENTE!");
        }
    }
    public void modificaVeicolo(int numBox,Veicolo veicolo){
        if (numBox>=0&&numBox<500){
            if(boxes[numBox]==null){
                System.out.println("BOX LIBERO, IMPOSSIBILE MODIFICARE I DATI!");
            }else{
                boxes[numBox]=veicolo;
                System.out.println("DATI MODIFICATI CON SUCCESSO!");
            }
        }else {
            System.out.println("BOX INESISTENTE!");
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
        }else {
            System.out.println("VALORE DEL TEMPO INSERITO NON VALIDO!");
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
}