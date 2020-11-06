package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void dobijanjeKod(){
        Artikl a = new Artikl("Kafa",10,"VIS");
        assertEquals("VIS", a.getKod());
    }

    @Test
    void dobijanjeNaziv(){
        Artikl a = new Artikl("Kafa",10,"VIS");
        assertEquals("Kafa", a.getNaziv());
    }

    @Test
    void dobijanjeCijena(){
        Artikl a = new Artikl("Kafa",10,"VIS");
        assertEquals(10,a.getCijena());
    }

};