package org.example.designpatternsjava.behavioral.chainofresponsibility;

public class JuniorApprover extends  Approver{
    @Override
    public void approve(double amount) {
        if (amount <= 1000) {
            System.out.println("Junior approved $" + amount);
        } else if (next != null) {
            next.approve(amount);
        }
    }
}
