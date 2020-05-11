package com.example.design.action.observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject sub = new ConcreteSubject();
		
		ConcreteObserver obs = new ConcreteObserver();
		ConcreteObserver obs1 = new ConcreteObserver();
		ConcreteObserver obs2 = new ConcreteObserver();
		ConcreteObserver obs3 = new ConcreteObserver();
		ConcreteObserver obs4 = new ConcreteObserver();
		sub.register(obs);
		sub.register(obs1);
		sub.register(obs2);
		sub.register(obs3);
		sub.register(obs4);
		sub.setState();
	}

}
