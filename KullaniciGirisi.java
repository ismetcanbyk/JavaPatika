import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName , password;
        Scanner inp = new Scanner(System.in);

        System.out.print("\nUser Name : ");
        userName = inp.next();

        System.out.print("\nPassword : ");
        password = inp.next();

        if (userName.equals("ismetcan") && password.equals("12345"))  {
            System.out.println("\nGiriş Başarılı");
        }else{
            System.out.println("\nGiriş Başarısız");
        }
    }
}
