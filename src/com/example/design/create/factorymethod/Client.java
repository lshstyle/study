package com.example.design.create.factorymethod;

/**
 * ���幤�������Ĺ����ӿڣ��ɾ����������ʵ�������µĲ�Ʒֻ��Ҫ����µĹ������࣬���Ͽ���ԭ��
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		Car audi = new AudiFactory().createCar();
		Car byd = new BydFactory().createCar();
	}
}
