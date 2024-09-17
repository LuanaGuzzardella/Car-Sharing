import java.util.LinkedList;
import java.util.Scanner;

public class Garage {

    static Scanner scan = new Scanner(System.in);
    public static LinkedList<Garage> gestoreGarage = new LinkedList<>();

    //attriburi della classe garage
    private int identificativo;
    private String indirizzo;
    private String numeroTelefono;

    public Garage(int identificativo, String indirizzo, String numeroTelefono) {
        this.identificativo = identificativo;
        this.indirizzo = indirizzo;
        this.numeroTelefono = numeroTelefono;
    }

    //get e set
    public int getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "identificativo=" + identificativo +
                ", indirizzo='" + indirizzo + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }

    //UC8 - inserisciGarage
    public static Garage inserisciGarage(int identificativo, String indirizzo, String numeroTelefono) {
        Garage ga;
        for (Garage g : gestoreGarage) {
            if (g.getIdentificativo()==identificativo) {
                System.out.println("Garage presente nella lista!");
            }
        }
        ga = new Garage(identificativo, indirizzo, numeroTelefono);
        return ga;
    }
    public static void confermaGarage(Garage g) {
        gestoreGarage.add(g);
        System.out.println("Garage aggiunto correttamente!");
    }

}