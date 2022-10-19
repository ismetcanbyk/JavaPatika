package ders;
import java.util.Scanner;

public class Papatya {
    public static void main(String[] args) {
        int start, rand ;
        Scanner inp = new Scanner(System.in);

        System.out.print("0 yada 1 girin : "); 
        start = inp.nextInt();

        rand =  (int) (Math.random()*10+(20));

        System.out.println("Random Sayı :"+rand);

        if ((rand - start) % 2 == 0) {
            System.out.println("\nSeviyor");
        }else{
            System.out.println("\nSevmiyor");
        }
    }
}
