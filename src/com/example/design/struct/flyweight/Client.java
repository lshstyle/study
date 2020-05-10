package com.example.design.struct.flyweight;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChessFlyWeightFactory factory = new ChessFlyWeightFactory();
		ChessFlyWeight chess1 = factory.getChess("ºÚÉ«");
		ChessFlyWeight chess2 = factory.getChess("ºÚÉ«");
		chess1.display(new Coordinate(10, 20));
		chess2.display(new Coordinate(20, 20));
		
	}

}
