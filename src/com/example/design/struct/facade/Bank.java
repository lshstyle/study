package com.example.design.struct.facade;

public interface Bank {

	void openAccount();
}

class BankOfChina implements Bank {

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("�й����п���");
	}
	
}


interface TaxOffice {
	void tax();
}

class SZTaxOffice implements TaxOffice {

	@Override
	public void tax() {
		// TODO Auto-generated method stub
		System.out.println("����˰��Ǽ�");
	}
	
}
