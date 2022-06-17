package sample;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleDaemonMain {

    public static void main(String[] args) {
        ScheduleDaemon scheduleDaemon = new ScheduleDaemon();
        scheduleDaemon.print();
    }

}

class ScheduleDaemon {

    private final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    public void print() {
        Runnable task = () -> System.out.println(LocalDateTime.now());
        this.scheduledExecutorService.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
    }
}