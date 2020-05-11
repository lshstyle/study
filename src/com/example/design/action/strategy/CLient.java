package com.example.design.action.strategy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Context context = new Context(new NewCustMoreStrategy());
		context.printPrice(100);
	}
}
