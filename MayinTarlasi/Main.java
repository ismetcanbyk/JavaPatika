package MayinTarlasi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mayın tarlası oynuna hoş geldin !\n"+
        "tarlanın boyutunu gir ,örneğin : (4 7)  : ");
        int x , y ;
        x = scanner.nextInt();
        y = scanner.nextInt();
        MineSweeper mineSweeper = new MineSweeper(x, y);
        //mineSweeper.printMineMap();
        mineSweeper.run();
        scanner.close();
        
    }
}
