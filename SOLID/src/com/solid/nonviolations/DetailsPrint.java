package com.solid.nonviolations;

public class DetailsPrint extends PrintToolDetails implements InvoicePrinter {


	//example for Liskov substitution
	public void printToolDetails(Tool tool) {
		System.out.println("Tool Name: "+tool.toolName+" "+"Tool Price: "+tool.toolPrice+" "+"Tool Mfg Year: "+tool.toolMfgYear);
	}
	@Override
	public void printInvoice(Invoice invoice) {
		System.out.println("Invoice");
		System.out.println("Customer Name:-"+"            "+"Date"+"        ");
		System.out.println(invoice.getQuantity() + "x " + invoice.getTool().toolName + " " + invoice.getTool().toolPrice + " $");
		System.out.println("Discount Rate: " + invoice.getDiscountRate());
		System.out.println("Tax Rate: " + invoice.getTaxRate());
		System.out.println("Total: " + invoice.getTotal() + " $");
	}
}
