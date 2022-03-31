package application;

public class kitap {
    private String adi;
    private double birimFiyati;
//----------------------------------------------------
    kitap(String adi , double birimFanti){

        this.adi = adi;
        this.birimFiyati= birimFanti;
    }

    //---------------------------------------------------


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public double getBirimFiyati() {
        return birimFiyati;
    }

    public void setBirimFiyati(double birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    //------------------------------------------------------------


    @Override
    public String toString() {
        return "kitap{" +
                "adi{' " + adi + '\''+
                ", birimFiyati=" + birimFiyati + '}';

    }


}
