package Day16;
import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);

        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            pw1.println(random.nextInt(100));
        }
        pw1.close();

        Scanner scanner1 = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        int counter = 0;
        int sum = 0;
        while (scanner1.hasNextLine()) {
            sum += Integer.parseInt(scanner1.nextLine());
            counter++;

            if (counter == 20) {
                pw2.println(sum / 20.0);

                counter = 0;
                sum = 0;
            }
        }
        pw2.close();
        printResult(file2);
    }
    static void printResult(File file2) {
        try {
            Scanner scanner2 = new Scanner(file2);
            double result = 0;
            while (scanner2.hasNextLine())
                result += Double.parseDouble(scanner2.nextLine());

            System.out.println((int) result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


