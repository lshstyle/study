package com.example.design.action.templateMethod;

public class Client {

	public static void main(String[] args) {
		BankTemplateMethod btm  = new DrawMoney();
		btm.process();
		
		BankTemplateMethod btm1 = new BankTemplateMethod() {

			@Override
			public void trasact() {
				// TODO Auto-generated method stub
				System.out.println("我要存钱");
			}
			
		};
		btm1.process();
		
	}
}
