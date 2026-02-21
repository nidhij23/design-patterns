package org.example.designpatternsjava.behavioral.chainofresponsibility;

abstract public class Approver {
    protected Approver next;

    public void setNext(Approver next) {
        this.next = next;
    }

    public abstract void approve(double amount);
}
