import java.util.Arrays;

public class DiziFrekans {

    static int counter(int[] arr, int value) {
        int count = 0;
        
            for (int i : arr) {
                if (i == value) {
                    count++;
                }
            
        }
        return count;
    }

    static boolean isFind(int[] arr, int value, int c){
        for (int i = 0; i < c; i++) {
            if (value == arr[i]) {
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        int[] list = {10, 20, 10, 0, 30, 50, 0, 10, 14, 12, 20};
        System.out.println("Dizi : " + Arrays.toString(list));


        for (int i = 0; i < list.length; i++) {
            if (isFind(list, list[i], i)) {
                System.out.println(list[i] + " sayısı " + counter(list, list[i]) + " kez tekrar edildi.");
            }
        }
    }
}
