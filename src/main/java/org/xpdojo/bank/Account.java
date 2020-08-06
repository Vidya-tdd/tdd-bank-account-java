package org.xpdojo.bank;

public class Account {

    private int accountBalance;
    public int balance() {
        return accountBalance;
    }

    public void deposit(int amount) {
        accountBalance += amount;
    }
}
