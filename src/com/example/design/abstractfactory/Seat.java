package com.example.design.abstractfactory;

public interface Seat {

	void use();
}

class LuxurySeat implements Seat {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("坐着舒服");
	}
	
}

class LowSeat implements Seat {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("坐着不舒服");
	}
	
}
