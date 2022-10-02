import java.util.Scanner;

public class RecursiveAsalSayi {

    static void asalSayi(int sayi , int i) {

        

        if (sayi == i) {
            System.out.println("Asal Sayıdır !");
            return;
        } else if (sayi % i == 0) {
            System.out.println("Asal Değil!"); 
            return;
        }
        
        asalSayi(sayi,i+1);
    }

    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        sayi = inp.nextInt();
        if (sayi == 1) {
            System.out.println("Asal Değil !");
        }else{
            asalSayi(sayi, 2);
        }
        
    }
}
