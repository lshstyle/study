package com.example.design.singleton;

/**
 * 饿汉模式  线程安全 但不能延迟加载，类初始化创建对象，占用资源
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
