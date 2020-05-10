package com.example.design.factorymethod;

public interface CarFactory {

	Car createCar();
}

class AudiFactory implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}

class BydFactory implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Byd();
	}

}
