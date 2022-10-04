package Salary;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name;
        int salary, workHours, hireYear;

        System.out.print("İsminizi Giriniz : ");
        name = inp.next();

        System.out.print("Maaşınızı Giriniz : ");
        salary = inp.nextInt();

        System.out.print("Haftalık Çalışma Saatinizi Giriniz : ");
        workHours = inp.nextInt();

        System.out.print("İşe Başlangıç Yılını Giriniz : ");
        hireYear = inp.nextInt();

        Employee user = new Employee(name,salary,workHours, hireYear );
        
        user.toString();
        
        
    }
}
