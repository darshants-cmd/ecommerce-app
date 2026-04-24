package com.ecommerce.app.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<Product> products;

	public Cart() {
		
		products=new ArrayList<>();
		
	}
	
	
	public void addProduct(Product product)
	{
		products.add(product);
		System.out.println(product.getName()+ "added to cart");
	}
	
	public void removeProduct(Product product)

	{
		products.remove(product);
		System.out.println(product.getName()+"products was removed");
	}
	
	
	public double calculateTotal()
	{
		double total=0.0;
		
		for(Product product : products)
		{
			total += product.getPrice();
		}
	
	return total;
	}
	
	public List<Product> getProducts() {
        return products;

}
}
