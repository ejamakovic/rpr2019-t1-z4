package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    Artikl a = new Artikl("ulje",2,"u");

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        s.setBroj_artikala(1000);
        assertThrows(Exception.class, ()-> { s.dodajArtikl(new Artikl("ulje",10,"MU5"));});
    }

    @Test
    void getArtikli() throws Exception {
        Supermarket s = new Supermarket();
        s.dodajArtikl(a);
        assertEquals(a,s.getArtikli()[0]);
    }

    @Test
    void izbaciArtiklSaKodom() throws Exception {
        Supermarket s = new Supermarket();
        s.dodajArtikl(a);
        s.izbaciArtiklSaKodom("u");
        assertEquals(null,s.izbaciArtiklSaKodom("u"));
    }
};