package com.example.strategypattern;

import org.codehaus.plexus.component.annotations.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component(role = null)
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    @Autowired
    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
