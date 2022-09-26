import java.util.Scanner;

public class BiletFiyatHesaplama {
    public static void main(String[] args) {
        int age, info;
        double trip,top;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yaşınız : ");
        age = inp.nextInt();

        System.out.print("Gidilecek mesafe : ");
        trip = inp.nextDouble();

        System.out.print("Bilet tek yön ise 1 , çift yön ise 2 yazın !  :  ");
        info = inp.nextInt();
        
        if (info<1 || info>2 || age<0 || trip<0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return ;
        }

        top = 0.10*trip;

        if (age<12) {
            top = top /2;
        }else if (age>=12 && age<=24) {
            top = top-(top*0.1);
        }else if (age>65) {
            top = top-(top*0.3);
        }


        switch (info) {
            case 2:
                top = top-(top*0.2);
                top = top*2;
                break;
        
            default:
                break;
        }


       

        System.out.println("\nToplam Tutar : "+top);
    }
}
