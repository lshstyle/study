package com.example.design.action.visitor;

public abstract class Staff {

	private String name;
	private double kpi;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getKpi() {
		return kpi;
	}
	public void setKpi(double kpi) {
		this.kpi = kpi;
	}
	public Staff(String name) {
		super();
		this.name = name;
	}
	
	
	public abstract void visitor(Visitor visitor);
	
}


class Engineer extends Staff{

	public Engineer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visitor(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitor(this);
	}
	
	
}


class Manager extends Staff{

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visitor(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitor(this);
	}
	
	public String getProducts() {
		return "部门业绩上升";
	}
}
