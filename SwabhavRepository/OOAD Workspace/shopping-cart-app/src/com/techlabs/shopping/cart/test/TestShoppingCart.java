package com.techlabs.shopping.cart.test;

import java.util.Date;
import java.util.List;

import com.techlab.shopping.cart.Customer;
import com.techlab.shopping.cart.LineItem;
import com.techlab.shopping.cart.Order;
import com.techlab.shopping.cart.Product;

public class TestShoppingCart {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Biscuit", 100, 10f);
		Product product2 = new Product(2, "Maggi", 100, 10f);
		LineItem lineitem1 = new LineItem(1, 1, product1);
		LineItem lineitem2 = new LineItem(2, 2, product2);
		Order order1 = new Order(new Date());
		order1.addItem(lineitem1);
		order1.addItem(lineitem2);
		Customer customer1 = new Customer("Kuntan", "Goregaon");
		customer1.addOrder(order1);
		printCustomerDetails(customer1);
	}

	private static void printCustomerDetails(Customer customer1) {
		
		System.out.println("Customer Name : "+customer1.getName()+"\nCustomer Location : "+customer1.getLocation());
		List<Order> orders = customer1.getOrderList();
		for(Order order: orders) {
			System.out.println("Order Date : "+order.getDate()+"\n ");
			printOrderDetails(order);
		}
	}

	private static void printOrderDetails(Order order1) {
		
		Product product = order1.getLineitems().get(0).getProduct();
		for(int i=0; i<order1.getLineitems().size(); i++) {
			System.out.println("Product ID : "+product.getId());
			System.out.println("Product Name : "+product.getName());
			System.out.println("Product Cost : "+product.getCost());
			System.out.println("Product Discount : "+product.getDiscount());
			System.out.println("Product Quantity : "+order1.getLineitems().get(i).getQuantity()+"\n");
		}
	}
	
}
