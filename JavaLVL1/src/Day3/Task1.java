package Day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("������� �������� ������: ");
        while (true) {
            String cities = scan.nextLine();
            if (cities.equalsIgnoreCase("Stop"))
                break;

            switch (cities) {
                case "������":
                case "�����������":
                case "������":
                    System.out.println("������");
                    break;
                case "���":
                case "�����":
                case "�����":
                    System.out.println("������");
                    break;
                case "���������":
                case "���������":
                case "������":
                    System.out.println("������");
                    break;
                case "������":
                case "������":
                case "ʸ���":
                    System.out.println("��������");
                    break;
                default:
                    System.out.println("����������� ������");
            }
        }
    }
}
