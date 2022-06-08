package backjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Bronze_2562 {

    public void solution() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
//        System.out.println("numbers = " + Arrays.toString(numbers));

        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println(max);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                System.out.println(i + 1);
                break;
            }
        }
    }

}
