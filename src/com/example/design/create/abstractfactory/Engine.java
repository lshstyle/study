package com.example.design.create.abstractfactory;

public interface Engine {

	void start();
}

class LuxuryEngine implements Engine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("高档发动机");
	}
	
}


class LowEngine implements Engine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("低档发动机");
	}
	
}
