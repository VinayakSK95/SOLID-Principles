package com.solid.violations;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//adding the new tools
		Tool tool=new Tool("Hammer", 2021, 100);


		Invoice invoice=new Invoice(tool, 2, 5.0, 2.0);
		invoice.calculateTotal();
		invoice.printToolDetails();
		invoice.printInvoice();

		//we have to implement Dependency Inversion
		InvoicePersistence invoicePersistence=new InvoicePersistence(invoice);
		invoicePersistence.saveToDatabase();
		invoicePersistence.saveToFile("Invoice 1120");
	}

}
