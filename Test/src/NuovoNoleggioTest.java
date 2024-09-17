import static org.junit.jupiter.api.Assertions.assertEquals;

class NuovoNoleggioTest {

    @org.junit.jupiter.api.Test
    void getCodiceFiscale() {
        NuovoNoleggio n = new NuovoNoleggio("GZZLNU97A53D960E", 22092024, 30092024, "DZ940LM");
        String expectedCodiceFiscale= "GZZLNU97A53D960E";
        assertEquals(expectedCodiceFiscale, n.getCodiceFiscale());
    }

    @org.junit.jupiter.api.Test
    void getDa() {
        NuovoNoleggio n = new NuovoNoleggio("GZZLNU97A53D960E", 22092024, 30092024, "DZ940LM");
    long expectedDa=22092024;
    assertEquals(expectedDa, n.getDa());
    }

    @org.junit.jupiter.api.Test
    void getA() {
        NuovoNoleggio n = new NuovoNoleggio("GZZLNU97A53D960E", 22092024, 30092024, "DZ940LM");
        long expectedA=30092024;
        assertEquals(expectedA, n.getA());
    }

    @org.junit.jupiter.api.Test
    void getTarga() {
        NuovoNoleggio n = new NuovoNoleggio("GZZLNU97A53D960E", 22092024, 30092024, "DZ940LM");
        String expectedTarga= "DZ940LM";
        assertEquals(expectedTarga, n.getTarga());
    }

    @org.junit.jupiter.api.Test
    void controlloData() {
        NuovoNoleggio n = new NuovoNoleggio("GZZLNU97A53D960E", 22092024, 30092024, "DZ940LM");
    }

    @org.junit.jupiter.api.Test
    void nuovoNoleggio() {
        NuovoNoleggio n = new NuovoNoleggio("GZZLNU97A53D960E", 22092024, 30092024, "DZ940LM");
        String expectedCodiceFiscale= "GZZLNU97A53D960E";
        assertEquals(expectedCodiceFiscale, n.getCodiceFiscale());
    }
}