package org.example.designpatternsjava.structural.adapter;

import org.example.designpatternsjava.creational.factory.simplefactory.Payment;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalService payPalService;
    public PayPalAdapter(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void pay(double amount) {
        payPalService.sendPayment(amount);
    }
}
