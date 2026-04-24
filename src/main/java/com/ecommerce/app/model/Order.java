package com.ecommerce.app.model;

public class Order {
	
	private int orderId;
	private Cart cart;
	private double totalAmount;
    private OrderStatus status;
    
    public Order(int orderId,Cart cart)
    {
    	this.orderId=orderId;
    	this.cart=cart;
    	this.totalAmount=cart.calculateTotal();
    	this.status=OrderStatus.CREATED;
    }

	public int getOrderId() {
		return orderId;
	}

	

	public Cart getCart() {
		return cart;
	}

	

	public double getTotalAmount() {
		return totalAmount;
	}

	

	public OrderStatus getStatus() {
		return status;
	}
      //update status
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
    
    
	

}
