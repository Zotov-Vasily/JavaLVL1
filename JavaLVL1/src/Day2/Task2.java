package Day2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //������ ����� �
        int b = scan.nextInt(); //������ ����� b
        if (a >= b) {
            System.out.println("������������ ����");
        }
// ������� ��� ����� �� ��������� ����� � � b, ������� ������������� �������,
// ������� � �+1 �.�. ���� ����� � � b � �������� �� ������.
        for (int i = a + 1; i < b; i++) {
// ���� i ������� �� 5 ��� ������� � ���� i �� ������� �� 10 ��� �������
            if (i % 5 == 0 && i % 10 != 0){
                System.out.print(i + " ");
            }
        }
    }
}