package ba.unsa.etf.rpr;

import java.util.Objects;

public class Artikl {
    private int Cijena;
    private String Naziv, Kod;

    public Artikl(String naziv, int cijena, String kod) {
        Naziv=naziv; Cijena = cijena; Kod=kod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikl artikl = (Artikl) o;
        return Cijena == artikl.Cijena &&
                Objects.equals(Naziv, artikl.Naziv) &&
                Objects.equals(Kod, artikl.Kod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Cijena, Naziv, Kod);
    }

    public String getKod() {
        return Kod;
    }
    public String getNaziv() {
        return Naziv;
    }
    public int getCijena() {
        return Cijena;
    }
};
