package com.example.design.create.singleton;

/**
 * ��̬�ڲ��� �ڵ�һ�ε���getInstance����ʱ��������ż���Singleton03Holder������ʼ��instance
 * @author Administrator
 *
 */
public class Singleton03 {

	private Singleton03() {
		
	}
	
	private static class Singleton03Holder {
		private static Singleton03 INSTANCE  = new Singleton03();
	}
	
	public static Singleton03 getInstance() {
		return Singleton03Holder.INSTANCE;
	}
}
