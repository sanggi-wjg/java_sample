package sample;

import java.security.SecureRandom;
import java.util.stream.IntStream;

class RandomNumberGenerator {

    private final SecureRandom SECURE_RANDOM = new SecureRandom();

    public int generate(int min, int max) {
        return SECURE_RANDOM.nextInt(min, max);
    }
}

public class RandomNumberGeneratorMain {

    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();

        int min = 10;
        int max = 50;

        IntStream.range(0, 10).forEach(i -> {
            System.out.println(generator.generate(min, max));
        });
    }

}

