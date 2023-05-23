package Day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Значение х = ");
        double x = scan.nextDouble();
        double y;
        if (x>=5){
            y = + (x*x - 10)/(x+7);
        }else if (x>-3 && x<5){
            y =  + (x+3)*(x*x-2);
        }else{
            y = 420;
        }
        System.out.println(y);
    }
}
