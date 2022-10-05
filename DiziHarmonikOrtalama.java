public class DiziHarmonikOrtalama {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5 };

        double top = 0;

        for (int i = 0; i <numbers.length; i++) {
            top = top + 1/numbers[i];
        }

        System.out.println(top);

    }
}
