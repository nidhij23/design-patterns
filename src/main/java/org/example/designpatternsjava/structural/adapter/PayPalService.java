package org.example.designpatternsjava.structural.adapter;

public class PayPalService {
    public void sendPayment(double amountinUSD) {
        System.out.println("Paying via PayPal: $"+ amountinUSD);
    }
}
