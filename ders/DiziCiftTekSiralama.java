
import java.util.Arrays;


public class DiziCiftTekSiralama {
    public static void main(String[] args) {
        int[] arr = {23,15,45,39,6,34,35,20,7,44};
        int[] cift = new int[arr.length];
        int[] tek = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                cift[i] = arr[i];
            }else{
                tek[i] = arr[i];
            }
        }

        for (int i = 0; i < cift.length; i++) {
            if (cift[i] != 0) {
                System.out.print(cift[i]+" ");
            }
        }
        for (int i = 0; i < tek.length; i++) {
            if (tek[i] != 0) {
                System.out.print(tek[i]+" ");
            }
        }
    }
}
