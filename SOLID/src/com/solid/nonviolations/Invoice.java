package com.solid.nonviolations;

public class Invoice {
	private Tool tool;
	private int quantity;
	private double discountRate;
	private double taxRate;
	private double total;

	public Invoice(Tool tool, int quantity, double discountRate, double taxRate) {
		this.tool = tool;
		this.quantity = quantity;
		this.discountRate = discountRate;
		this.taxRate = taxRate;
		this.total = this.calculateTotal();
	}

	public double calculateTotal() {
		double price = ((tool.toolPrice - (tool.toolPrice * (discountRate/100))) * this.quantity);

		total = price * (1 + taxRate);

		return total;
	}
	
	
	
	
	

	public Tool getTool() {
		return tool;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getDiscountRate() {
		return discountRate;
	}


	public double getTaxRate() {
		return taxRate;
	}


	public double getTotal() {
		return total;
	}
	
}