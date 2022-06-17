package backjoon;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WikiDoc {

    public static void q3_1() {
        // Array stream
        int[] scores = {80, 75, 55};
        int sum = Arrays.stream(scores).sum();
        System.out.println(sum);
    }

    public static void q3_4(String pin) {
        // string charAt
        boolean isMale = pin.charAt(7) == '1';
        if (isMale) {
            System.out.println("남");
        }
        else {
            System.out.println("여");
        }
    }

    public static void q3_6(ArrayList<Integer> numbers) {
        // ArrayList stream sort
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println(sortedNumbers);
    }

    public static void q3_7(ArrayList<String> texts) {
        // ArrayList join to string
        String collect = String.join(" ", texts);
        System.out.println(collect);
    }

    public static void q3_9(ArrayList<Integer> numbers) {
        // ArrayList remove duplicate
        List<Integer> removedNumbers = new HashSet<>(numbers).stream().toList();
        System.out.println(removedNumbers);
    }

    public static void q4_5() {
        // Array stream average
        int[] numbers = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        System.out.println(Arrays.stream(numbers).average().getAsDouble());
    }

    public static void main(String[] args) {
        q3_1();
        q3_4("910101-1234567");
        q3_6(new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2)));
        q3_7(new ArrayList<>(Arrays.asList("Life", "is", "too", "short")));
        q3_9(new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5)));
        System.out.println("============================================");
        q4_5();
    }


}
