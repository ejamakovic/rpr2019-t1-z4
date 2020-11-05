package ba.unsa.etf.rpr;

public class Supermarket {
    private final int kapacitet=1000;
    private int broj_artikala=0;
    private Artikl[] niz = new Artikl[kapacitet];

    public void dodajArtikl(Artikl A) throws Exception {
        if(broj_artikala+1<kapacitet){
            niz[broj_artikala]= A;
            broj_artikala++;
        }
        else
            throw new Exception("Pun Supermarket");
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
                niz[broj_artikala]=null;
                return a;
            }
        }
        return null;
    }
};
