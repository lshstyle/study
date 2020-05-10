package com.example.design.struct.facade;

public class Client {

	public static void main(String[] args) {
		RegisterFacade register = new RegisterFacade();
		register.register();
	}
}
