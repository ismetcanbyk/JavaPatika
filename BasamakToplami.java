import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        int sayi,copySayi, top = 0, basamak = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("\nBir sayı giriniz : ");
        sayi = inp.nextInt();

       copySayi = sayi;

        while (sayi != 0) {
            sayi /= 10;
            basamak++;
        }

        
        
        for (int i = 1; i <= basamak; i++) {

            top = top + (copySayi % 10);
            copySayi = copySayi / 10;
        }

        System.out.println("\nSayının basamakları toplamı : "+top);

    }
}
