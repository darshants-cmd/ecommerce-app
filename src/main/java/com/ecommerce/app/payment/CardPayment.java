package com.ecommerce.app.payment;

public class CardPayment implements PaymentStrategy{
	
	private String cardNumber;
	private String cvv;
	
	
	public CardPayment(String cardNumber, String cvv) {
		
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	
	@Override
	public void pay(double amount)
	{
		System.out.println("paid amount" + amount + " via card " + cardNumber);
	}
	
	

}
