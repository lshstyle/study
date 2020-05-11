package com.example.design.action.command;


public class Client {

	public static void main(String[] args) {
		Command c = new CocreteCommand(new Receiver());
		Invoke invoke = new Invoke(c);
		invoke.call();
	}
}
