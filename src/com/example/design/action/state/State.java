package com.example.design.action.state;

public interface State {
	void handle();
}

class FreeState implements State {

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("空闲状态");
	}
	
}


class BookedState implements State {

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("预定状态");
	}
	
}


class EntryState implements State {

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("入住状态");
	}
	
}


class exitState implements State {

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("退房状态");
	}
	
}
