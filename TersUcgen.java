import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int input ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak Giriniz : ");
        input = inp.nextInt();
        
        System.out.println();
        for (int i=input; i >0 ; i--){

            for (int k=input-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
