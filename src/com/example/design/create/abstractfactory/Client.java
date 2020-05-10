package com.example.design.create.abstractfactory;

/**
 *
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarFactory factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.start();
		Seat s = factory.createSeat();
		s.use();
		Tyre t = factory.createTyre();
		t.run();
	}

}
