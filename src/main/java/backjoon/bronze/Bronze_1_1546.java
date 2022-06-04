package backjoon.bronze;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Bronze_1_1546 {

    public void s(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(numbers));

        OptionalDouble max = Arrays.stream(numbers).max();
        double maxNum = max.getAsDouble();
//        System.out.println(maxNum);

        for (int i = 0; i < n; i++) {
            numbers[i] = numbers[i] / maxNum * 100;
        }
//        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.stream(numbers).average().getAsDouble());
    }
}
