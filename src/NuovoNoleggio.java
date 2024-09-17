import java.util.LinkedList;
import java.util.Scanner;


public class NuovoNoleggio {

    static Scanner scan = new Scanner(System.in);
    public static LinkedList<NuovoNoleggio> gestoreNuovoNoleggio = new LinkedList<NuovoNoleggio>();
    public static LinkedList<Soci> utente = new LinkedList<>();
    public static LinkedList<Auto> gestoreAuto = new LinkedList<>();

    //attributi della classe Noleggio
    private String codiceFiscale;
    private long da;
    private long a;
    private String targa;

    public NuovoNoleggio(String codiceFiscale, long da, long a, String targa) {
        this.codiceFiscale = codiceFiscale;
        this.da = da;
        this.a = a;
        this.targa = targa;
    }

    //get e set

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public long getDa() {
        return da;
    }

    public void setDa(long da) {
        this.da = da;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "NuovoNoleggio{" +
                "codiceFiscale='" + codiceFiscale + '\'' +
                ", da=" + da +
                ", a=" + a +
                ", targa='" + targa + '\'' +
                '}';
    }

    //UC1 - controlloData
    public static int controlloData(long da, long a, String targa) {
        //per la disponibilità a lungo termine
        for(Auto au: gestoreAuto) {
            if(au.getTarga().equals(targa)) {
                for (NuovoNoleggio nn : gestoreNuovoNoleggio) {
                    if (nn.getDa() == da && nn.getA() == a || nn.getA() > da || nn.getDa() < a) {
                        System.out.println("Nel periodo selezionato l'auto è occupata!");
                        return 1;
                    }
                }
            }
        }
            System.out.println("Data libera");
            return 0;
    }

    //UC1 - nuovoNoleggio
    public static void nuovoNoleggio(String codiceFiscale, long da, long a, String targa) {
        NuovoNoleggio nnoleggio;
        nnoleggio = new NuovoNoleggio(codiceFiscale, da, a, targa);
        for (Soci u : utente) {
            if (u.getCodiceFiscale().equals(codiceFiscale)) {
                int num = u.getNumeroNoleggi();
                u.setNumeroNoleggi(num + 1);
                gestoreNuovoNoleggio.add(nnoleggio);
                System.out.println(u);
            }
        }
    }

}

