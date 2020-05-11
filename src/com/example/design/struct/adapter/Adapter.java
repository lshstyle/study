package com.example.design.struct.adapter;

/**
 * 适配器
 * @author Administrator
 *
 */
public class Adapter implements Target{
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void handleReq() {
		// TODO Auto-generated method stub
		this.adaptee.request();
	}

}
