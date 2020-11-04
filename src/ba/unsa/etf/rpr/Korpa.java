package ba.unsa.etf.rpr;

public class Korpa {
    private final int kapacitet=50;
    private Artikl[] niz = new Artikl[kapacitet];
    private int broj_artikala;

    public Korpa() {
    }

    public boolean dodajArtikl(Artikl a) {
        if(broj_artikala+1<kapacitet) {
            niz[broj_artikala] = a;
            broj_artikala++;
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return niz;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0;i<broj_artikala;i++){
            if(niz[i].getKod().equals(kod)) {
                broj_artikala--;
                Artikl a=niz[i];
                for(int j=i;j<broj_artikala;j++)
                    niz[j]=niz[j+1];
                niz[broj_artikala+1]=null;
                return a;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0;i<broj_artikala;i++){
            suma+=niz[i].getCijena();
        }
        return  suma;
    }
};
