package Day8;

public class Task1 {
    public static void main(String[] args) {
        String numbers = "";

        long before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++)
            numbers += i + " ";

        long after = System.currentTimeMillis();

        System.out.println(numbers);
        System.out.println("Время выполнения цикла с классом String: " + (after - before));

        StringBuilder sb = new StringBuilder("");

        long before2 = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++)
            sb.append(i).append(" ");

        long after2 = System.currentTimeMillis();

        System.out.println(sb);
        System.out.println("Время выполнения цикла с классом StringBuilder: " + (after2 - before2));
    }
}
