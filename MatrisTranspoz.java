import java.util.Scanner;
import java.util.Arrays;

public class MatrisTranspoz {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        int row = inp.nextInt();

        System.out.print("Sütun sayısını giriniz: ");
        int col = inp.nextInt();

        int[][] matris = new int[row][col];
        int[][] transpose = new int[col][row];

        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                System.out.print(+ i +".Satır " + j +". Sütun: elemanı giriniz: ");
                matris[i][j] = inp.nextInt();
            }
        }

        System.out.println("Matris");
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                transpose[j][i] = matris[i][j];
                
            }
        }
        System.out.println("Transposed matris: ");

        for (int i = 0; i < transpose.length; i++){
            for (int j = 0; j < transpose[i].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
