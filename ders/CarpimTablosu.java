package ders;
import java.util.Scanner;
public class CarpimTablosu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int input, counter = 0;

        System.out.print("Bir sayı giriniz : ");
        input = inp.nextInt();

        for (int i = 0; i <input; i++) {
           System.out.println();
            counter++;
            for (int j = 0; j <= input; j++) {
                System.out.print(j*counter+" ");
            }
            System.out.println();
        }
    }
}
