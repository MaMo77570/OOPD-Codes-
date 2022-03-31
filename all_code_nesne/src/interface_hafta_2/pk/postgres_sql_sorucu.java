package interface_hafta_2.pk;

public class postgres_sql_sorucu extends VeritabaniUygulamasi {


    public void connect() {
        System.out.println("PostgreSQL veritabanına bağlanıyor...");
    }

    public void ssorguCalistir() {
        System.out.println("PostgreSQL sorgusu çalıştırılıyor...");
    }

    public void baglantiSonlandir() {

        System.out.println("PostgreSQL veritabanı bağlantısı sonlandırılıyor...");

    }
}
