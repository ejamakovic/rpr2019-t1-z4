package ba.unsa.etf.rpr;

public class Artikl {
    private int Cijena;
    private String Naziv, Kod;

    public Artikl(String naziv, int cijena, String kod) {
        Naziv=naziv; Cijena = cijena; Kod=kod;
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
