package Day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //������ ����� �
        int b = scan.nextInt(); //������ ����� b
        int k = a + 1; // ��������� k ��������� ������� ����� �� ���������
        if (a > b){ //������� ������������� �����
            System.out.println("������������ ���� ");
        }

        while (k < b) { // ��������� ���� ��� ������� k < b
            if (k % 5 == 0 && k % 10 != 0) // ���� k ������� �� 5 ��� ������� � ���� k �� ������� �� 10 ��� �������
                System.out.print(k + " ");
            k++;


        }

    }
}