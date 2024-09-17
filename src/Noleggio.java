import java.util.LinkedList;
import java.util.Scanner;

public class Noleggio {

    static Scanner scan = new Scanner(System.in);
    public static LinkedList<Noleggio> gestoreNoleggio = new LinkedList<Noleggio>();


    //attributi della classe Noleggio
    private String data;
    private String ora;
    private String garageRitiro;
    private String garageDeposito;

    public Noleggio(String data, String ora, String garageRitiro, String garageDeposito) {
        this.data = data;
        this.ora = ora;
        this.garageRitiro = garageRitiro;
        this.garageDeposito = garageDeposito;
    }

    //get e set

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getGarageRitiro() {
        return garageRitiro;
    }

    public void setGarageRitiro(String garageRitiro) {
        this.garageRitiro = garageRitiro;
    }

    public String getGarageDeposito() {
        return garageDeposito;
    }

    public void setGarageDeposito(String garageDeposito) {
        this.garageDeposito = garageDeposito;
    }

    @Override
    public String toString() {
        return "Noleggio{" +
                "data='" + data + '\'' +
                ", ora='" + ora + '\'' +
                ", garageRitiro='" + garageRitiro + '\'' +
                ", garageDeposito='" + garageDeposito + '\'' +
                '}';
    }

    //UC1 - inserisciNoleggio
    public static void inserisciNoleggio(String data, String ora, String garageRitiro, String garageDeposito) {
        Noleggio n = new Noleggio(data, ora, garageRitiro, garageDeposito);
        System.out.println("Noleggio effettuato!");
        gestoreNoleggio.add(n);
    }

}

