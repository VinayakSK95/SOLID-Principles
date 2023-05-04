package com.solid.violations;

public class InvoicePersistence {
	Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
        System.out.println("Saving in File...."+filename);
    }

    public void saveToDatabase() {
        // Saves the invoice to database
        System.out.println("Saving in Database....");
    }
}