package com.solid.violations;

public class Invoice implements Printable {
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

	//calculate the total bill of items purchased
	public double calculateTotal() {
	    double price = ((tool.toolPrice - (tool.toolPrice * (discountRate/100))) * this.quantity);

		total = price * (1 + (taxRate/100));

		return total;
	}

	@Override
	public void printInvoice() {

			System.out.println("Invoice");
			System.out.println("Customer Name:-"+"            "+"Date"+"        ");
            System.out.println(quantity + "x " + tool.toolName + " " +tool.toolPrice + "$");
            System.out.println("Discount Rate: " + discountRate);
            System.out.println("Tax Rate: " + taxRate);
            System.out.println("Total:- " + total);
       }

	@Override
	public void printToolDetails() {
		System.out.println("Tool Name: "+tool.toolName+" "+"Tool Price: "+tool.toolPrice+" "+"Tool Mfg Year: "+tool.toolMfgYear);

	}
	
}