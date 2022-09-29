import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int input, top, counter = 0, newCounter=1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Eleman sayısını girin : ");
        input = inp.nextInt();

        for (int i = 2; i <= input ; i++) {
            top = counter + newCounter;
            System.out.print(counter + " + " + newCounter + " = " + top);
            counter = newCounter;
            newCounter = top;
            System.out.println();
        }
    }
}
