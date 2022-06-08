package cheat.sheet.sample.threads;

public class RunnableThreadSample implements Runnable {

    String threadName;
    SomethingVO somethingVO;

    public RunnableThreadSample(int threadNumber, SomethingVO somethingVO) {
        this.threadName = "Thread-" + Integer.toString(threadNumber);
        this.somethingVO = somethingVO;
    }

    @Override
    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread() + " " + threadName + " : " + i);
//        }
        System.out.println(Thread.currentThread() + "\t" + threadName + "\t" + somethingVO.getValue());

    }
}
