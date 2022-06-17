package sample;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSort {

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = Map.of(
                "three", 3,
                "one", 1,
                "four", 4,
                "five", 5,
                "two", 2
        );

        Map<String, Integer> sortedMap = sortByValue(unsortedMap);
        System.out.println("sortedMap = " + sortedMap);
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> unsorted) {
        Map<String, Integer> sorted = new LinkedHashMap<>();

        unsorted.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> sorted.put(entry.getKey(), entry.getValue()));

        return sorted;
//        return Collections.unmodifiableMap(sorted);
    }

}


