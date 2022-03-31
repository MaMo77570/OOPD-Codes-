package polymorphism;

public class KalitimUyuglamasi {
    public static void main(String[] args) {

        sekil[] sekiller= new sekil[3];

        Daire  daire1 = new Daire(20, 20 ,"Mavi", 2);
        Daire  daire2 = new Daire(22, 22 ,"Sari", 3);
        Diktorgan  diktorgan1 = new Diktorgan(11, 44,"Red" , 2 , 5);
        //----------------------------------------------------------------------------------
        sekiller[0]= daire1;
        sekiller[1]= daire2;
        sekiller[2]=diktorgan1;

        for (int i =0 ; i < 3 ; i++){
            System.out.print(sekiller[i].AlanHesapla());
        }

        //---------------------------------------------------------------------------
        System.out.println("*********");

        //Farklı modüller için aynı istemci kod kullanılabilir.
        sekilYazdir(daire1);
        sekilYazdir(diktorgan1);

        sekilYazdir2(daire1);
        sekilYazdir2(diktorgan1);

        //Yazılımlara yeni özellikler daha kolay eklenebilir
        sekil ucgen1= new EskenerUcgunu(10,5,"yeşil",10);
        sekilYazdir(ucgen1);

    }

    // cok bicimlilik olmasaydı yeni eklenecek her şekil için istemcinin (sekilYazdir2())  değiştirilmesi gerekecekti.
    public static void sekilYazdir2(sekil genelSekil){

        if (genelSekil instanceof Daire)
        {
            Daire daire = (Daire)genelSekil;
            System.out.println(daire);
            System.out.println("Alanı(cok bicimlilik olmasaydı)="+daire.AlanHesapla());
        }
        else if (genelSekil instanceof Diktorgan) {
            Diktorgan dikdortgen = (Diktorgan) genelSekil;
            System.out.println(dikdortgen);
            System.out.println("Alanı(cok bicimlilik olmasaydı)=" + dikdortgen.AlanHesapla());
        }
    }

    // cok bicimlilik sayesinde istemci (sekilYazdir())  içerisinde değişiklik yapmadan farklı şekilleri desteklemesi de sağlanabilir
    public static void sekilYazdir(sekil genelSekil){
        System.out.println(genelSekil);
        System.out.println("Alanı="+genelSekil.AlanHesapla());
    }




}

