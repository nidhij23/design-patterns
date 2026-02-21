package org.example.designpatternsjava.behavioral.chainofresponsibility;

public class SeniorApprover extends Approver{
    @Override
    public void approve(double amount) {
        if (amount <= 10000) {
            System.out.println("Senior approved $" + amount);
        } else if (next != null) {
            next.approve(amount);
        }
    }
}
