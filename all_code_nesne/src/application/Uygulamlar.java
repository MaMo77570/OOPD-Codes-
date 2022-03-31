package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Uygulamlar {

    public static <Liste> void main(String[] args) {

        kitap[] kitaplarStatikDizi = new kitap[2];
        kitaplarStatikDizi[0] = new kitap("MAMO", 20.2);
        kitaplarStatikDizi[1] = new kitap("ALi", 44.1);

         for (int  i =0 ; i < kitaplarStatikDizi.length ; i++)
             System.out.print(kitaplarStatikDizi[i]);
         
         for (kitap kitap:kitaplarStatikDizi)
             System.out.print(kitap.getAdi());

         //--------------------ArrayList--------------------------
        Liste<kitap> kitapAl = new ArrayList<kitap>();
        kitapAnd.add(new kitap("Kitap" , 22.2));



    }
}
