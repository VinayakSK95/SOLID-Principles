package com.solid.nonviolations;

public class FilePersistence implements InvoicePersistence {

	@Override
	public void saveInvoice(Invoice invoice) {
		// Save to file
	
		System.out.println("Saving in File....");
	}
}
