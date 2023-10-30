package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {

    static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numberString = line.split(" ");

            double sum = 0;

            for (String number : numberString) {
                sum += Double.parseDouble(number);
            }
            double average = sum / numberString.length;

            String formattedDouble = new DecimalFormat("#0.000").format(average);

            System.out.println(average + " --> " + formattedDouble);
            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден!");
        }
    }

    public static void main(String[] args) {
        File file = new File("Day14-1");
        printResult(file);
    }
}
