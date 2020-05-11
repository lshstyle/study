package com.example.design.action.memento;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CareTaker careTaker = new CareTaker();
		Emp emp = new Emp("第一代", 20, 900);
		System.out.println("第一次备忘");
		careTaker.setMemento(emp.memento());
		System.out.println("ename:" + emp.getEname() + " age:" + emp.getAge() 
		+ " salary:" + emp.getSalary());
		
		emp.setEname("第二代");
		System.out.println("ename:" + emp.getEname() + " age:" + emp.getAge() 
		+ " salary:" + emp.getSalary());
		
		emp.recovery(careTaker.getMemento());
		System.out.println("回滚");
		System.out.println("ename:" + emp.getEname() + " age:" + emp.getAge() 
		+ " salary:" + emp.getSalary());
		
		
	}

}
