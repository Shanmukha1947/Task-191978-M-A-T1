package com.example.strategypattern;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " via PayPal");
    }
}
