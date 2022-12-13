import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        List<Integer> list1 = list.subList(0, 25);
        List<Integer> list2 = list.subList(25, 50);
        List<Integer> list3 = list.subList(50, 75);
        List<Integer> list4 = list.subList(75, 100);


        Arrangement arr1 = new Arrangement(list1);
        arr1.start();

        Arrangement arr2 = new Arrangement(list2);
        arr2.start();

        Arrangement arr3 = new Arrangement(list3);
        arr3.start();

        Arrangement arr4 = new Arrangement(list4);
        arr4.start();




    }
}