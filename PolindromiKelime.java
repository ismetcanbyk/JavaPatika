import java.util.Scanner;

public class PolindromiKelime {
    
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String input ;

        System.out.print("Bir Kelime Girin : ");
        input = inp.next();

        if (isPalindrome(input)) {
            System.out.println("\nPolindrom Kelime");
        }else{
            System.out.println("\nPolindrom Kelime Değil");
        }

    }
}
