package com.example.design.action.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<AbstractExpression> list = new ArrayList<AbstractExpression>();
		list.add(new NormalExpression());
		list.add(new SpecialExpression());
		for (AbstractExpression e: list) {
			e.interpreter();
		}
	}

}
