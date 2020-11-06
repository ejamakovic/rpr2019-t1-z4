package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("kafa", 2, "vis");
        k.dodajArtikl(a);
        assertEquals(k.getArtikli()[0],a);
    }

    @Test
    void getArtikli() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("kafa", 2, "vis");
        k.dodajArtikl(a);
        Artikl[] niz = k.getArtikli();
        assertEquals("kafa",niz[0].getNaziv());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("kafa", 2, "vis");
        k.dodajArtikl(a);
        Artikl b=k.izbaciArtiklSaKodom("vis");
        assertEquals(b,a);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("kafa", 2, "vis");
        k.dodajArtikl(a);
        k.dodajArtikl(new Artikl("secer",1000,"sec"));
        assertEquals(1002,k.dajUkupnuCijenuArtikala());
    }
};