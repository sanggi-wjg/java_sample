package cheat.sheet.sample.threads;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class ThreadSampleMain {

    public static void extendThread() {
        int LIMIT = 10;
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < LIMIT; i++) {
            threads.add(new ThreadSample(Integer.toString(i)));
        }

        for (Thread th : threads) {
            th.start();
        }
        for (Thread th : threads) {
            try {
                th.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void implementsRunnable() {
        // Runnable Interface 를 상속하는 이유는 Thread 상속시에 다른 Class 에서 해당 Class 를 상속할 수 없다.
        int LIMIT = 5;
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < LIMIT; i++) {
            Thread thread = new Thread(new RunnableThreadSample(i, new SomethingVO(i * 10)));
            threads.add(thread);
        }

        for (Thread th : threads) {
            th.start();
        }

        for (Thread th : threads) {
            try {
                th.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        implementsRunnable();

    }

}
