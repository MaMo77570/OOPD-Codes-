package polymorphism;

abstract  class sekil {
    private int konumX;
    private int konumy;
    private String Renk;
//////////////////////////////////////////////////////////

    sekil(int konumX, int konumY , String Renk){
        this.konumX = konumX;
        this.konumX= konumY;
        this.Renk = Renk;

    }
    /////////////////////////////////////////////////////////////////////
    public int getKonumX() {
        return konumX;
    }

    public void setKonumX(int konumX) {
        this.konumX = konumX;
    }

    public int getKonumy() {
        return konumy;
    }

    public void setKonumy(int konumy) {
        this.konumy = konumy;
    }

    public String getRenk() {
        return Renk;
    }

    public void setRenk(String renk) {
        Renk = renk;
    }
    /////////////////////////////////////////////////////////////////////

    public void konumDegitir(double x, double y){

    }
    public abstract double AlanHesapla();
    /////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "sekil{" +
                "konumX=" + konumX +
                ", konumy=" + konumy +
                ", Renk='" + Renk + '\'' +
                '}';
    }
}
