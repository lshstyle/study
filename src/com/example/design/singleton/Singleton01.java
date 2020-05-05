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
