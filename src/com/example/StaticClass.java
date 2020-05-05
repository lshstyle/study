package com.example;

public class StaticClass extends Parent {

	static {
		System.out.println("这是一个子类静态块");
	}
	
	StaticClass(){
		System.out.println("这是一个子类构造函数");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main方法");
		StaticClass staticClass = new StaticClass();
	}

}

class Parent {
	
	static {
		System.out.println("这是一个父类静态块");
	}
	
	Parent() {
		System.out.println("这是一个父类构造函数");
	}
	
}
