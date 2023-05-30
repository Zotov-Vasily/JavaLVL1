package Day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args){
        int m = 12;
        int n = 8;
        int [][] nums = new int[n][m]; // ������� ������ � �������� ������������
        Random rand = new Random();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                nums[i][j] = rand.nextInt(50);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        int maxSum = 0; // ���������� ��� �������� ������������ �����
        int maxSumIdx = 0; //���������� ��� �������� ������� ������ � ������������ ������
        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j =0; j < nums[i].length; j++){
                sum += nums[i][j];
            }
            if (sum >= maxSum){ //���� ���� ����� ������� �� �����-�� ������� ������ � ��� ����� ����� ������� �����
                maxSum = sum;   //��������� �� ������� ������ ������, �� ��� ����� ��� ����� ����� ��������� � ������ ���� ����� ��������.
                maxSumIdx = i;
            }
        }
        System.out.println("�����: " + maxSumIdx);
    }
}
