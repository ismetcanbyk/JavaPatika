
import java.util.Scanner;
public class SezarSifreleme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String text, sm = "";
        int num;
        char x;

        System.out.print("Şifrelemek istenen kelime : ");
        text = inp.next();
        System.out.print("Şifreleme aralığını girin : ");
        num = inp.nextInt();

        for (int i = 0; i < text.length(); i++) {
         
            sm += (char) (((int) text.charAt(i)-65+num)%26+65);
            
           
        }
        System.out.println("Şifreli Metin : " + sm);

    }
}
