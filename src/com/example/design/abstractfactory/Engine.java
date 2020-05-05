package com.example.design.abstractfactory;

public interface Engine {

	void start();
}

class LuxuryEngine implements Engine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Æô¶¯¿ì");
	}
	
}


class LowEngine implements Engine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Æô¶¯Âý");
	}
	
}
