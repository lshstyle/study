package com.example.design.action.memento;

/**
 * 源发器类
 * @author Administrator
 *
 */
public class Emp { 
	
	private String ename;
	private int age;
	private double salary;
	
	public EmpMemento memento() {
		return new EmpMemento(this);
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Emp(String ename, int age, double salary) {
		super();
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}
	
	public void recovery(EmpMemento emt) {
		this.ename = emt.getEname();
		this.age = emt.getAge();
		this.salary = emt.getSalary();
	}

}
