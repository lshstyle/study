package com.example.design.struct.bridge;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer c = new PC(new Dell());
		c.sale();
	}

}
