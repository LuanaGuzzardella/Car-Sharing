import java.util.LinkedList;
import java.util.Scanner;

public class Tariffa {

    static Scanner scan = new Scanner(System.in);
    public static LinkedList<Soci> utente = new LinkedList<>();
    public static LinkedList<NuovoNoleggio> gestoreNuovoNoleggio = new LinkedList<>();

    //attributi della classe tariffa
    private int prezzoBase;
    private double tariffaOraria;

    public Tariffa(int prezzoBase, double tariffaOraria) {
        this.prezzoBase = prezzoBase;
        this.tariffaOraria = tariffaOraria;
    }

    //get e set
    public int getPrezzoBase() {
        return prezzoBase;
    }

    public void setPrezzoBase(int prezzoBase) {
        this.prezzoBase = prezzoBase;
    }

    public double getTariffaOraria() {
        return tariffaOraria;
    }

    public void setTariffaOraria(double tariffaOraria) {
        this.tariffaOraria = tariffaOraria;
    }

    @Override
    public String toString() {
        return "Tariffa{" +
                "prezzoBase=" + prezzoBase +
                ", tariffaOraria=" + tariffaOraria +
                '}';
    }

    //UC3 - calcolaTariffa
    public static double calcolaTariffaOraria(int ore) {
        double tariffa = 0.50 * ore;
        return tariffa;
    }

    //UC3 - calcolaPrezzo
    public static int calcolaPrezzo() {
        int prezzo = 5;
        return prezzo;
    }

    //UC3 - calcolaTariffa
    public static void calcolaTariffa(String codiceFiscale) {
        Soci.accedi(codiceFiscale);
        System.out.println("Per quante ore hai noleggiato l'auto?");
        int ore = Integer.parseInt(scan.nextLine());
        System.out.println("Che tipologia di auto hai noleggiato?");
        String tipologia = scan.nextLine();
        double valore = Auto.tassaTipologia(tipologia);
        System.out.println("L'auto scelta riporta tale prezzo: " + valore);
        double prezzo = calcolaTariffaOraria(ore);
        int prezzoBase = calcolaPrezzo();
        double totale = prezzo + prezzoBase + valore;
        System.out.println("Totale: " + totale + "€");
        System.out.println("Quanti noleggi hai fatto?");
        int numero = Integer.parseInt(scan.nextLine());
        if(numero>=2){
            double sconto = ((totale * 15) / 100);
            double nuovoprezzo = totale - sconto;
            System.out.println("Nuovo totale: " + nuovoprezzo + "€");
        }
    }
}