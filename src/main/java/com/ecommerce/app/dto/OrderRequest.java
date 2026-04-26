package com.ecommerce.app.dto;

import com.ecommerce.app.model.Cart;

public class OrderRequest {
	
	private Cart cart;
	private String paymentType;
	
	public OrderRequest(Cart cart, String paymentType) {
		this.cart = cart;
		this.paymentType = paymentType;
	}
         public Cart getCart()
         {
        	 return cart;
         }
	
          public String geyPaymentType()
          {
        	  return paymentType;
          }
	
	
	

}
