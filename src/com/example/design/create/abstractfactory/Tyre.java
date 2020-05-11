package com.example.design.create.abstractfactory;

public interface Tyre {

	void run();
}

class LuxuryTyre implements Tyre {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("高档轮胎");
	}
	
}

class LowTyre implements Tyre {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("低档轮胎");
	}
	
}
