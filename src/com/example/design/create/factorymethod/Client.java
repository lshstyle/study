package com.example.design.create.factorymethod;

/**
 * 定义工厂方法的公共接口，由具体子类完成实例化，新的产品只需要添加新的工厂子类，符合开闭原则
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		Car audi = new AudiFactory().createCar();
		Car byd = new BydFactory().createCar();
	}
}
