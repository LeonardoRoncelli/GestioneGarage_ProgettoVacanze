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
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]!=null){
                System.out.println(boxes[i].toString());
                System.out.println(" ");
            }
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
}
