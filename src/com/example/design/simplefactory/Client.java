package com.example.design.simplefactory;

/**
 * 静态工厂方法模式 专门定义一个类来创建其他类，不需要知道具体的类，只需要知道具体类的参数
 * 不易扩展和维护，静态方法无法重写和继承，无法形成基于继承的等级结构
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car audi = CarFactory.creatCar("奥迪");
		Car byd = CarFactory.creatCar("比亚迪");
	}

}
