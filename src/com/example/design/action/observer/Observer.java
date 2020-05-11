package com.example.design.action.observer;

public interface Observer {
	void update(Subject subject);
}

class ConcreteObserver implements Observer {

	
	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		System.out.println("catch the update");
	}
	
}
