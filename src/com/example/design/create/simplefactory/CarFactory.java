package com.example.design.create.simplefactory;

public class CarFactory {

	public static Car creatCar(String name) {
		if ("�µ�".equals(name)) {
			return new Audi();
		} else if ("���ǵ�".equals(name)) {
			return new Byd();
		} else {
			return null;
		}
	}
}
