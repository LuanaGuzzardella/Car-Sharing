import static org.junit.jupiter.api.Assertions.assertEquals;

class PrivatoTest {

    @org.junit.jupiter.api.Test
    void getIndirizzo() {
        Privato pr = new Privato("Via Gambuto 38", "93011", "93012", "93013ABC");
        String expectedIndirizzo= "Via Gambuto 38";
        assertEquals(expectedIndirizzo, pr.getIndirizzo());
    }

    @org.junit.jupiter.api.Test
    void getABI() {
        Privato pr = new Privato("Via Gambuto 38", "93011", "93012", "93013ABC");
        String expectedABI = "93011";
        assertEquals(expectedABI, pr.getABI());
    }

    @org.junit.jupiter.api.Test
    void getCAB() {
        Privato pr = new Privato("Via Gambuto 38", "93011", "93012", "93013ABC");
        String expectedCAB = "93012";
        assertEquals(expectedCAB, pr.getCAB());
    }

    @org.junit.jupiter.api.Test
    void getNumeroConto() {
        Privato pr = new Privato("Via Gambuto 38", "93011", "93012", "93013ABC");
        String expectedNumeroConto= "93013ABC";
        assertEquals(expectedNumeroConto, pr.getNumeroConto());
    }

    @org.junit.jupiter.api.Test
    void inserisciPrivato() {
        Privato p;
        p=Privato.inserisciPrivato("Via Gambuto 38", "93011", "93012", "93011ABC");
        String expectedNumeroConto = "93011ABC";
        assertEquals(expectedNumeroConto, p.getNumeroConto());
    }
}