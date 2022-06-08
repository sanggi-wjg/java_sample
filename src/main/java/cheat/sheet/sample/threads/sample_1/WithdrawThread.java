package cheat.sheet.sample.threads.sample_1;

public class WithdrawThread implements Runnable {

    Account account;

    public WithdrawThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (account){
            for (int i = 0; i < 10; i++) {
                account.withdraw(1);
                System.out.println(Thread.currentThread().getName() + " withdraw " + Account.balance);
            }
        }
    }

}
