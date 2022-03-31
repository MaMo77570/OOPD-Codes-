package interface_hafta_2.pk;

public class veritabani_islemleri_repostory implements IVeriTabaniSorucu {
    private IVeriTabaniSorucu veritabaniSurucu;

    public veritabani_islemleri_repostory (IVeriTabaniSorucu veritabani) {
        this.veritabaniSurucu = (veritabani_islemleri_repostory) veritabani;
    }

    public void ekle() {
        veritabaniSurucu.connect();
        System.out.println("Ekleme işlemi yapılıyor....");
        veritabaniSurucu .sorguCalistir();
        veritabaniSurucu.baglantiSonlandir();
    }

    public void idAra(int id) {
        veritabaniSurucu.connect();
        System.out.println(id + "nolu kayıt için arama işlemi yapılıyor....");
        veritabaniSurucu.sorguCalistir();
        veritabaniSurucu.baglantiSonlandir();
    }

    public void listele() {
        veritabaniSurucu.connect();
        System.out.println("Listeleme işlemi yapılıyor....");
        veritabaniSurucu.sorguCalistir();
        veritabaniSurucu.baglantiSonlandir();
    }

    public void sil() {
        veritabaniSurucu.connect();
        System.out.println("Silme işlemi yapılıyor....");
        veritabaniSurucu.sorguCalistir();
        veritabaniSurucu.baglantiSonlandir();
    }

    public void güncelle() {
        veritabaniSurucu.connect();
        System.out.println("Güncelleme işlemi yapılıyor....");
        veritabaniSurucu.sorguCalistir();
        veritabaniSurucu.baglantiSonlandir();
    }


    @Override
    public void connect() {

    }

    @Override
    public void sorguCalistir() {

    }

    @Override
    public void baglantiSonlandir() {

    }
}
