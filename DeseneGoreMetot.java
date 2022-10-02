import java.util.Scanner;

public class DeseneGoreMetot {

    static int recursiveFirst(int num, int x){
        
        if (num>=-5) {
            
            System.out.println(num);
            return recursiveFirst(num-5, x);
        }
        
       
        
        return recursiveSecont(num+10, x);
    }

   
    static int recursiveSecont(int a ,int b){

        if (a<=b) {
            System.out.println(a);
            return recursiveSecont(a+5, b);
        }
        

        return 1;
    }


    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        num = inp.nextInt();

        recursiveFirst(num,num);
        
    }
}
