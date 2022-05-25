package cheat.sheet.sample.threads;

public class RunnableThreadSample implements Runnable {

    String myThreadName;

    public RunnableThreadSample(String name) {
        this.myThreadName = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("run");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
