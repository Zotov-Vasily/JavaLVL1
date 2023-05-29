package Day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt(); //читаем с квлавиатуры размер массива и записываем в n
        int [] array = new int[n]; //создаем массив int размеров в n
        for (int i = 0; i < array.length; i++){
            array[i] = (int)( Math.random() * 11);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n" + "Длина массива: " + array.length);
        int ammount = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] > 8) ammount++;
        }
        System.out.println("Количество чисел больше 8: " + ammount);
        int ammount1 = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] == 1) ammount1++;
        }
        System.out.println("Количество чисел равных 1: " + ammount1);
        int ammount3 = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] % 2 == 0) ammount3++;
        }
        System.out.println("Количество чётных чисел: " + ammount3);
        int ammount4 = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] % 2 != 0) ammount4++;
        }
        System.out.println("Количество нечётных чисел: " + ammount4);
        int sum = 0;
        for (int i=0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Сумма всех чисел массива: " + sum);
    }
}
