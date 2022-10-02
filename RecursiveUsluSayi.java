import java.util.Scanner;

public class RecursiveUsluSayi {
    
    static void usAlma(int taban,int us){

        int sonuc = 1;

        while (us != 0) {
            sonuc *= taban;
            --us;
        }

        System.out.println("\nSonuç : "+sonuc);
    }
    
    
    
    
    public static void main(String[] args) {
        int us,taban;
        Scanner inp = new Scanner(System.in);

        System.out.print("Tabanı Girin : ");
        taban = inp.nextInt();

        System.out.print("Üssü Girin : ");
        us = inp.nextInt();

        usAlma(taban, us);

    }
}
