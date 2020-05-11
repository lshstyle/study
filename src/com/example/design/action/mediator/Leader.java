package com.example.design.action.mediator;

import java.util.HashMap;
import java.util.Map;

public class Leader implements Mediator {

	private Map<String, Department> map = new HashMap<String, Department>();

	@Override
	public void register(String name, Department dept) {
		// TODO Auto-generated method stub
		map.put(name, dept);
	}

	@Override
	public void command(String name) {
		// TODO Auto-generated method stub
		map.get(name).outAction();
	}
	
	
}
