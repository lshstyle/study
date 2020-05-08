package com.example.design.builder;

public class ThinkpadComputerDirector implements ComputerDirector{
	
	private ComputerBuilder builder;
	

	public ThinkpadComputerDirector(ComputerBuilder builder) {
		this.builder = builder;
	}

	@Override
	public Computer directorComputer() {
		// TODO Auto-generated method stub
		CPU cpu = builder.builderCPU();
		Keyboard keyboard = builder.builderKeyboard();
		Mouse mouse = builder.builderMouse();
		Computer computer = new Computer();
		computer.setCpu(cpu);
		computer.setKeyboard(keyboard);
		computer.setMouse(mouse);
		return computer;
	}

}
