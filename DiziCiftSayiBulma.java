import java.util.Arrays;

public class DiziCiftSayiBulma {

    static boolean isFind(int[] arr, int value) {

        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = { 20, 33, 332, 5, -12, 20, 33, 332 };
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < duplicate.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }

                    break;
                }
            }
        }

        for (int value : duplicate) {
            if (value != 0) {
                if (value % 2 == 0) {
                    System.out.println("\n"+value);
                }
            }
        }

    }

}
