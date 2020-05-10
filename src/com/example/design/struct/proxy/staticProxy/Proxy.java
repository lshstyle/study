package com.example.design.struct.proxy.staticProxy;

public class Proxy implements Person{

	private Person person;
	
	public Proxy(Person person) {
		this.person = person;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Proxy work");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		this.person.eat();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		this.person.sleep();
	}

}
