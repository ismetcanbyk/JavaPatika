import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fiz, turkce, kim, muzik;
        double ort;
        Scanner inp = new Scanner(System.in);

        System.out.print("\nMatematik Notu :");
        mat = inp.nextInt();

        System.out.print("\nFizik Notu :");
        fiz = inp.nextInt();

        System.out.print("\nTurkce Notu :");
        turkce = inp.nextInt();

        System.out.print("\nKimya Notu :");
        kim = inp.nextInt();

        System.out.print("\nMüzik Notu :");
        muzik = inp.nextInt();

        if (mat < 0 || mat > 100) {
            mat = 0;
        }
        if (fiz < 0 || fiz > 100) {
            fiz = 0;
        }
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        }
        if (kim < 0 || kim > 100) {
            kim = 0;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }

        ort = (mat + fiz + turkce + kim + muzik)/5;

        System.out.println("\n"+ort);

        if (ort >=55 ) {
            System.out.print("\nGeçtiniz");
        }else{
            System.out.print("\nKaldınız");
        }

        
    }
}
