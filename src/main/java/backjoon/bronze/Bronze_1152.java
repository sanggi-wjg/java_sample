package backjoon.bronze;

import java.util.Scanner;

public class Bronze_1152 {

    public void solution() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        if (input.equals("")) {
            System.out.println(0);
        }
        else {
            int count = input.split(" ").length;
            System.out.println(count);
        }
    }

}
