package Day2;     // ������� ����������� �����
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        System.out.println("������� ���������� ������ ");     // ���������� ��������
        int x = 0;     // ������ x ��� �������� ������ � scan, ����� ������� �����
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt(); // x ����������� �������� ������� nextInt () //nextInt ���������� ��������� �����
        if (x == 1) {
            System.out.println("����������� ��� ");
        } else if (x == 2){
            System.out.println("����������� ��� ");
        } else if (x == 3){
            System.out.println("����������� ��� ");
        } else if (x == 4){
            System.out.println("����������� ��� ");
        } else if (x == 5){
            System.out.println("������������� ��� ");
        } else if (x == 6){
            System.out.println("������������� ��� ");
        } else if (x == 7){
            System.out.println("������������� ��� ");
        } else if (x == 8){
            System.out.println("������������� ��� ");
        } else if (x >= 9){
            System.out.println("������������ ��� ");
        } else if (x < 1){
            System.out.println("������ ����� ");
        }






    }
}
