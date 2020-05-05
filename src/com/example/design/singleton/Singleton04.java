package com.example.design.singleton;

/**
 * 懒汉模式+双重检测
 * 只有一个实例对象
 * 构造函数私有化
 * 对外提供一个静态的实例对象
 * 防止指令重排 添加volatile
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
