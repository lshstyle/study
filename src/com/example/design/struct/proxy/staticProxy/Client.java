package com.example.design.struct.proxy.staticProxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person realPerson = new RealPerson();
		Proxy proxy = new Proxy(realPerson);
		proxy.work();
		proxy.eat();
		proxy.sleep();
	}

}
