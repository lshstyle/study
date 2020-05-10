package com.example.design.singleton;
/**
 *     
 */

import java.io.ObjectStreamException;

/**
 *  
 *  双重检锁模式：线程安全 延迟初始化
 * @author Administrator
 *
 */
public class Singleton01 {
	
	
	private Singleton01() {
		//防止反射
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	
	/**
	 * 添加volatile,防止在new 到初始化过程中的指令重排
	 */
	private static volatile Singleton01 instance;
	
	public static Singleton01 getInstance() {
		//第一重是为了判断是否需要加锁
		if (null != instance) {
			return instance;
		}
		synchronized (Singleton01.class) {
			//第二重是为了判断是否需要实例化
			if (null == instance) {
				instance = new Singleton01();
			}
		}
		return instance;
	}
	
	//防止反序列化
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
	
	//防止克隆
	public Object clone() {
		return instance;
	}

}
