package com.example.design.simplefactory;

/**
 * ��̬��������ģʽ ר�Ŷ���һ���������������࣬����Ҫ֪��������ֻ࣬��Ҫ֪��������Ĳ���
 * ������չ��ά������̬�����޷���д�ͼ̳У��޷��γɻ��ڼ̳еĵȼ��ṹ
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car audi = CarFactory.creatCar("�µ�");
		Car byd = CarFactory.creatCar("���ǵ�");
	}

}
