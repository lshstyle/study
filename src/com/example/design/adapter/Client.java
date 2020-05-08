package com.example.design.adapter;

/**
 * 客户端通过适配器将一个接口转换成另一个接口
 * Target 目标接口
 * Adapeter 适配器 具体实现  通过适配器去实现目标接口
 * Adaptee 被适配的对象
 * @author Administerator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c = new Client();
		Adaptee adaptee = new Adaptee();
		Target t = new Adapter(adaptee);
		c.adapter(t);
		
	}
	
	public void adapter(Target t) {
		t.handleReq();
	}

}
