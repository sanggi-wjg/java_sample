package cheat.sheet.sample.threads.thread_group;

public class ThreadGroupSampleMain {

    public static void main(String[] args) {
        ThreadGroup rootThreadGroup = new ThreadGroup("Root Group");
        ThreadGroup childThreadGroup = new ThreadGroup(rootThreadGroup, "Child Group");

        // Root Group
        Thread root_thread = new Thread(rootThreadGroup, () -> {
            while (true) {
                System.out.println("Root thread is running");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        });

        // Child Group
        Thread child_thread_1 = new Thread(childThreadGroup, () -> {
            while (true) {
                System.out.println("Child thread is running");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        });
        Thread child_thread_2 = new Thread(childThreadGroup, () -> {
            while (true) {
                System.out.println("Child thread is running");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        });

        root_thread.start();
        child_thread_1.start();
        child_thread_2.start();

//        try {
//            root_thread.join();
//            child_thread_1.join();
//            child_thread_2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        childThreadGroup.interrupt();
        rootThreadGroup.interrupt();


    }

}
