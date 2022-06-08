package cheat.sheet.sample.threads.sample_1;

public class DepositThread implements Runnable {

    Account account;

    public DepositThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (account){
            for (int i = 0; i < 10; i++) {
                account.deposit(1);
                System.out.println(Thread.currentThread().getName() + " deposit " + Account.balance);
            }
        }
    }

}
