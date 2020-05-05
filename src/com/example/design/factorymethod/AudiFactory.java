package com.example.design.factorymethod;

import com.example.design.factorymethod.CarFactory;

public class AudiFactory implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}
