package cheat.sheet.sample.threads.sample_1;

import lombok.Getter;
import lombok.Setter;

public class Account {

    static long balance = 100;

    public void deposit(long amount) {
        balance += amount;
    }

    public void withdraw(long amount) {
        balance -= amount;
    }

    public void show() {
        System.out.println("잔액: " + balance);
    }
}
