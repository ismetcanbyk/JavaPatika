import java.util.Scanner;
import java.util.Arrays;

public class DiziElemanSiralama {

    public static void main(String[] args) {
        int sayi, arrayLenght, set = 0, temp=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını girin : ");
        arrayLenght = inp.nextInt();

        int[] list = new int[arrayLenght];

        for (int i = 1; i <= arrayLenght; i++) {

            System.out.print(i + ". Elemanı Girin : ");
            sayi = inp.nextInt();

            list[set] = sayi;
            set++;

        }

        for(int i=0;i<arrayLenght;i++)
            {
                for(int j=i+1;j<arrayLenght;j++)
                {
                    if(list[i] > list[j])
                    {
                        temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                    }
                }
            }

            System.out.println("Siralanmis dizi: "+Arrays.toString(list));

    }
}
