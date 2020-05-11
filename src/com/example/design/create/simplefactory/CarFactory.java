package com.example.design.create.simplefactory;

public class CarFactory {

	public static Car creatCar(String name) {
		if ("奥迪".equals(name)) {
			return new Audi();
		} else if ("比亚迪".equals(name)) {
			return new Byd();
		} else {
			return null;
		}
	}
}
