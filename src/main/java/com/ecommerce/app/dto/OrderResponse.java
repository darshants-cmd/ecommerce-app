package com.ecommerce.app.dto;

public class OrderResponse {
	
	private int orderId;
	private double amount;
	private String status;
	public OrderResponse(int orderId, double amount, String status) {
		
		this.orderId = orderId;
		this.amount = amount;
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String getStatus() {
		return status;
	}
	
	
	
	
	

}
