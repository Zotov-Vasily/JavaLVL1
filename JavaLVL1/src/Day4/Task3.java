package Day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args){
        int m = 12;
        int n = 8;
        int [][] nums = new int[n][m]; // —оздаем массив с заданной размерностью
        Random rand = new Random();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                nums[i][j] = rand.nextInt(50);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        int maxSum = 0; // переменна€ дл€ хранени€ максимальной суммы
        int maxSumIdx = 0; //переменна€ дл€ хранени€ индекса строки с максимальной суммой
        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j =0; j < nums[i].length; j++){
                sum += nums[i][j];
            }
            if (sum >= maxSum){ //даже если сумма найдена на какой-то поздней строке и она будет равна большей сумме
                maxSum = sum;   //найденной на какойто ранней строке, то все равно эта сумма будет обновлена и индекс тоже будет обновлен.
                maxSumIdx = i;
            }
        }
        System.out.println("ќтвет: " + maxSumIdx);
    }
}
