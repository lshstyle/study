package com.example.design.abstractfactory;

/**
 * �ṩһ����Ʒ��⣬�ͻ��˲������ڲ�Ʒ������ʵ��
 * �����Ʒ�ȼ��Ͳ�Ʒ�������
 * ������ ���� ��̥Ϊһ����Ʒ�壬�߶˳��͵Ͷ˳�Ϊһ����Ʒ�ȼ��ṹ��ͬһ����Ʒ�ȼ������в�Ʒ�������ʵ��
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarFactory factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.start();
		Seat s = factory.createSeat();
		s.use();
		Tyre t = factory.createTyre();
		t.run();
	}

}
