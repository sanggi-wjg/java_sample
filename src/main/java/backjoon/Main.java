package backjoon;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rooms = new int[n];

        IntStream.range(0, n).forEach(i -> {
            rooms[i] = sc.nextInt();
        });



    }

}
