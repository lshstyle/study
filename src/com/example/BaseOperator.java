package com.example;

public class BaseOperator {

	public static void main(String[] args) {
		
		
				
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++b);
		System.out.println(b);
		
		System.out.println(12>>2);
		System.out.println(3<<2);
		System.out.println(~4);
		
		//System.out.println(1>0&a<1/0);
		//System.out.println(1>0&&a<1/0);
		//System.out.println(1>0|a<1/0);
		System.out.println(1>0||a<1/0);
		String str = "123";
		switch(str) {
		case "123": System.out.println(3333);break;
		default: System.out.println(4444);break;
		}
	}

}
