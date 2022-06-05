package cheat.sheet.sample.streams;

import org.apache.commons.lang3.time.StopWatch;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayListStreamSample {

    public void int_sample() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        long count = list.stream().filter(n -> n.equals(5)).count();
        System.out.println("Find count = " + count);

        System.out.println("=======================================================");

        boolean noneMatch = list.stream().noneMatch(n -> n.equals(0));
        System.out.println("아무것도 noneMatch = " + noneMatch);

        boolean anyMatch = list.stream().anyMatch(n -> n.equals(1));
        System.out.println("하나라도 anyMatch = " + anyMatch);

        boolean allMatch = list.stream().allMatch(n -> n.equals(1));
        System.out.println("전부 allMatch = " + allMatch);
    }

    public void parallel_sample() {
        Stream<Integer> streamIterate_1 = Stream.iterate(0, n -> n + 1).limit(1000000).parallel();
        Stream<Integer> streamIterate_2 = Stream.iterate(0, n -> n + 1).limit(1000000).parallel();
        Stream<Integer> streamIterate_3 = Stream.iterate(0, n -> n + 1).limit(1000000).parallel();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        boolean allMatch_1 = streamIterate_1.noneMatch(n -> n % 2 == 0);
        boolean allMatch_2 = streamIterate_2.noneMatch(n -> n % 2 == 0);
        boolean allMatch_3 = streamIterate_3.noneMatch(n -> n % 2 == 0);
        stopWatch.stop();
        System.out.println("parallel_sample finish = " + stopWatch.formatTime());
    }

    public void sequential_sample() {
        Stream<Integer> streamIterate_1 = Stream.iterate(0, n -> n + 1).limit(1000000);
        Stream<Integer> streamIterate_2 = Stream.iterate(0, n -> n + 1).limit(1000000);
        Stream<Integer> streamIterate_3 = Stream.iterate(0, n -> n + 1).limit(1000000);

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        boolean allMatch_1 = streamIterate_1.noneMatch(n -> n % 2 == 0);
        boolean allMatch_2 = streamIterate_2.noneMatch(n -> n % 2 == 0);
        boolean allMatch_3 = streamIterate_3.noneMatch(n -> n % 2 == 0);
        stopWatch.stop();
        System.out.println("sequential_sample finish = " + stopWatch.formatTime());
    }


}
