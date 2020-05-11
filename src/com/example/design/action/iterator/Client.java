package com.example.design.action.iterator;

public class Client {

	public static void main(String[] args) {
		ConcreteMyAggregate	cma = new ConcreteMyAggregate();
		cma.add("aaa");
		cma.add("bbb");
		cma.add("ccc");
		
		MyIterator iterator = cma.createIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.getCurrentObj());
			iterator.next();
		}
	}
}
