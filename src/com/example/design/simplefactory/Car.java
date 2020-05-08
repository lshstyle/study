package com.example.design.simplefactory;

public abstract class Car {
	
	private String name;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void run();

}

class Audi extends Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("°ÂµÏ³µ");
	}
	
}

class Byd extends Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("±ÈÑÇµÏ");
	}

}
