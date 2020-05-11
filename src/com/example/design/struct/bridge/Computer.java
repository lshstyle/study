package com.example.design.struct.bridge;

public class Computer {

	protected Brand brand;
	
	public Computer(Brand brand) {
		this.brand = brand;
	}
	
	public void sale() {
		brand.sale();
	}
}

class PC extends Computer {

	public PC(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	
	public void sale() {
		super.sale();
		System.out.println("类型:̨台式机");
	}
	
}


class Pad extends Computer {

	public Pad(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	
	public void sale() {
		super.sale();
		System.out.println("类型:平板电脑");
	}
	
}
