package Day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //читаем число а
        int b = scan.nextInt(); //читаем число b
        int k = a + 1; // переменна k равн€етс€ первому числу из диопазона
        if (a > b){ //условие некорректного ввода
            System.out.println("Ќекорректный ввод ");
        }

        while (k < b) { // запускаем цикл при условии k < b
            if (k % 5 == 0 && k % 10 != 0) // если k делитс€ на 5 без остатка и если k не делитс€ на 10 без остатка
                System.out.print(k + " ");
            k++;


        }

    }
}