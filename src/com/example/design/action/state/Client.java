package com.example.design.action.state;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		context.setState(new FreeState());

		context.setState(new BookedState());
	}

}
