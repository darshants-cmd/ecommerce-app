package com.ecommerce.app;

import com.ecommerce.app.model.Cart;
import com.ecommerce.app.model.Order;
import com.ecommerce.app.model.OrderStatus;
import com.ecommerce.app.model.Product;
import com.ecommerce.app.payment.CardPayment;
import com.ecommerce.app.payment.PaymentStrategy;
import com.ecommerce.app.payment.UpiPayment;
import com.ecommerce.app.service.impl.OrderServiceImpl;

public class Main {

	public static void main(String[] args) {
	
		
		Product product1 = new Product(1,"cloth",1200);
		Product product2 = new Product(2,"bag",100);
		
		Cart cart = new Cart();
		
		cart.addProduct(product1);
		cart.addProduct(product2);
		
		double total=cart.calculateTotal();
		System.out.println("total amount" + total);
		
		
		Order order = new Order(101,cart);
		
	    System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Order Total: " + order.getTotalAmount());
        
        order.setStatus(OrderStatus.SUCCESS);
        
        System.out.println("Updated Order Status: " + order.getStatus());
        
        OrderServiceImpl orderService = new OrderServiceImpl();

        
        PaymentStrategy upi= new UpiPayment("darshna-upi");
        orderService.setPaymentStrategy(upi);
        orderService.processPayment(1000);
        
        PaymentStrategy card= new CardPayment("345689966","123");
        orderService.setPaymentStrategy(card);
        orderService.processPayment(2000);
		

	}

}
