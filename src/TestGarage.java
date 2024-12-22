import java.util.Scanner;
public class TestGarage {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Garage garage=new Garage();
        int scelta;
        do{
            System.out.println("Benvenuto, questo garage ha in totale 500 posti validi per auto, moto e furgoni. I box sono numerati da 0 a 499.\n"+
                    "1 - Parcheggia veicolo (verrà percheggiato nel primo box libero)\n"+
                    "2 - Libera box\n"+
                    "3 - Verifica stato di un box\n"+
                    "4 - Numero di box occupati\n"+
                    "5 - Numero di box liberi\n"+
                    "6 - Ricerca di un veicolo attraverso la targa\n"+
                    "7 - Calcolo del prezzo in base al veicolo\n"+
                    "8 - Visualizzazione di tutti i veicoli parcheggiati\n"+
                    "9 - Parcheggia veicolo in un box specifico\n"+
                    "0 - Esci");
            System.out.print("Scegli un'opzione: ");
            try {
                scelta = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Errore: Inserisci un numero valido!");
                input.nextLine();
                scelta = -1;
            }
            switch (scelta){
                case 1:{
                    String tipologia;
                    do {
                        System.out.print("Inserisci la tipologia del veicolo che si vuole parcheggiare (auto, moto o furgone): ");
                        tipologia= input.next();
                        switch (tipologia){
                            case "auto":{
                                String targa;
                                String marca;
                                String modello;
                                double peso;
                                int annoImmatricolazione;
                                int numPorte;
                                String alimentazione;
                                int cilindrata;
                                String tipologiaAgg;
                                System.out.print("Inserisci la targa dell'auto da parcheggiare: ");
                                targa= input.next();
                                System.out.print("Inserisci la marca dell'auto da parcheggiare: ");
                                marca= input.next();
                                System.out.print("Inserisci il modello dell'auto da parcheggiare: ");
                                modello= input.next();
                                System.out.print("Inserisci il peso dell'auto da parcheggiare: ");
                                peso= input.nextDouble();
                                System.out.print("Inserisci l'anno di immatricolazione dell'auto da parcheggiare: ");
                                annoImmatricolazione= input.nextInt();
                                System.out.print("Inserisci il numero di porte dell'auto da parcheggiare: ");
                                numPorte= input.nextInt();
                                System.out.print("Inserisci il tipo di alimentazione dell'auto da parcheggiare: ");
                                alimentazione= input.next();
                                System.out.print("Inserisci la cilindrata dell'auto da parcheggiare: ");
                                cilindrata=input.nextInt();
                                System.out.print("Inserisci la tipologia dell'auto da aggiungere (es.: suv, station wagon...): ");
                                tipologiaAgg= input.next();
                                Auto autoAgg=new Auto(targa,marca,modello,peso,annoImmatricolazione,20,numPorte,alimentazione,cilindrata,tipologiaAgg);
                                System.out.println(" ");
                                System.out.println(garage.parcheggiaVeicolo(autoAgg));
                                System.out.println(" ");
                                break;
                            }
                            case "moto":{
                                String targa;
                                String marca;
                                String modello;
                                double peso;
                                int annoImmatricolazione;
                                double capienzaSerbatoio;
                                int numTempi;
                                int cilindrata;
                                String tipologiaAgg;
                                System.out.print("Inserisci la targa della moto da parcheggiare: ");
                                targa= input.next();
                                System.out.print("Inserisci la marca della moto da parcheggiare: ");
                                marca= input.next();
                                System.out.print("Inserisci il modello della moto da parcheggiare: ");
                                modello= input.next();
                                System.out.print("Inserisci il peso della moto da parcheggiare: ");
                                peso= input.nextDouble();
                                System.out.print("Inserisci l'anno di immatricolazione della moto da parcheggiare: ");
                                annoImmatricolazione= input.nextInt();
                                System.out.print("Inserisci la capienza del serbatoio della moto da parcheggiare: ");
                                capienzaSerbatoio= input.nextDouble();
                                System.out.print("Inserisci il numero di tempi della moto da parcheggiare: ");
                                numTempi= input.nextInt();
                                System.out.print("Inserisci la cilindrata della moto da parcheggiare: ");
                                cilindrata=input.nextInt();
                                System.out.print("Inserisci la tipologia della moto da aggiungere (es.: sportiva, cross...): ");
                                tipologiaAgg= input.next();
                                Moto motoAgg=new Moto(targa,marca,modello,peso,annoImmatricolazione,10,cilindrata,tipologiaAgg,numTempi,capienzaSerbatoio);
                                System.out.println(" ");
                                System.out.println(garage.parcheggiaVeicolo(motoAgg));
                                System.out.println(" ");
                                break;
                            }
                            case "furgone":{
                                String targa;
                                String marca;
                                String modello;
                                double peso;
                                int annoImmatricolazione;
                                double capacitaCarico;
                                int numeroAssi;
                                double altezzaMax;
                                String alimentazione;
                                System.out.print("Inserisci la targa del furgone da parcheggiare: ");
                                targa= input.next();
                                System.out.print("Inserisci la marca del furgone da parcheggiare: ");
                                marca= input.next();
                                System.out.print("Inserisci il modello del furgone da parcheggiare: ");
                                modello= input.next();
                                System.out.print("Inserisci il peso del furgone da parcheggiare: ");
                                peso= input.nextDouble();
                                System.out.print("Inserisci l'anno di immatricolazione del furgone da parcheggiare: ");
                                annoImmatricolazione= input.nextInt();
                                System.out.print("Inserisci la capacità del carico del furgone da parcheggiare: ");
                                capacitaCarico= input.nextDouble();
                                System.out.print("Inserisci il numero di assi del furgone da parcheggiare: ");
                                numeroAssi= input.nextInt();
                                System.out.print("Inserisci il tipo di alimentazione del furgone da parcheggiare: ");
                                alimentazione=input.next();
                                System.out.print("Inserisci l'altezza massima del furgone da parcheggiare: '");
                                altezzaMax= input.nextDouble();
                                Furgone furgoneAgg=new Furgone(targa,marca,modello,peso,annoImmatricolazione,40,capacitaCarico,numeroAssi,altezzaMax,alimentazione);
                                System.out.println(" ");
                                System.out.println(garage.parcheggiaVeicolo(furgoneAgg));
                                System.out.println(" ");
                                break;
                            }
                            default:System.out.println("TIPOLOGIA DEL VEICOLO INSERITA NON VALIDA!");
                        }
                    }while (!tipologia.equalsIgnoreCase("auto")&&!tipologia.equalsIgnoreCase("moto")&&!tipologia.equalsIgnoreCase("furgone"));
                    break;
                }
                case 8:{
                    System.out.println(" ");
                    System.out.println("Ecco la lista di tutti i veicoli parhceggiati: ");
                    System.out.println(" ");
                    garage.visualizzaTutti();
                    System.out.println(" ");
                    break;
                }
                case 4:{
                    System.out.println(" ");
                    System.out.print("Numero di box occupati: ");
                    System.out.println(garage.numBoxOccupati());
                    System.out.println(" ");
                    break;
                }
                case 5:{
                    System.out.println(" ");
                    System.out.print("Numero di box liberi: ");
                    System.out.println(garage.numBoxLiberi());
                    System.out.println(" ");
                    break;
                }
                case 6:{
                    String targa;
                    System.out.println(" ");
                    System.out.print("Inserisci la targa del veicolo da ricercare: ");
                    targa= input.next();
                    System.out.println("Presenza veicolo: "+garage.ricercaConTarga(targa));
                    System.out.println(" ");
                    break;
                }
                case 2:{
                    int numBox;
                    System.out.println(" ");
                    System.out.print("Inserisci il numero del box da liberare: ");
                    numBox= input.nextInt();
                    garage.liberaBox(numBox);
                    System.out.println(" ");
                    break;
                }
                case 3:{
                    int numBox;
                    System.out.println(" ");
                    System.out.print("Inserisci il numero del box da controllare: ");
                    numBox= input.nextInt();
                    System.out.println("Box occupato: "+garage.verificaStatoBox(numBox));
                    System.out.println(" ");
                    break;
                }
                case 9:{
                    int numBox;
                    String tipologia;
                    do {
                        System.out.print("Inserisci la tipologia del veicolo che si vuole parcheggiare (auto, moto o furgone): ");
                        tipologia= input.next();
                        switch (tipologia){
                            case "auto":{
                                String targa;
                                String marca;
                                String modello;
                                double peso;
                                int annoImmatricolazione;
                                int numPorte;
                                String alimentazione;
                                int cilindrata;
                                String tipologiaAgg;
                                System.out.print("Inserisci la targa dell'auto da parcheggiare: ");
                                targa= input.next();
                                System.out.print("Inserisci la marca dell'auto da parcheggiare: ");
                                marca= input.next();
                                System.out.print("Inserisci il modello dell'auto da parcheggiare: ");
                                modello= input.next();
                                System.out.print("Inserisci il peso dell'auto da parcheggiare: ");
                                peso= input.nextDouble();
                                System.out.print("Inserisci l'anno di immatricolazione dell'auto da parcheggiare: ");
                                annoImmatricolazione= input.nextInt();
                                System.out.print("Inserisci il numero di porte dell'auto da parcheggiare: ");
                                numPorte= input.nextInt();
                                System.out.print("Inserisci il tipo di alimentazione dell'auto da parcheggiare: ");
                                alimentazione= input.next();
                                System.out.print("Inserisci la cilindrata dell'auto da parcheggiare: ");
                                cilindrata=input.nextInt();
                                System.out.print("Inserisci la tipologia dell'auto da aggiungere (es.: suv, station wagon...): ");
                                tipologiaAgg= input.next();
                                System.out.print("Inserisci il numero del box in cui vuoi parcheggiare il veicolo: ");
                                numBox=input.nextInt();
                                Auto autoAgg=new Auto(targa,marca,modello,peso,annoImmatricolazione,20,numPorte,alimentazione,cilindrata,tipologiaAgg);
                                System.out.println(" ");
                                garage.parcheggiaBoxSpecifico(numBox,autoAgg);
                                System.out.println(" ");
                                break;
                            }
                            case "moto":{
                                String targa;
                                String marca;
                                String modello;
                                double peso;
                                int annoImmatricolazione;
                                double capienzaSerbatoio;
                                int numTempi;
                                int cilindrata;
                                String tipologiaAgg;
                                System.out.print("Inserisci la targa della moto da parcheggiare: ");
                                targa= input.next();
                                System.out.print("Inserisci la marca della moto da parcheggiare: ");
                                marca= input.next();
                                System.out.print("Inserisci il modello della moto da parcheggiare: ");
                                modello= input.next();
                                System.out.print("Inserisci il peso della moto da parcheggiare: ");
                                peso= input.nextDouble();
                                System.out.print("Inserisci l'anno di immatricolazione della moto da parcheggiare: ");
                                annoImmatricolazione= input.nextInt();
                                System.out.print("Inserisci la capienza del serbatoio della moto da parcheggiare: ");
                                capienzaSerbatoio= input.nextDouble();
                                System.out.print("Inserisci il numero di tempi della moto da parcheggiare: ");
                                numTempi= input.nextInt();
                                System.out.print("Inserisci la cilindrata della moto da parcheggiare: ");
                                cilindrata=input.nextInt();
                                System.out.print("Inserisci la tipologia della moto da aggiungere (es.: sportiva, cross...): ");
                                tipologiaAgg= input.next();
                                System.out.print("Inserisci il numero del box in cui vuoi parcheggiare il veicolo: ");
                                numBox=input.nextInt();
                                Moto motoAgg=new Moto(targa,marca,modello,peso,annoImmatricolazione,10,cilindrata,tipologiaAgg,numTempi,capienzaSerbatoio);
                                System.out.println(" ");
                                garage.parcheggiaBoxSpecifico(numBox,motoAgg);
                                System.out.println(" ");
                                break;
                            }
                            case "furgone":{
                                String targa;
                                String marca;
                                String modello;
                                double peso;
                                int annoImmatricolazione;
                                double capacitaCarico;
                                int numeroAssi;
                                double altezzaMax;
                                String alimentazione;
                                System.out.print("Inserisci la targa del furgone da parcheggiare: ");
                                targa= input.next();
                                System.out.print("Inserisci la marca del furgone da parcheggiare: ");
                                marca= input.next();
                                System.out.print("Inserisci il modello del furgone da parcheggiare: ");
                                modello= input.next();
                                System.out.print("Inserisci il peso del furgone da parcheggiare: ");
                                peso= input.nextDouble();
                                System.out.print("Inserisci l'anno di immatricolazione del furgone da parcheggiare: ");
                                annoImmatricolazione= input.nextInt();
                                System.out.print("Inserisci la capacità del carico del furgone da parcheggiare: ");
                                capacitaCarico= input.nextDouble();
                                System.out.print("Inserisci il numero di assi del furgone da parcheggiare: ");
                                numeroAssi= input.nextInt();
                                System.out.print("Inserisci il tipo di alimentazione del furgone da parcheggiare: ");
                                alimentazione=input.next();
                                System.out.print("Inserisci l'altezza massima del furgone da parcheggiare: '");
                                altezzaMax= input.nextDouble();
                                System.out.print("Inserisci il numero del box in cui vuoi parcheggiare il veicolo: ");
                                numBox= input.nextInt();
                                Furgone furgoneAgg=new Furgone(targa,marca,modello,peso,annoImmatricolazione,40,capacitaCarico,numeroAssi,altezzaMax,alimentazione);
                                System.out.println(" ");
                                garage.parcheggiaBoxSpecifico(numBox,furgoneAgg);
                                System.out.println(" ");
                                break;
                            }
                            default:System.out.println("TIPOLOGIA DEL VEICOLO INSERITA NON VALIDA!");
                        }
                    }while (!tipologia.equalsIgnoreCase("auto")&&!tipologia.equalsIgnoreCase("moto")&&!tipologia.equalsIgnoreCase("furgone"));
                    break;
                }
                default:
                    System.out.println(" ");
                    System.out.println("SCELTA INSERITA NON VALIDA!");
                    System.out.println(" ");
            }
        }while (scelta!=0);
    }
}