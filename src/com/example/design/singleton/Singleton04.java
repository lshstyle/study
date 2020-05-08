package com.example.design.singleton;

/**
 * 懒汉模式
 * 线程不安全
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
