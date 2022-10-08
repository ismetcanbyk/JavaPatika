import java.util.Scanner;
import java.util.Arrays;

public class SayiTahmin {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        int right = 0, input;
        System.out.println(number);
        int[] wrong = new int[5];



        while (right < 5) {

            System.out.print("\nSayıyı tahmin ediniz : ");
            input = inp.nextInt();

            if (input < 0 || input > 100) {
                System.out.println("0 ile 100 arasında bir değer giriniz !");
            } else {
                if (input == number) {
                    System.out.println("Tebrikler doğru tahmin :D ");
                    break;
                } else {
                    
                    if (input < number) {
                        System.out.println("\nDaha büyük bir sayı girin !");
                    }else{
                        System.out.println("\nDaha küçük bir sayı girin !");
                    }

                    wrong[right] = input;

                    right++;
                    if (right == 5) {
                        System.out.println("\nKaybettiniz => Gizli sayı : "+input);
                        System.out.println("Girilen Sayılar : "+Arrays.toString(wrong));
                        break;
                    }
                    System.out.println("Kalan Hak : " + (5 - right));
                }
            }

        }
    }
}
