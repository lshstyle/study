package com.example.design.create.singleton;

/**
 * 静态内部类在使用的时候才加载
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
