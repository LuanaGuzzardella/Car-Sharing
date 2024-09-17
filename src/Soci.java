import java.util.LinkedList;
import java.util.Scanner;

public class Soci {

    static Scanner scan = new Scanner(System.in);
    public static LinkedList<Soci> utente = new LinkedList<>();

    //attributi della classe Soci
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private int entita;
    private int numeroNoleggi;

    //non inseriamo il numero noleggi ma lo calcoliamo
    public Soci(String nome, String cognome, String codiceFiscale, int entita) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.entita = entita;
    }

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public int getEntita() {
        return entita;
    }

    public void setEntita(int entita) {
        this.entita = entita;
    }

    public int getNumeroNoleggi() {
        return numeroNoleggi;
    }

    public void setNumeroNoleggi(int numeroNoleggi) {
        this.numeroNoleggi = numeroNoleggi;
    }

    @Override
    public String toString() {
        return "Soci{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", entita=" + entita +
                ", numeroNoleggi=" + numeroNoleggi +
                '}';
    }

  //UC1 - cercaUtente
    public static Soci cercaUtente(String nome, String cognome, String codiceFiscale, int entita) {
        Soci uten;
        for (Soci s : utente) {
            if (s.getCodiceFiscale().equals(codiceFiscale)) {
                System.out.println("Utente presente in lista!");
                int nn=s.getNumeroNoleggi();
                int i = ++nn;
                s.setNumeroNoleggi(i);
                System.out.println("Numero noleggi "+ i);
                return s;
            }
        }
        System.out.println("Utente non presente in lista!");
        System.out.println("Vuoi inserire un nuovo utente?y/n:");
        String scelta = scan.nextLine();
        if (scelta.equals("y")) {
            System.out.println("Inserisci utente");
            uten = new Soci(nome, cognome, codiceFiscale, entita);
            utente.add(uten);
            int nn=uten.getNumeroNoleggi();
            int i = ++nn;
            uten.setNumeroNoleggi(i);
            System.out.println("Numero noleggi "+ i);
            System.out.println("Utente aggiunto correttamente!");
            return uten;
        } else if (scelta.equals("n")) {
            System.out.println("Utente non inserito!");
        } else {
            System.out.println("Errore!");
        }
            return null;
        }


        //UC2 - accedi
    public static void accedi(String codiceFiscale) {
        for (Soci s : utente) {
            if (s.getCodiceFiscale().equals(codiceFiscale)) {
                System.out.println("Accesso effettuato!");
            }
        }
    }


    //UC6 - gestisciUtente
    public static Soci gestisciUtente(String nome, String cognome, String codiceFiscale, int entita) {
        Soci soci;

        //Controllo del codiceFiscale
        soci = new Soci(nome, cognome, codiceFiscale, entita);
        System.out.println(soci);
        return soci;
    }

    //UC6 - confermaUtente
    public static void confermaUtente(Soci u) {
        utente.add(u);
        System.out.println("Utente aggiunto correttamente!");
    }


    //UC7 - ricercaUtente
    public static void ricercaUtente(String codiceFiscale) {
        for (Soci s : utente) {
            if (s.getCodiceFiscale().equals(codiceFiscale)) {
                System.out.println(s);
            }
        }

    }
}
