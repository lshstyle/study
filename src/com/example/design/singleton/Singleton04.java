package com.example.design.singleton;

/**
 * ����ģʽ+˫�ؼ��
 * ֻ��һ��ʵ������
 * ���캯��˽�л�
 * �����ṩһ����̬��ʵ������
 * ��ָֹ������ ���volatile
 * @author Administrator
 *
 */
public class Singleton04 {
	
	private Singleton04() {
	
	}
	
	private static volatile Singleton04 instance;
	
	public static Singleton04 getInstance() {
		if (null != instance) {
			instance = new Singleton04();
		}
		
		return instance;
	}

}
