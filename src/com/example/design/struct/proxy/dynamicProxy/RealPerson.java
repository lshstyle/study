package com.example.design.struct.proxy.dynamicProxy;

public class RealPerson implements Person{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("RealPerson work");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("RealPerson eat");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("RealPerson sleep");
	}

}
