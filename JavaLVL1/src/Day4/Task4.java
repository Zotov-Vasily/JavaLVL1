package Day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args){
        int n = 100;
        Random rand = new Random();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(10000);
        }

        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < array.length -2; i++){ //до пред пред последнего элемента массива, когда мы до него дойдем, мы будем считать последнюю тройку, по этому -2.
             int sum = 0;
             for (int j = i; j < i + 3; j++){
                 sum += array[j];
             }
             if (sum > maxSum){ //Если максимальная сумма больше чем максимальная сумма тройки, которая была найдена, то
                 maxSum = sum;  // мы обновляем значение максимальной суммы.
                 maxSumIdx = i; //сохраняем индекс первого числа в тройке с максимальной суммой
             }
        }

        System.out.println("Максимальная сумма тройки: " + maxSum);
        System.out.println("Индекс первого элемента тройки с максимальной суммой: " + maxSumIdx);
    }
}
