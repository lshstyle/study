package com.example.design.create.abstractfactory;

public interface Seat {

	void use();
}

class LuxurySeat implements Seat {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("高档座椅");
	}
	
}

class LowSeat implements Seat {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("低档座椅");
	}
	
}
