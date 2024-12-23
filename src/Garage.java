public class Garage {
    Veicolo []boxes=new Veicolo[500];
    public String parcheggiaVeicolo(Veicolo veicoloAgg){
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]==null){
                boxes[i]=veicoloAgg;
                break;
            }
        }
        return "VEICOLO AGGIUNTO CON SUCCESSO";
    }
    public void visualizzaTutti(){
        int contaNull=0;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]!=null){
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
    public boolean ricercaConTarga(String targa){
        boolean isPresente=false;
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]!=null&&boxes[i].getTarga().equalsIgnoreCase(targa)){
                isPresente=true;
                break;
            }
        }
        return isPresente;
    }
    public void liberaBox(int numBox){
        if(numBox>=0&&numBox<500) {
            if (boxes[numBox] == null) {
                System.out.println("BOX GIÁ LIBERO!");
            }else {
                boxes[numBox] = null;
                System.out.println("BOX LIBERATO CON SUCCESSO");
            }
        }else{
            System.out.println("BOX INESISTENTE!");
        }
    }
    public boolean verificaStatoBox(int numBox){
        boolean isOccupato=true;
        if(boxes[numBox]==null){
            isOccupato=false;
        }
        return isOccupato;
    }
    public void parcheggiaBoxSpecifico (int numBox,Veicolo veicolo){
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
}