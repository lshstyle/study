package com.example;

public class StaticClass extends Parent {

	static {
		System.out.println("����һ�����ྲ̬��");
	}
	
	StaticClass(){
		System.out.println("����һ�����๹�캯��");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main����");
		StaticClass staticClass = new StaticClass();
	}

}

class Parent {
	
	static {
		System.out.println("����һ�����ྲ̬��");
	}
	
	Parent() {
		System.out.println("����һ�����๹�캯��");
	}
	
}
