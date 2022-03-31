package polymorphism;

public class EskenerUcgunu extends sekil{
    private int kener;

    public EskenerUcgunu(int konumX, int konumY, String Renk, int kener) {
        super(konumX, konumY, Renk);
        this.kener = kener;
    }

    public int getKener() {
        return kener;
    }

    public void setKener(int kener) {
        this.kener = kener;
    }

    @Override
    public double AlanHesapla() {
        return 0;
    }
}
