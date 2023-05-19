package Day2;     // сначала стандартная шапка
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        System.out.println("Введите количество этажей ");     // Обозначаем действие
        int x = 0;     // Вводим x для хранения ответа и scan, чтобы считать ответ
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt(); // x приобретает значение функции nextInt () //nextInt возвращает введенное число
        if (x == 1) {
            System.out.println("Малоэтажный дом ");
        } else if (x == 2){
            System.out.println("Малоэтажный дом ");
        } else if (x == 3){
            System.out.println("Малоэтажный дом ");
        } else if (x == 4){
            System.out.println("Малоэтажный дом ");
        } else if (x == 5){
            System.out.println("Среднеэтажный дом ");
        } else if (x == 6){
            System.out.println("Среднеэтажный дом ");
        } else if (x == 7){
            System.out.println("Среднеэтажный дом ");
        } else if (x == 8){
            System.out.println("Среднеэтажный дом ");
        } else if (x >= 9){
            System.out.println("Многоэтажный дом ");
        } else if (x < 1){
            System.out.println("Ошибка ввода ");
        }






    }
}
