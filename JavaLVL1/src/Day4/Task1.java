package Day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("������� ������ �������: ");
        int n = scan.nextInt(); //������ � ����������� ������ ������� � ���������� � n
        int [] array = new int[n]; //������� ������ int �������� � n
        for (int i = 0; i < array.length; i++){
            array[i] = (int)( Math.random() * 11);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n" + "����� �������: " + array.length);
        int ammount = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] > 8) ammount++;
        }
        System.out.println("���������� ����� ������ 8: " + ammount);
        int ammount1 = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] == 1) ammount1++;
        }
        System.out.println("���������� ����� ������ 1: " + ammount1);
        int ammount3 = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] % 2 == 0) ammount3++;
        }
        System.out.println("���������� ������ �����: " + ammount3);
        int ammount4 = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] % 2 != 0) ammount4++;
        }
        System.out.println("���������� �������� �����: " + ammount4);
        int sum = 0;
        for (int i=0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("����� ���� ����� �������: " + sum);
    }
}
