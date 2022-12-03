

public class ArmstrongSayi {
    public static void main(String[] args) {
        int num = 100;

        for (int i = 100; i <= 999; i++) {
            num = i;

            if (Math.pow(num%10, 3)+Math.pow((num/10)%10, 3)+Math.pow((num/100)%10, 3)==i) {
                System.out.println(i);
            }
        }
    }
}
