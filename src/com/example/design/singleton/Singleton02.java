package com.example.design.singleton;

/**
 * ����ģʽ  �̰߳�ȫ �������ӳټ��أ����ʼ����������ռ����Դ
 * @author Administrator
 *
 */
public class Singleton02 {

	private Singleton02() {
		
	}
	
	private static Singleton02 instance = new Singleton02();
	
	public static Singleton02 getInstance() {
		return instance;
	}
}
