package cheat.sheet.sample.threads;

import java.sql.Time;
import java.util.Timer;

public class ThreadSample extends Thread {

    String myThreadName;

    public ThreadSample(String name) {
        this.myThreadName = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.printf("Id: %d\t Name: %s\t  Priority: %d\t State: %s\t Group:%s\n",
                    this.getId(), this.getName(), this.getPriority(), this.getState().toString(), this.getThreadGroup().toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
