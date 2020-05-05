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
public class Singleton01 {
	
	private Singleton01() {
	
	}
	
	private static volatile Singleton01 instance;
	
	public static Singleton01 getInstance() {
		if (null != instance) {
			return instance;
		}
		synchronized (Singleton01.class) {
			if (null == instance) {
				instance = new Singleton01();
			}
		}
		return instance;
	}

}
