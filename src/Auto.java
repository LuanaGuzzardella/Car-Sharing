import java.util.LinkedList;
import java.util.Scanner;

public class Auto {

    Scanner scan = new Scanner(System.in);
    public static LinkedList<Auto> gestoreAuto = new LinkedList<>();

    //attributi della classe auto
    private String targa;
    private String modello;
    private int posti;
    private String manutenzione;
    private String categoria;
    private int disponibilita;
    private String tipologia;
    private int autonomia;
    private int alimentazione;
    private double kmLitro;
    private String garage;


    public Auto(String targa, String modello, int posti, String manutenzione, String categoria, int disponibilita, String tipologia, int autonomia, int alimentazione, double kmLitro, String garage) {
        this.targa = targa;
        this.modello = modello;
        this.posti = posti;
        this.manutenzione = manutenzione;
        this.categoria = categoria;
        this.disponibilita = disponibilita;
        this.tipologia = tipologia;
        this.autonomia = autonomia;
        this.alimentazione = alimentazione;
        this.kmLitro = kmLitro;
        this.garage = garage;
    }

    //get e set
    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }

    public String getManutenzione() {
        return manutenzione;
    }

    public void setManutenzione(String manutenzione) {
        this.manutenzione = manutenzione;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(int disponibilita) {
        this.disponibilita = disponibilita;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(int alimentazione) {
        this.alimentazione = alimentazione;
    }

    public double getKmLitro() {
        return kmLitro;
    }

    public void setKmLitro(double kmLitro) {
        this.kmLitro = kmLitro;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "targa='" + targa + '\'' +
                ", modello='" + modello + '\'' +
                ", posti=" + posti +
                ", manutenzione='" + manutenzione + '\'' +
                ", categoria='" + categoria + '\'' +
                ", disponibilita=" + disponibilita +
                ", tipologia='" + tipologia + '\'' +
                ", autonomia=" + autonomia +
                ", alimentazione=" + alimentazione +
                ", kmLitro=" + kmLitro +
                ", garage='" + garage + '\'' +
                '}';
    }

    //UC1 - ricercaAuto
    public static Auto ricercaAuto(String modello, String categoria, String garage) {
        for (Auto au : gestoreAuto) {
            if (au.getModello().equals(modello) && au.getCategoria().equals(categoria) && au.getGarage().equals(garage)) {
                System.out.println("Per la disponibilità istantanea: 1.SI - 2.NO");
                System.out.println(au);
                return au;
            } else if (!au.getModello().equals(modello) || !au.getCategoria().equals(categoria)) {
                System.out.println("Auto non trovata");
                return null;
            }
        }
        return null;
    }

    //UC2 - setDisponibilità
    public static void setDisponibilita(String targa) {
        for (Auto a : gestoreAuto) {
            if (a.getTarga().equals(targa)) {
                System.out.println("Auto trovata!");
                if (a.getDisponibilita() == 1) {
                    a.setDisponibilita(2);
                    System.out.println("Auto resa non disponibile!");
                }
            }
        }

    }

    //UC2 - resetDisponibilita
    public static void resetDisponibilita(String targa) {
        for (Auto a : gestoreAuto) {
            if (a.getTarga().equals(targa)) {
                System.out.println("Auto trovata!");
                if (a.getDisponibilita() == 2) {
                    a.setDisponibilita(1);
                    System.out.println("Auto resa nuovamente disponibile!");
                }
            }
        }
    }


    //UC3 - tassaTipologia
    public static double tassaTipologia(String tipologia) {
        return switch (tipologia) {
            case "Berlina" -> 1.00;
            case "Coupe", "Ibrida" -> 2.00;
            case "Monovolume" -> 1.50;
            case "Elettrica" -> 2.50;
            default -> 0;
        };
    }

    //UC4 - inserisciAuto
    public static Auto inserisciAuto(String targa, String modello, int posti, String manutenzione, String categoria, int disponibilita, String tipologia, int autonomia, int alimentazione, double kmLitro, String garage) {
        Auto auto;
        for (Auto a : gestoreAuto) {

            //Controllo della targa

            if (a.getTarga().equals(targa)) {
                System.out.println("Auto già presente in lista!");
                return null;
            }

        }
        auto = new Auto(targa, modello, posti, manutenzione, categoria, disponibilita, tipologia, autonomia, alimentazione, kmLitro, garage);
        return auto;
    }

    //UC4 - ConfermaAuto
    public static void confermaAuto(Auto auto) {
        gestoreAuto.add(auto);
        System.out.println("Auto aggiunta correttamente!");
    }

    //UC5 - ricercaAuto
    public static void ricercaAuto2(String modello, String categoria) {
        for (Auto au : gestoreAuto) {
            if (au.getModello().equals(modello) && au.getCategoria().equals(categoria)) {
                System.out.println("Per la disponibilità: 1.SI - 2.NO");
                System.out.println(au);
            }
        }
    }
}
