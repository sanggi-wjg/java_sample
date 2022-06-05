package cheat.sheet.sample.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamSample {

    public void int_sample() {
        int[] array = new int[]{1, 2, 3, 4, 5};

        OptionalDouble average = Arrays.stream(array).parallel().average();
        System.out.println("Average: " + average);

        OptionalInt max = Arrays.stream(array).parallel().max();
        System.out.println("Max: " + max);
    }

}
