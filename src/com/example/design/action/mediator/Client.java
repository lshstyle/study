package com.example.design.action.mediator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator mediator = new Leader();
		Market market = new Market(mediator);
		Development dev = new Development(mediator);
		Finacial finacial = new Finacial(mediator);
		
		market.selfAction();
		market.outAction();
	}

}
