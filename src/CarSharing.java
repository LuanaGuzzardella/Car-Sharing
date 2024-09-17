import java.io.IOException;
import java.nio.charset.CodingErrorAction;
import java.util.LinkedList;
import java.util.Scanner;

public class CarSharing {

    static Scanner scan = new Scanner(System.in);
    public static LinkedList<NuovoNoleggio> gestoreNuovoNoleggio = new LinkedList<NuovoNoleggio>();

    //UC1 - Inizio Noleggio
    public static void UC1() throws IOException {
        System.out.println("CERCA LA TUA AUTO" +
                "\nModello: ");
        String modello = scan.nextLine();
        System.out.println("Categoria: ");
        String categoria = scan.nextLine();
        System.out.println("Identificativo Garage: ");
        String garage = scan.nextLine();

        Auto au;
        au = Auto.ricercaAuto(modello, categoria, garage);
        if (au != null) {
            System.out.println("Inserisci la Targa dell'auto scelta: ");
            String targa = scan.nextLine();
            System.out.println("Da (nel formato ggmmaaaa): ");
            long da = scan.nextLong();
            System.out.println("A (nel formato ggmmaaaa): ");
            long a = scan.nextLong();
            int i=NuovoNoleggio.controlloData(da, a, targa);
            if(i==1){
                System.out.println("Da (nel formato ggmmaaaa): ");
                long da1 = scan.nextLong();
                System.out.println("A (nel formato ggmmaaaa): ");
                long a1 = scan.nextLong();
                int c=NuovoNoleggio.controlloData(da1,a1, targa);
            }

            System.out.println("INSERISCI NOLEGGIO");
            String dat= scan.nextLine();;
            System.out.println("Data nel formato gg.mm.aaaa: ");
            String data= scan.nextLine();;
            System.out.println("Ora nel formato hh:mm: ");
            String ora = scan.nextLine();
            System.out.println("Indirizzo Garage di Deposito: ");
            String garageDeposito = scan.nextLine();
            Noleggio.inserisciNoleggio(data, ora, garage, garageDeposito);

            System.out.println("INSERISCI INFORMAZIONI UTENTE" +
                    "\nNome: ");
            String nome = scan.nextLine();
            System.out.println("Cognome: ");
            String cognome = scan.nextLine();
            System.out.println("Codice Fiscale: ");
            String codiceFiscale = scan.nextLine();
            System.out.println("Entita: 1.Privato - 2.Azienda");
            int entita = Integer.parseInt(scan.nextLine());
            Soci s;
            s = Soci.cercaUtente(nome, cognome, codiceFiscale, entita);
            System.out.println((s));
            NuovoNoleggio.nuovoNoleggio(codiceFiscale, da, a, targa);
        }
    }

    //UC2 - Ritiro Auto
    public static void UC2() throws IOException {

        //fare accesso
        System.out.println("Inserisci il Codice Fiscale: ");
        String codiceFiscale =scan.nextLine();

        Soci.accedi(codiceFiscale);

        //inserisci targa
        System.out.println("Inserisci targa dell'auto che stai ritirando:");
        String targa =scan.nextLine();

        Auto.setDisponibilita(targa);
    }

    //UC3 - Termina Noleggio
    public static void UC3() throws IOException {

        //accesso tramite codice fiscale
        System.out.println("Inserisci il Codice Fiscale: ");
        String codiceFiscale = scan.nextLine();
        Soci.accedi(codiceFiscale);

        System.out.println("Inserisci la Targa:");
        String targa = scan.nextLine();
        Auto.resetDisponibilita(targa);
        Tariffa.calcolaTariffa(codiceFiscale);
    }


    //UC4 - Inserisci Auto
    public static void UC4() throws IOException {

        Auto gestoreAuto;

        System.out.println("Inserisci una nuova auto:\n" +
                "Targa:");
        String targa = scan.nextLine();
        System.out.println("Modello");
        String modello = scan.nextLine();
        System.out.println("Posti:");
        int posti = Integer.parseInt(scan.nextLine());
        System.out.println("Manutenzione nel formato gg.mm.aaaa:");
        String manutenzione = scan.nextLine();
        System.out.println("Categoria:");
        String categoria = scan.nextLine();
        System.out.println("Disponibilità: 1.SI - 2.NO");
        int disponibilita = Integer.parseInt(scan.nextLine());
        System.out.println("Tipologia: (Berlina/Coupe/Ibrida/Monovolume/Elettrica)");
        String tipologia = scan.nextLine();
        System.out.println("Autonomia: (1-100) oppure 0 se è un'auto tradizionale");
        int autonomia = Integer.parseInt(scan.nextLine());
        System.out.println("Alimentazione: (1.Benzina, 2.Diesel, 3.Elettrica, 4.Metano, 5.Ibrida)");
        int alimentazione = Integer.parseInt(scan.nextLine());
        System.out.println("kmLitro:");
        double kmLitro =  Double.parseDouble(scan.nextLine());
        System.out.println("Identificativo garage:");
        String garage = scan.nextLine();


        gestoreAuto = Auto.inserisciAuto(targa, modello, posti, manutenzione, categoria, disponibilita, tipologia, autonomia, alimentazione, kmLitro, garage);

        //Conferma Auto
        if (gestoreAuto != null) {

            System.out.println(gestoreAuto);
            System.out.println("Vuoi confermare l'auto inserita? y/n");
            String x = scan.nextLine();
            if (x.equals("y")) {
                Auto.confermaAuto(gestoreAuto);
            } else if (x.equals("n")) {
                System.out.println("Inserimento annullato!");
            } else {
                System.out.println("Errore!");
            }
        }
    }

    //UC5 - Ricerca Auto
    public static void UC5 () {
        System.out.println("Ricerca Auto");
        System.out.println("Inserisci Modello:");
        String m = scan.nextLine();
        System.out.println("Inserisci Categoria:");
        String c = scan.nextLine();
        Auto.ricercaAuto2(m, c);
    }

    //UC6 - Gestisci Utente
    public static void UC6() throws IOException {
        Soci utente;
        System.out.println("INSERISCI NUOVO UTENTE\n" +
                "Nome: ");
        String nome = scan.nextLine();
        System.out.println("Cognome:");
        String cognome = scan.nextLine();
        System.out.println("Codice Fiscale:");
        String codiceFiscale = scan.nextLine();
        System.out.println("Entita: 1.Privato - 2.Azienda");
        int entita = Integer.parseInt(scan.nextLine());
        utente = Soci.gestisciUtente(nome, cognome, codiceFiscale, entita);
        if (utente != null) {
            if (entita == 1) {
                Privato p;
                System.out.println("INSERISCI NUOVO UTENTE PRIVATO\n" +
                        "Indirizzo: ");
                String indirizzo = scan.nextLine();
                System.out.println("ABI:");
                String ABI = scan.nextLine();
                System.out.println("CAB:");
                String CAB = scan.nextLine();
                System.out.println("Numero Conto:");
                String numeroConto = scan.nextLine();
                p = Privato.inserisciPrivato(indirizzo, ABI, CAB, numeroConto);
                System.out.println(p);
                System.out.println("Vuoi confermare l'utente privato aggiunto? y/n");
                String x = scan.nextLine();
                if (x.equals("y")) {
                    Soci.confermaUtente(utente);
                } else if (x.equals("n")) {
                    System.out.println("Impossibile aggiungere utente!");
                } else {
                    System.out.println("Errore!");
                }
            } else if (entita == 2) {
                Azienda az;
                System.out.println("INSERISCI NUOVA AZIENDA\n" +
                        "Ragione Sociale: ");
                String ragioneSociale = scan.nextLine();
                System.out.println("Nome Azienda:");
                String nomeAzienda = scan.nextLine();
                System.out.println("Indirizzo Azienda:");
                String indirizzoAzienda = scan.nextLine();
                System.out.println("ABI Azienda:");
                String ABIAzienda = scan.nextLine();
                System.out.println("CAB Azienda:");
                String CABAzienda = scan.nextLine();
                System.out.println("Numero Conto Azienda:");
                String numeroContoAzienda = scan.nextLine();

                az = Azienda.inserisciAzienda(ragioneSociale, nomeAzienda, indirizzoAzienda, ABIAzienda, CABAzienda, numeroContoAzienda);
                System.out.println(az);

                System.out.println("Vuoi confermare l'azienda aggiunta? y/n");
                String x = scan.nextLine();
                if (x.equals("y")) {
                    Soci.confermaUtente(utente);
                } else if (x.equals("n")) {
                    System.out.println("Impossibile aggiungere utente!");
                } else {
                    System.out.println("Errore!");
                }
            }
        }
    }

    //UC7 - Ricerca Utente
    public static void UC7() {
        System.out.println("RICERCA UTENTE");
        System.out.println("Inserisci Codice Fiscale:");
        String cf = scan.nextLine();
        Soci.ricercaUtente(cf);
    }

    //UC8 - inserisciGarage
    public static void UC8(){
        Garage g;
        System.out.println("INSERISCI GARAGE"+
                "\nInserisci Identificativo:");
        int identificativo=Integer.parseInt(scan.nextLine());
        System.out.println("Inserisci Indirizzo:");
        String indirizzo=scan.nextLine();
        System.out.println("Inserisci Numero di Telefono:");
        String numeroTelefono = scan.nextLine();
        g = Garage.inserisciGarage(identificativo, indirizzo, numeroTelefono);

        System.out.println("Vuoi confermare il garage? y/n:");
        String x = scan.nextLine();
        if (x.equals("y")) {
            Garage.confermaGarage(g);
        } else if (x.equals("n")) {
            System.out.println("Impossibile aggiungere utente!");
        } else {
            System.out.println("Errore!");
        }

    }

}

