import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AutoTest {

    @org.junit.jupiter.api.Test
    void getTarga() {
        Auto auto = new Auto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        String expectedTarga = "DZ940LM";
        assertEquals(expectedTarga, auto.getTarga());
    }

    @org.junit.jupiter.api.Test
    void getModello() {
        Auto auto = new Auto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        String expectedModello = "Multipla";
        assertEquals(expectedModello, auto.getModello());
    }

    @org.junit.jupiter.api.Test
    void getPosti() {
        Auto auto = new Auto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        int expectedPosti = 6;
        assertEquals(expectedPosti, auto.getPosti());
    }

    @org.junit.jupiter.api.Test
    void getManutenzione() {
        Auto auto = new Auto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        String expectedManutenzione = "23/03/2024";
        assertEquals(expectedManutenzione, auto.getManutenzione());
    }

    @org.junit.jupiter.api.Test
    void getCategoria() {
        Auto auto = new Auto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        String expectedCategoria = "Multijet";
        assertEquals(expectedCategoria, auto.getCategoria());
    }

    @org.junit.jupiter.api.Test
    void getDisponibilita() {
        Auto auto = new Auto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        int expectedDisponibilita = 1;
        assertEquals(expectedDisponibilita, auto.getDisponibilita());
    }

    @org.junit.jupiter.api.Test
    void getTipologia() {
        Auto auto = new Auto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        String expectedTipologia = "Benzina";
        assertEquals(expectedTipologia, auto.getTipologia());
    }

    @org.junit.jupiter.api.Test
    void getAutonomia() {
        Auto auto = new Auto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        int expectedAutonomia = 0;
        assertEquals(expectedAutonomia, auto.getAutonomia());
    }

    @org.junit.jupiter.api.Test
    void getAlimentazione() {
        Auto auto = new Auto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        int expectedAlimentazione = 2;
        assertEquals(expectedAlimentazione, auto.getAlimentazione());

    }

    @org.junit.jupiter.api.Test
    void getKmLitro() {
        Auto auto = new Auto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        int expectedKmLitro = 90;
        assertEquals(expectedKmLitro, auto.getKmLitro());

    }

    @org.junit.jupiter.api.Test
    void getGarage() {
        Auto auto = new Auto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        int expectedGarage = 001;
        assertEquals(expectedGarage, auto.getGarage());
    }

    @org.junit.jupiter.api.Test
    void ricercaAuto() {
        Auto a;
        a = Auto.inserisciAuto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        String expectedModello = "DZ940LM";
        String expectedCategoria = "Multijet";
        String expectedGarage = "001";
        if (a != null) {
            assertEquals(expectedModello, a.getModello());
            assertEquals(expectedCategoria, a.getCategoria());
            assertEquals(expectedGarage, a.getGarage());
        }
    }

    @org.junit.jupiter.api.Test
    void tassaTipologia() {
    }

    @org.junit.jupiter.api.Test
    void inserisciAuto() {
        Auto a;
        a = Auto.inserisciAuto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1,  "Benzina", 0, 2, 90, "001");
        String expectedTarga = "DZ940LM";
        if (a != null) {
            assertEquals(expectedTarga, a.getTarga());
        }
    }

    @org.junit.jupiter.api.Test
    void confermaAuto() {
        Auto auto = new Auto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        String expectedTarga = "DZ940LM";
        Auto.confermaAuto(auto);
        LinkedList<Auto> autos = new LinkedList<>();
        autos.add(auto);
        for (Auto a1 : autos) {
            if (a1.getTarga().equals(auto.getTarga())) {
                expectedTarga.equals(auto.getTarga());
            }
        }
        assertEquals(expectedTarga, auto.getTarga());
    }

    @org.junit.jupiter.api.Test
    void ricercaAuto2() {
        Auto a;
        a = Auto.inserisciAuto("DZ940LM", "Multipla", 6, "23/03/2024", "Multijet", 1, "Benzina", 0, 2, 90, "001");
        String expectedModello = "DZ940LM";
        String expectedCategoria = "Multijet";
        if (a != null) {
            assertEquals(expectedModello, a.getModello());
            assertEquals(expectedCategoria, a.getCategoria());
        }
    }
}