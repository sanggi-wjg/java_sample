package backjoon.bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Bronze_1_1157 {

    public void solution() {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toUpperCase(Locale.ROOT).toCharArray();
//        System.out.println(chars);

        ArrayList<Integer> alpCount = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            alpCount.add(0);
        }

        for (char c : chars) {
            int code = (byte) c;
//            System.out.println(c + "\t" + code, code-65);
            alpCount.set(code - 65, alpCount.get(code - 65) + 1);
        }
//        System.out.println(alpCount);
        Integer max = Collections.max(alpCount);

        long maxCount = alpCount.stream().filter(n -> n.equals(max)).count();
        if (maxCount > 1) {
            System.out.println("?");
        }
        else {
            System.out.println(String.valueOf((char) (alpCount.indexOf(max) + 65)));
        }
    }
}
