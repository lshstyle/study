	package com.example.design.action.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	protected List<Observer> list = new ArrayList<Observer>();
	
	public void register(Observer obs) {
		list.add(obs);
	}
	
	public void remove(Observer obs) {
		list.remove(obs);
	}
	
	public void notifyAllObserver() {
		for (Observer o : list) {
			o.update(this);
		}
	}
}

class ConcreteSubject extends Subject {
	public void setState() {
		this.notifyAllObserver();
	}
}
