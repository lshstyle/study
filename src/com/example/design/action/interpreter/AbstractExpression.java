package com.example.design.action.interpreter;

public abstract class AbstractExpression {

	abstract void interpreter();
}

class NormalExpression extends AbstractExpression {

	@Override
	void interpreter() {
		// TODO Auto-generated method stub
		System.out.println("常规解释器");
	}
	
}


class SpecialExpression extends AbstractExpression {

	@Override
	void interpreter() {
		// TODO Auto-generated method stub
		System.out.println("特定解释器");
	}
	
}
