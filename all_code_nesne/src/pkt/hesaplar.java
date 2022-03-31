package pkt;

public class hesaplar {
    private int ilkSayi;
    private int ikinciSayi;

    public hesaplar(int ilk, int ikinci) {
        this.ilkSayi = ilk;
        this.ikinciSayi = ikinci;
    }
//----------------------------------------------------------------------//
    public int getIlkSayi() {
        return ilkSayi;
    }

    public void setIlkSayi(int ilkSayi) {
        this.ilkSayi = ilkSayi;
    }

    public int getIkinciSayi() {
        return ikinciSayi;
    }

    public void setIkinciSayi(int ikinciSayi) {
        this.ikinciSayi = ikinciSayi;
    }
//---------------------------------------------------------------------//
    public double toplama() {
        return ikinciSayi + ilkSayi;
    }

    public double carpma() {
        return ikinciSayi * ilkSayi;
    }

    public double cikarma() {
        return ikinciSayi - ilkSayi;
    }

    public double bolme() {
        return ikinciSayi / ilkSayi;
    }
}


