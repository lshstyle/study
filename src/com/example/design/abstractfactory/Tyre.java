package com.example.design.abstractfactory;

public interface Tyre {

	void run();
}

class LuxuryTyre implements Tyre {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ÅÜµÃ¿ì");
	}
	
}

class LowTyre implements Tyre {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ÅÜµÃÂý");
	}
	
}
