package com.example.design.action.visitor;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff engineer = new Engineer("李工程师");
		Staff manager = new Manager("王主管");
		Visitor visitor = new CEOVisitor();
		engineer.visitor(visitor);
		manager.visitor(visitor);
	}

}
