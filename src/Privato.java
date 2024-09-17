import java.util.LinkedList;

public class Privato {


    public static LinkedList<Privato> gestorePrivato = new LinkedList<>();

    //attributi della classe Privato
    private String indirizzo;
    private String ABI;
    private String CAB;
    private String numeroConto;

    public Privato(String indirizzo, String ABI, String CAB, String numeroConto) {
        this.indirizzo = indirizzo;
        this.ABI = ABI;
        this.CAB = CAB;
        this.numeroConto = numeroConto;
    }

    //get e set

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getABI() {
        return ABI;
    }

    public void setABI(String ABI) {
        this.ABI = ABI;
    }

    public String getCAB() {
        return CAB;
    }

    public void setCAB(String CAB) {
        this.CAB = CAB;
    }

    public String getNumeroConto() {
        return numeroConto;
    }

    public void setNumeroConto(String numeroConto) {
        this.numeroConto = numeroConto;
    }

    @Override
    public String toString() {
        return "Privato{" +
                "indirizzo='" + indirizzo + '\'' +
                ", ABI='" + ABI + '\'' +
                ", CAB='" + CAB + '\'' +
                ", numeroConto='" + numeroConto + '\'' +
                '}';
    }

    //UC6 - inserisciPrivato
    public static Privato inserisciPrivato(String indirizzo, String ABI, String CAB, String numeroConto) {
        Privato p;
        for (Privato pr : gestorePrivato) {
            if (pr.getNumeroConto().equals(numeroConto)) {
                System.out.println("Privato presente nella lista!");
            }
        }
        p = new Privato(indirizzo, ABI, CAB, numeroConto);
        gestorePrivato.add(p);
        return p;
    }

}