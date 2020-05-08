package com.example.design.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonHandler implements InvocationHandler{
	
	private Object object;

	public PersonHandler(Object obj) {
		this.object = obj;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("执行前");
		Object obj = method.invoke(object, args);
		System.out.println("执行后");
		return obj;
	}

}
