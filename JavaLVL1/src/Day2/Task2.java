package Day2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //читаем число а
        int b = scan.nextInt(); //читаем число b
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
// выводим все числа из диапазона между а и b, которые удовлетворяют условия,
// начиная с а+1 т.к. сами числа а и b в диапозон не входят.
        for (int i = a + 1; i < b; i++) {
// если i делится на 5 без остатка и если i не делится на 10 без остатка
            if (i % 5 == 0 && i % 10 != 0){
                System.out.print(i + " ");
            }
        }
    }
}