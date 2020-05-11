package com.example.design.create.simplefactory;

/**
 *
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car audi = CarFactory.creatCar("奥迪");
		Car byd = CarFactory.creatCar("比亚迪");
	}

}
