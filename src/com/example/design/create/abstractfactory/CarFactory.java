package com.example.design.create.abstractfactory;

public interface CarFactory {

	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}

class LuxuryCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new LuxuryEngine();
	}

	@Override
	public Seat createSeat() {
		// TODO Auto-generated method stub
		return new LuxurySeat();
	}

	@Override
	public Tyre createTyre() {
		// TODO Auto-generated method stub
		return new LuxuryTyre();
	}
	
}

class LowCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new LowEngine();
	}

	@Override
	public Seat createSeat() {
		// TODO Auto-generated method stub
		return new LowSeat();
	}

	@Override
	public Tyre createTyre() {
		// TODO Auto-generated method stub
		return new LowTyre();
	}
	
}
