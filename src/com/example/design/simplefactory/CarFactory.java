package com.example.design.simplefactory;

public class CarFactory {

	public static Car creatCar(String name) {
		if ("°ÂµÏ".equals(name)) {
			return new Audi();
		} else if ("±ÈÑÇµÏ".equals(name)) {
			return new Byd();
		} else {
			return null;
		}
	}
}
