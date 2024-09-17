import static org.junit.jupiter.api.Assertions.assertEquals;

class NoleggioTest {

    @org.junit.jupiter.api.Test
    void getData() {
        Noleggio n = new Noleggio("13.01.1997", "11:00", "Butera", "Gela");
        String expectedData= "13.01.1997";
        assertEquals(expectedData, n.getData());
    }

    @org.junit.jupiter.api.Test
    void getOra() {
        Noleggio n = new Noleggio("13.01.1997", "11:00", "Butera", "Gela");
        String expectedOra= "11:00";
        assertEquals(expectedOra, n.getOra());
    }

    @org.junit.jupiter.api.Test
    void getGarageRitiro() {
        Noleggio n = new Noleggio("13.01.1997", "11:00", "Butera", "Gela");
        String expectedGarageRitiro= "Butera";
        assertEquals(expectedGarageRitiro, n.getGarageRitiro());
    }

    @org.junit.jupiter.api.Test
    void getGarageDeposito() {
        Noleggio n = new Noleggio("13.01.1997", "11:00", "Butera", "Gela");
        String expectedGarageDeposito= "Gela";
        assertEquals(expectedGarageDeposito, n.getGarageDeposito());
    }

    @org.junit.jupiter.api.Test
    void inserisciNoleggio() {
        Noleggio n=new Noleggio("01.01.2024-20.01.2024", "20:00", "Butera", "Gela");
        Noleggio.inserisciNoleggio("01.01.2024-20.01.2024", "20:00", "Butera", "Gela");
        String expectedData = "01.01.2024-20.01.2024";
        assertEquals(expectedData, n.getData());
    }
}