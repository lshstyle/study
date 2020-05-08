package com.example.design.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealPerson realPerson = new RealPerson();
	    PersonHandler handler = new PersonHandler(realPerson);
	    Person proxy = (Person)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Person.class}, handler);
	    proxy.work();
	}

}
