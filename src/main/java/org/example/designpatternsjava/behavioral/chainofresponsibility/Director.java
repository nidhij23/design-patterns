package org.example.designpatternsjava.behavioral.chainofresponsibility;

public class Director extends Approver {
    @Override
    public void approve(double amount) {
        System.out.println("Director approved $" + amount);
    }
}
