package org.example.designpatternsjava.creational.factory.simplefactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactory {
//    public static Payment createPayment(String type) {
//        if(type.equalsIgnoreCase("CREDIT")) {
//            return new CreditCardPayment();
//        } else if (type.equalsIgnoreCase("PAYPAL")) {
//            return new PayPalPayment();
//        }
//
//        throw new IllegalArgumentException("Invalid payment type");
//    }


    //Improved Factory
    private static final Map<String, Supplier<Payment>> registry = new HashMap<>();
    static {
        registry.put("CREDIT", CreditCardPayment::new);
        registry.put("PAYPAL", PayPalPayment::new);
        registry.put("CRYPTO",CryptoPayment::new );
    }

    public static Payment createPayment(String type) {

        Supplier<Payment> supplier = registry.get(type.toUpperCase());

        if(supplier != null) {
            return supplier.get();
        }
        throw new IllegalArgumentException("Invalid Payment type");
    }
}
