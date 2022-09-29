import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int adet, sayi , x=1 , y=1;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("\nKaç tane sayı gireceksiniz : ");
        adet = inp.nextInt();
        
        for (int i = 1; i <= adet; i++) {
            
            System.out.print(i+".Sayıyı Girin : ");
            sayi = inp.nextInt();
            

            if (i == 1) {
                x = sayi;
                y = sayi;
            }

            if (sayi > x) {
                x = sayi;
            }

            if (sayi < y) {
                y = sayi;
            }
            
            
        }

        System.out.println("\nEn büyük sayı = "+x);
        System.out.println("\nEn Küçük sayı = "+y);
    }
}
