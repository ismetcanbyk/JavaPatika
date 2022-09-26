import java.util.Scanner;

public class ArtikYilBulma {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yılı Girin : ");
        year = inp.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " Bir artık Yıl.");
                    return;
                } else {
                    System.out.println(year + " Bir artık yıl Değil.");
                    return;
                }
            }
            System.out.println(year + " Bir artık Yıl.");
        }else{System.out.println(year + " Bir artık yıl Değil.");}

    }
}
