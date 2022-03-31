package pkt;

import java.util.Scanner;

public class hesapmakinasi {
    public static void main(String[] args) {

        hesaplar hesap1 = new hesaplar(2, 2);
        System.out.print(hesap1.toplama());
        System.out.print(hesap1.cikarma());
        System.out.print(hesap1.bolme());
        System.out.print(hesap1.carpma());
        Scanner input = new Scanner(System.in);


        System.out.print("ikinci Sayi Giriniz");
        int ikinci = input.nextInt();

        hesaplar hesap2 = new hesaplar(20, ikinci);
        System.out.println(hesap2.toplama());
        System.out.println(hesap2.cikarma());
        System.out.println(hesap2.carpma());
        System.out.println(hesap2.bolme());


    }
}
