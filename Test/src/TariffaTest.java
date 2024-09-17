import static org.junit.jupiter.api.Assertions.assertEquals;

class TariffaTest {

    @org.junit.jupiter.api.Test
    void calcolaTariffa() {
        Soci s=new Soci("Marianna", "Guzzardella", "GZZMNN95C46D960H", 1);
        String expectedCodiceFiscale = "GZZMNN95C46D960H";
        assertEquals(expectedCodiceFiscale, s.getCodiceFiscale());
    }
}