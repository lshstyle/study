package com.example.design.abstractfactory;

public interface Tyre {

	void run();
}

class LuxuryTyre implements Tyre {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ܵÿ�");
	}
	
}

class LowTyre implements Tyre {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ܵ���");
	}
	
}
