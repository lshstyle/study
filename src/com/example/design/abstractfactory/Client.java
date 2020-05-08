package com.example.design.abstractfactory;

/**
 * 提供一个产品类库，客户端不依赖于产品类具体的实现
 * 解决产品等级和产品族的问题
 * 发动机 座椅 轮胎为一个产品族，高端车和低端车为一个产品等级结构。同一个产品等级，具有产品族的所有实现
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarFactory factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.start();
		Seat s = factory.createSeat();
		s.use();
		Tyre t = factory.createTyre();
		t.run();
	}

}
