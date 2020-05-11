package com.example.design.create.singleton;
/**
 *     
 */

import java.io.ObjectStreamException;

/**
 *  
 * 双重检锁
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
	 * volatile 防止指令重排
	 */
	private static volatile Singleton01 instance;
	
	public static Singleton01 getInstance() {
		//判断是否需要加锁
		if (null != instance) {
			return instance;
		}
		synchronized (Singleton01.class) {
			//判断是否需要实例化
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
