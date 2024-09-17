import static org.junit.jupiter.api.Assertions.assertEquals;

class AziendaTest {

    @org.junit.jupiter.api.Test
    void getNomeAzienda() {
        Azienda az = new Azienda("CS", "93011", "93012", "93013", "93014ABC", "93011");String expectedRagioneSociale= "CS";
        String expectedNomeAzienda= "CS";
        assertEquals(expectedNomeAzienda, az.getNomeAzienda());
    }

    @org.junit.jupiter.api.Test
    void getRagioneSociale() {
        Azienda az = new Azienda("CS", "93011", "93012", "93013", "93014ABC", "93011");String expectedRagioneSociale= "CS";
        expectedRagioneSociale = "93011";
        assertEquals(expectedRagioneSociale, az.getRagioneSociale());
    }

    @org.junit.jupiter.api.Test
    void getIndirizzoAzienda() {
        Azienda az = new Azienda("CS", "93011", "93012", "93013", "93014ABC", "93011");
        String expectedIndirizzoAzienda= "93012";
        assertEquals(expectedIndirizzoAzienda, az.getIndirizzoAzienda());
    }

    @org.junit.jupiter.api.Test
    void getABIAzienda() {
        Azienda az = new Azienda("CS", "93011", "93012", "93013", "93014ABC", "93011");
        String expectedABIAzienda= "93013";
        assertEquals(expectedABIAzienda, az.getABIAzienda());
    }

    @org.junit.jupiter.api.Test
    void getCABAzienda() {
        Azienda az = new Azienda("CS", "93011", "93012", "93013", "93014ABC", "93011");
        String expectedCABAzienda= "93014ABC";
        assertEquals(expectedCABAzienda, az.getCABAzienda());
    }

    @org.junit.jupiter.api.Test
    void getNumeroContoAzienda() {
        Azienda az = new Azienda("CS", "93011", "93012", "93013", "93014ABC", "93011");
        String expectedNumeroContoAzienda= "93011";
        assertEquals(expectedNumeroContoAzienda, az.getNumeroContoAzienda());
    }

    @org.junit.jupiter.api.Test
    void inserisciAzienda() {
        Azienda az = new Azienda("CS", "93011", "93012", "93013", "93014ABC", "93011");
        az = Azienda.inserisciAzienda("CS", "Via Gambuto 38", "93011", "93012", "93011ABC", "93011");
        String expectedNumeroContoAzienda = "93011";
        assertEquals(expectedNumeroContoAzienda, az.getNumeroContoAzienda());
    }
}