package hafta2;

public class kisi {
    private String isim;
    private int maas;
    private String bolum;

    kisi(String isim , int maas , String bolum ){
        this.maas = maas;
        this.bolum = bolum;
        this.isim= isim;
    }


    public void calis(){
        System.out.print("Running...");
    };

    public void bilgileriGoster(){
        System.out.print("isim" + isim);
        System.out.print("mass" + maas);
        System.out.print("isim" + bolum);
    };

}

