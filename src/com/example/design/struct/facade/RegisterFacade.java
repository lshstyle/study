package com.example.design.struct.facade;

public class RegisterFacade {
	
	public void register() {
		Bank bank = new BankOfChina();
		bank.openAccount();
		TaxOffice tax = new SZTaxOffice();
		tax.tax();
		
	}

}
