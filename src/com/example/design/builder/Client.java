package com.example.design.builder;

/**
 * 构建者模式将构造和装配分离
 * 使客户端不必知道产品内部的细节，具体的构建类之间相互独立，便于扩展，单一职责
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComputerDirector director = new ThinkpadComputerDirector(new ThinkpadComputerBuilder());
		Computer computer = director.directorComputer();
	    System.out.println(computer.getCpu().getName());
	    System.out.println(computer.getKeyboard().getName());
	    System.out.println(computer.getMouse().getName());
	}

}
