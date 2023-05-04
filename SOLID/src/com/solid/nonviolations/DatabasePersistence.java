package com.solid.nonviolations;

public class DatabasePersistence implements InvoicePersistence{

	@Override
	public void saveInvoice(Invoice invoice) {
		// Save to DB
		
		System.out.println("Saving in Database....");
	}
}
