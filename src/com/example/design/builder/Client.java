package com.example.design.builder;

/**
 * ������ģʽ�������װ�����
 * ʹ�ͻ��˲���֪����Ʒ�ڲ���ϸ�ڣ�����Ĺ�����֮���໥������������չ����һְ��
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComputerDirector director = new ThinkpadComputerDirector(new ThinkpadComputerBuilder());
		Computer computer = director.directorComputer();
	    System.out.println(computer.getCpu().getName());
	    System.out.println(computer.getKeyboard().getName());
	    System.out.println(computer.getMouse().getName());
	}

}
