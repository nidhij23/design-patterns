package org.example.designpatternsjava.creational.factory.simplefactory;

public class CryptoPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid" + amount + "using crypto");

    }
}
