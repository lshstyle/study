package com.example.design.bridge;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer c = new PC(new Dell());
		c.sale();
	}

}
