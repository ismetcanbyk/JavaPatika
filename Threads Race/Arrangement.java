import java.util.ArrayList;
import java.util.List;

public class Arrangement extends Thread {
    
    static List<Integer> evenNum = new ArrayList<>();
    static List<Integer> oddNum = new ArrayList<>();
    List<Integer> list;
    static int num;


    public Arrangement(List<Integer> list){
        this.list = list;
    }



    @Override
    public void run(){
        find(this.list);
        show(Thread.currentThread().getName());
    }


    private synchronized void find(List<Integer> list){
        for (int i = 0; i < 25; i++) {
            num=list.get(i);
            if (num % 2 == 0) {
                evenNum.add(num);
            } else {
                oddNum.add(num);
            }
        }
    }

    void show (String threadName){
        System.out.println(threadName + " : " + evenNum);
        System.out.println(threadName + " : " + oddNum);
    }


}
