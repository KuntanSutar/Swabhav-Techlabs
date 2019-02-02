package com.techlab.shopping.cart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private Date date;
	private List<LineItem> lineitems = new ArrayList();

	public Order(Date newDate) {
		date = newDate;
	}

	public void addItem(LineItem lineitem) {
		for(int i=0; i<lineitems.size(); i++) {
			if(lineitem.getProduct().getId()==lineitems.get(i).getProduct().getId()) {
				return;
			}
		}
		lineitems.add(lineitem);
	}

	public double checkOutPrice() {
		double checkoutPrice = 0;
		for (LineItem lineitem : lineitems) {
			checkoutPrice = checkoutPrice + lineitem.calcItemCost();
		}
		return checkoutPrice;
	}

	public Date getDate() {
		return date;
	}

	public List<LineItem> getLineitems() {
		return lineitems;
	}
	
}
