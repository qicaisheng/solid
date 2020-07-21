package com.twschool.practice.dip;

import java.util.List;

public class Bank {
    private List<Account> accounts;
    private final BankNotification notification;

    public Bank(List<Account> accounts, BankNotification notification) {

        this.accounts = accounts;
        this.notification = notification;
    }

    public void withdraw(int amount, String accountId) {
        Account currentAccount = accounts.stream().filter(account -> account.getId().equals(accountId)).findFirst().orElseThrow(RuntimeException::new);
        currentAccount.withdraw(amount);
        
        notification.notify(accountId);
    }
}
