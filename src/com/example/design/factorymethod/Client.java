package com.example.design.factorymethod;

public class Client {

	public static void main(String[] args) {
		Car audi = new AudiFactory().createCar();
		Car byd = new BydFactory().createCar();
	}
}
