package com.solid.nonviolations;

public class Application {

	public static void main(String[] args) {
		
		Tool tool=new Tool("Hammer", 2021, 100);
		
		Invoice invoice=new Invoice(tool, 2, 5.0, 2.0);
		
		DetailsPrint detailsPrint =new DetailsPrint();
		detailsPrint.printToolDetails(tool);
		detailsPrint.printInvoice(invoice);
		
		InvoicePersistence invoicePersistence=new DatabasePersistence();
		invoicePersistence.saveInvoice(invoice);

		//just for the dependency Inversion
		InvoicePersistence invoicePersistence2=new FilePersistence();
		invoicePersistence2.saveInvoice(invoice);
	}
}
