import static org.junit.jupiter.api.Assertions.assertEquals;

class SociTest {

    @org.junit.jupiter.api.Test
    void getNome() {
        Soci s = new Soci("Luana", "Guzzardella", "GZZLNU97A53D960E", 1);
        String expectedNome= "Luana";
        assertEquals(expectedNome, s.getNome());
    }

    @org.junit.jupiter.api.Test
    void getCognome() {
        Soci s = new Soci("Luana", "Guzzardella", "GZZLNU97A53D960E", 1);
        String expectedCognome= "Guzzardella";
        assertEquals(expectedCognome, s.getCognome());
    }

    @org.junit.jupiter.api.Test
    void getCodiceFiscale() {
        Soci s = new Soci("Luana", "Guzzardella", "GZZLNU97A53D960E", 1);
        String expectedCodiceFiscale= "GZZLNU97A53D960E";
        assertEquals(expectedCodiceFiscale, s.getCodiceFiscale());
    }

    @org.junit.jupiter.api.Test
    void getEntita() {
        Soci s = new Soci("Luana", "Guzzardella", "GZZLNU97A53D960E", 1);
        int expectedEntita = 1;
        assertEquals(expectedEntita, s.getEntita());
    }

    @org.junit.jupiter.api.Test
    void cercaUtente() {
        Soci s;
        s = Soci.cercaUtente("Luana", "Guzzardella", "GZZLNU97A53D960E", 1);
        String expectedCodiceFiscale = "GZZLNU97A53D960E";
        assertEquals(expectedCodiceFiscale, s.getCodiceFiscale());
    }

    @org.junit.jupiter.api.Test
    void accedi() {
        Soci.accedi("GZZLNU97A53D960E");
        Soci soci = new Soci("Luana", "Guzzardella", "GZZLNU97A53D960E", 1);
        String expectedCodiceFiscale = "GZZLNU97A53D960E";
        assertEquals(expectedCodiceFiscale, soci.getCodiceFiscale());
    }

    @org.junit.jupiter.api.Test
    void gestisciUtente() {
        Soci s=new Soci("Marianna", "Guzzardella", "GZZMNN95C46D960H", 1);
        Soci.gestisciUtente("Marianna", "Guzzardella", "GZZMNN95C46D960H", 1);
        String expectedCodiceFiscale = "GZZMNN95C46D960H";
        assertEquals(expectedCodiceFiscale, s.getCodiceFiscale());
    }

    @org.junit.jupiter.api.Test
    void confermaUtente() {
        Soci s = new Soci("Luana", "Guzzardella", "GZZLNU97A53D960E", 1);
        Soci.confermaUtente(s);
        String expectedCodiceFiscale = "GZZLNU97A53D960E";
        assertEquals(expectedCodiceFiscale, s.getCodiceFiscale());
    }

    @org.junit.jupiter.api.Test
    void ricercaUtente() {
        Soci s = new Soci ("Luana", "Guzzardella", "GZZLNU97A53D960E", 1);
        String expectedCodiceFiscale ="GZZLNU97A53D960E";
        assertEquals(expectedCodiceFiscale,s.getCodiceFiscale());
    }
}