package com.example.strategypattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentContext paymentContext = context.getBean(PaymentContext.class);

        paymentContext.makePayment(100.0); // Output: Paying $100.0 via Credit Card

        paymentContext.setPaymentStrategy(context.getBean(PayPalPayment.class));
        paymentContext.makePayment(50.0); // Output: Paying $50.0 via PayPal
    }
}

