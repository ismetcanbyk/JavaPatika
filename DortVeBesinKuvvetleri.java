import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        sayi = inp.nextInt();

        System.out.print( sayi+ " sayısından küçük dördün kuvvetleri: ");
        for (int i=1; i<=sayi; i*=4){
            System.out.print(i + "   ");
        }

        System.out.print( sayi+ " sayısından küçük beşin kuvvetleri: ");
        for (int i=1; i<=sayi; i*=5){
            System.out.print(i + "   ");
        }



    }
}
