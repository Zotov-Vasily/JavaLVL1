package Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Введите делимое: ");
            double x = scan.nextDouble();
            System.out.print("Введите делитель: ");
            double y = scan.nextDouble();
            if (y==0){
                System.out.println("Работа программы завершена");
                break;
            }else{
                double z = x/y;
                System.out.println(z);
            }

        }

    }

}
