import static org.junit.jupiter.api.Assertions.assertEquals;

class GarageTest {

    @org.junit.jupiter.api.Test
    void getIdentificativo() {
        Garage g = new Garage (0000, "Via Gambuto 38", "09339393962");
        int expectedIdentificativo =0000;
        assertEquals(expectedIdentificativo,g.getIdentificativo());
    }

    @org.junit.jupiter.api.Test
    void getIndirizzo() {
        Garage g = new Garage (0000, "Via Gambuto 38", "09339393962");
        String expectedIndirizzo ="Via Gambuto 38";
        assertEquals(expectedIndirizzo,g.getIndirizzo());

    }

    @org.junit.jupiter.api.Test
    void getNumeroTelefono() {
        Garage g = new Garage (0000, "Via Gambuto 38", "09339393962");
        String expectedNumeroTelefono ="0933939362";
        assertEquals(expectedNumeroTelefono,g.getNumeroTelefono());
    }

    @org.junit.jupiter.api.Test
    void inserisciGarage() {
        Garage g = new Garage (1, "Via Gambuto 38", "0933939362");
        int expectedIdentificativo =1;
        assertEquals(expectedIdentificativo,g.getIdentificativo());
    }

    @org.junit.jupiter.api.Test
    void confermaGarage() {
        Garage g = new Garage(1, "Via Gambuto 38", "0933939362");
        Garage.confermaGarage(g);
        int expectedIdentificativo =1;
        assertEquals(expectedIdentificativo,g.getIdentificativo());
    }
}