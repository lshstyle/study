package com.example.design.singleton;
/**
 *     
 */

import java.io.ObjectStreamException;

/**
 *  
 *  ˫�ؼ���ģʽ���̰߳�ȫ �ӳٳ�ʼ��
 * @author Administrator
 *
 */
public class Singleton01 {
	
	
	private Singleton01() {
		//��ֹ����
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	
	/**
	 * ���volatile,��ֹ��new ����ʼ�������е�ָ������
	 */
	private static volatile Singleton01 instance;
	
	public static Singleton01 getInstance() {
		//��һ����Ϊ���ж��Ƿ���Ҫ����
		if (null != instance) {
			return instance;
		}
		synchronized (Singleton01.class) {
			//�ڶ�����Ϊ���ж��Ƿ���Ҫʵ����
			if (null == instance) {
				instance = new Singleton01();
			}
		}
		return instance;
	}
	
	//��ֹ�����л�
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
	
	//��ֹ��¡
	public Object clone() {
		return instance;
	}

}
