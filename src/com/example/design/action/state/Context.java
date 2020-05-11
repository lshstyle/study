package com.example.design.action.state;

public class Context {

	private State state;
	
	public void setState(State state) {
		System.out.println("修改状态");
		state.handle();
	}
}
