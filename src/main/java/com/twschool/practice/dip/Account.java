package com.twschool.practice.dip;

public class Account {
    private final String id;
    private int amountOfMoney;

    public Account(String id, int amountOfMoney) {
        this.id = id;
        this.amountOfMoney = amountOfMoney;
    }

    public int amountOfMoney() {
        return amountOfMoney;
    }

    public String getId() {
        return id;
    }

    public void withdraw(int amount) {
        amountOfMoney = amountOfMoney - amount;
    }
}
