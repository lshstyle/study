package com.example.design.builder;

public class ThinkpadComputerBuilder implements ComputerBuilder{

	@Override
	public CPU builderCPU() {
		// TODO Auto-generated method stub
		System.out.println("��������CPU");
		return new CPU("����CPU");
	}

	@Override
	public Keyboard builderKeyboard() {
		// TODO Auto-generated method stub
		System.out.println("��������Keyboard");
		return new Keyboard("����Keyboard");
	}

	@Override
	public Mouse builderMouse() {
		// TODO Auto-generated method stub
		System.out.println("��������Mouse");
		return new Mouse("����Mouse");
	}

}
