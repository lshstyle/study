package com.example.design.action.templateMethod;

public abstract class BankTemplateMethod {

	public void takeNumber() {
		System.out.println("取号排队");
	}
	
	public abstract void trasact();
	
	public void evaluate() {
		System.out.println("反馈评分");
	}
	
	public final void process() {
		this.takeNumber();
		this.trasact();
		this.evaluate();
	}
}

class DrawMoney extends BankTemplateMethod {

	@Override
	public void trasact() {
		// TODO Auto-generated method stub
		System.out.println("我要取款");
	}
	
}
