import java.util.Scanner;
import java.util.Arrays;

public class DiziSortLong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
        int[] list = {15,12,788,1,-1,-778,2,0};
        int realMin, realMax;
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        realMin = min;
        realMax = max;

        System.out.print("\nBir sayı girin : ");
        num = inp.nextInt();

        for (int i : list) {
            
            if (i < num) {
                
                if (i > realMin) {
                    realMin = i;
                }
            }
            if (i>num) {
                if ( i < realMax) {
                    realMax = i;
                }
            }
        }
        System.out.println("\nDizi : "+Arrays.toString(list));
        System.out.println("\nGirilen Sayı : "+num);
        System.out.println("\nGirilen sayıdan küçük en yakın sayı :"+realMin);
        System.out.println("\nGirilen sayıdan büyük en yakın sayı :"+realMax);
    }
}
