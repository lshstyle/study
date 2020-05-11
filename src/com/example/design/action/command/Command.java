package com.example.design.action.command;

public interface Command {
	void execute();
}

class CocreteCommand implements Command {

	private Receiver receiver;
	
	
	public CocreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}
	
}
