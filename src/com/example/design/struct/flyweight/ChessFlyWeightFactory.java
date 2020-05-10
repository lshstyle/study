package com.example.design.struct.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * @author Administrator
 *
 */
public class ChessFlyWeightFactory {
	private static Map<String, ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	
	public static ChessFlyWeight getChess(String color) {
		if (map.get(color) != null) {
			return map.get(color);
		} else {
			ChessFlyWeight chessFlyWeight = new CorcreteChess(color);
			map.put(color, chessFlyWeight);
			return chessFlyWeight;
		}
	}
}
