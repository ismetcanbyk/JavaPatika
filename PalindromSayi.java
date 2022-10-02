import java.util.Scanner;

public class PalindromSayi {


    static int us(int a){
        int number = 1;

        for (int i = 1; i <= a; i++) {
            number = number *10;
        }

        return number;
    }

    static boolean isPalindrom(int num){

        int counter = 0, copyNum, mod, modNum, copyCount, palNum=1, top=0;
        boolean palindrom;

        modNum = num;
        copyNum = num;

        while(copyNum != 0 ){
            copyNum = copyNum / 10 ;
            counter++;
        }

        copyCount = counter-1;

        for (int i = 1; i <= counter; i++) {
            mod = modNum % 10;
            modNum = modNum/10;
            
            palNum = mod*us(copyCount);
            copyCount--;

            top += palNum ;    
        }

        if (top == num) {
            palindrom = true;
        }else{
            palindrom = false;
        }
        return palindrom;
    }

    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        num = inp.nextInt();

        if (isPalindrom(num)==true) {
            System.out.println("\nPalindrom sayıdır !");
        } else {
            System.out.println("\nPalindrom sayı değildir !");
        }
    }
}
