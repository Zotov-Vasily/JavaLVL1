package Day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }
    public static int count7(int i){
        if (i == 0)
            return 0;
        if (i % 10 == 7)
            return 1 + count7(i / 10);
        else
            return count7(i / 10);
    }
}
