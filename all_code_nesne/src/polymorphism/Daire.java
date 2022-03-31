package polymorphism;

public class Daire extends sekil{

    private float yariCap;
//////////////////////////////////////////////////////////////////////////////
    public Daire(int konumX, int konumY, String Renk, float yariCap) {
        super(konumX, konumY, Renk);
        this.yariCap = yariCap;
    }
////////////////////////////////////////////////////////////
    public float getYariCap() {
        return yariCap;
    }

    public void setYariCap(float yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double AlanHesapla() {
        return 0;
    }
}
