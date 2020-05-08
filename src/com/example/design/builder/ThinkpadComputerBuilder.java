package com.example.design.builder;

public class ThinkpadComputerBuilder implements ComputerBuilder{

	@Override
	public CPU builderCPU() {
		// TODO Auto-generated method stub
		System.out.println("构建联想CPU");
		return new CPU("联想CPU");
	}

	@Override
	public Keyboard builderKeyboard() {
		// TODO Auto-generated method stub
		System.out.println("构建联想Keyboard");
		return new Keyboard("联想Keyboard");
	}

	@Override
	public Mouse builderMouse() {
		// TODO Auto-generated method stub
		System.out.println("构建联想Mouse");
		return new Mouse("联想Mouse");
	}

}
