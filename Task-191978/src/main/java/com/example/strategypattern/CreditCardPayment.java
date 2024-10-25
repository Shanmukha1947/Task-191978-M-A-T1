package com.example.strategypattern;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " via Credit Card");
    }
}
