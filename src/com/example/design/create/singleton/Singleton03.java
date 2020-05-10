package com.example.design.create.singleton;

/**
 * 静态内部类 在第一次调用getInstance方法时，虚拟机才加载Singleton03Holder，并初始化instance
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
