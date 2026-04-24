package com.ecommerce.app.service.impl;

import com.ecommerce.app.payment.PaymentStrategy;

public class OrderServiceImpl {

    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy)
    {
    	this.paymentStrategy=paymentStrategy;
    }
    
    public void processPayment(double amount)
    {
    	paymentStrategy.pay(amount);
    }

    
}