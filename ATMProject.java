import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        String userName, password;
        int menu, bakiye = 120, yPara, cPara;
        Scanner inp = new Scanner(System.in);

        System.out.print("\nKullanıcı Adını Gir : ");
        userName = inp.next();

        System.out.print("Şifre : ");
        password = inp.next();

        if (userName.equals("ismetcanbyk") && password.equals("12345")) {

            System.out.println("Başarılı Giriş");

            System.out.print(
                    "\n 1) Para Yatırma \n 2) Para Çekme \n 3) Bakiye Sorgu \n 4) Çıkış Yap \n Yapmak istediğiniz işlemi seçin :");

            menu = inp.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Bakiye = " + bakiye);
                    System.out.print("Yatırmak istediğiniz tutarı girin : ");
                    yPara = inp.nextInt();
                    bakiye = bakiye + yPara;
                    System.out.println("Güncel Bakiye : " + bakiye);
                    break;
                case 2:
                    System.out.println("Bakiye = " + bakiye);
                    System.out.print("Çekmek istediğiniz tutarı girin : ");
                    cPara = inp.nextInt();
                    bakiye = bakiye - cPara;
                    System.out.println("Güncel Bakiye : " + bakiye);
                    break;
                case 3:
                System.out.println("Bakiye = " + bakiye);
                break;
                case 4:

                break;

                default:
                    break;
            }

        } else {
            System.out.println("Başarısız Giriş");
        }

    }
}
