package cheat.sheet.sample.threads.sample_1;


public class ThreadSample1 {

    public static void main(String[] args) {
        Account account = new Account();

        Thread depositThread = new Thread(new DepositThread(account));
        Thread withdrawThread = new Thread(new WithdrawThread(account));

        depositThread.start();
        withdrawThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        account.show();
    }

}
