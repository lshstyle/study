package com.example.design.bridge;

public interface Brand {
	void sale();
}

class Lenovo implements Brand {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("Ʒ��:����");
	}
	
}


class Dell implements Brand {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("Ʒ��:����");
	}
	
}
