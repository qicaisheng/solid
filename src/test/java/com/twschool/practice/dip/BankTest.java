package com.twschool.practice.dip;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class BankTest {

    @Test
    public void should_decrease_account_money_when_user_withdraw_from_bank() {
        Account account1 = new Account("account1", 10000);
        Bank bank = new Bank(Arrays.asList(account1), Mockito.mock(SMSNotification.class));
        
        bank.withdraw(1000, "account1");
        
        int moneyFromUser1 = account1.amountOfMoney();
        Assert.assertEquals(9000, moneyFromUser1);
    }

    @Test
    public void should_notify_user_when_user_withdraw_money() {
        Account account1 = new Account("account1", 10000);
        SMSNotification smsNotification = Mockito.mock(SMSNotification.class);
        Bank bank = new Bank(Arrays.asList(account1), smsNotification);

        bank.withdraw(1000, "account1");
        
        Mockito.verify(smsNotification, Mockito.times(1)).notify(Mockito.eq("account1"));
    }
}
