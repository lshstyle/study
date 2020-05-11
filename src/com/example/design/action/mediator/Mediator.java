package com.example.design.action.mediator;

public interface Mediator {
	void register(String name, Department dept);
	void command(String name);
}
