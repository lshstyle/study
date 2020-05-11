package com.example.design.action.strategy;

public class Context {

	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void printPrice(double price) {
		System.out.println("你该报价:" + strategy.price(price));
	}
}
