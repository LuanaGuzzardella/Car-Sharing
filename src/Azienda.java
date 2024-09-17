import java.util.LinkedList;

public class Azienda {


    public static LinkedList<Azienda> gestoreAzienda = new LinkedList<>();

    //attributi della classe azienda
    private String nomeAzienda;
    private String ragioneSociale;
    private String indirizzoAzienda;
    private String ABIAzienda;
    private String CABAzienda;
    private String numeroContoAzienda;

    public Azienda(String nomeAzienda, String ragioneSociale, String indirizzoAzienda, String ABIAzienda, String CABAzienda, String numeroContoAzienda) {
        this.nomeAzienda = nomeAzienda;
        this.ragioneSociale = ragioneSociale;
        this.indirizzoAzienda = indirizzoAzienda;
        this.ABIAzienda = ABIAzienda;
        this.CABAzienda = CABAzienda;
        this.numeroContoAzienda = numeroContoAzienda;
    }


    //get e set
    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getIndirizzoAzienda() {
        return indirizzoAzienda;
    }

    public void setIndirizzoAzienda(String indirizzoAzienda) {
        this.indirizzoAzienda = indirizzoAzienda;
    }

    public String getABIAzienda() {
        return ABIAzienda;
    }

    public void setABIAzienda(String ABIAzienda) {
        this.ABIAzienda = ABIAzienda;
    }

    public String getCABAzienda() {
        return CABAzienda;
    }

    public void setCABAzienda(String CABAzienda) {
        this.CABAzienda = CABAzienda;
    }

    public String getNumeroContoAzienda() {
        return numeroContoAzienda;
    }

    public void setNumeroContoAzienda(String numeroContoAzienda) {
        this.numeroContoAzienda = numeroContoAzienda;
    }

    @Override
    public String toString() {
        return "Azienda{" +
                "nomeAzienda='" + nomeAzienda + '\'' +
                ", ragioneSociale='" + ragioneSociale + '\'' +
                ", indirizzoAzienda='" + indirizzoAzienda + '\'' +
                ", ABIAzienda='" + ABIAzienda + '\'' +
                ", CABAzienda='" + CABAzienda + '\'' +
                ", numeroContoAzienda='" + numeroContoAzienda + '\'' +
                '}';
    }

    //UC6 - inserisciAzienda
    public static Azienda inserisciAzienda(String ragioneSociale, String nomeAzienda, String indirizzoAzienda, String ABIAzienda, String CABAzienda, String numeroContoAzienda) {
        Azienda az;
        for (Azienda a : gestoreAzienda) {
            if (a.getNomeAzienda().equals(nomeAzienda)) {
                System.out.println("Azienda presente nella lista!");
            }
        }
        az = new Azienda(ragioneSociale, nomeAzienda, indirizzoAzienda, ABIAzienda, CABAzienda, numeroContoAzienda);
        gestoreAzienda.add(az);
        return az;
    }

}

