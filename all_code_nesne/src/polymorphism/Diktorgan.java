package polymorphism;

public class Diktorgan extends sekil{

    public Diktorgan(int konumX, int konumY, String Renk, int uzunluk, int genesilik) {
        super(konumX, konumY, Renk);
        this.uzunluk = uzunluk;
        this.genesilik = genesilik;
    }

    private int uzunluk;
    private int genesilik ;
///////////////////////////////////////////////////////////////////////
    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getGenesilik() {
        return genesilik;
    }

    public void setGenesilik(int genesilik) {
        this.genesilik = genesilik;
    }

    @Override
    public double AlanHesapla() {
        return 0;
    }
}
