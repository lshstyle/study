package com.example.design.action.command;

public class Invoke {

	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	public void call() {
		command.execute();
	}
}
