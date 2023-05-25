package Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ending =0;
        while (ending < 5) {
            System.out.print("¬ведите делимое: ");
            double x = scan.nextDouble();
            System.out.print("¬ведите делитель: ");
            double y = scan.nextDouble();
            ending++;

            if (y == 0) {
                System.out.println("ƒеление на 0");
                continue;
            }
            System.out.println(x/y);
        }
    }
}