package com.example.design.struct.adapter;

/**
 * 
 *
 * @author Administerator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c = new Client();
		Adaptee adaptee = new Adaptee();
		Target t = new Adapter(adaptee);
		c.adapter(t);
		
	}
	
	public void adapter(Target t) {
		t.handleReq();
	}

}
