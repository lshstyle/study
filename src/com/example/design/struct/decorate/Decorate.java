package com.example.design.struct.decorate;

/**
 *
 * @author Administrator
 *
 */
public class Decorate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("=========原味咖啡==========="); // 1.原味咖啡
       Drink coffee = new Coffee();
       coffee.price();
       System.out.println("=========原味咖啡 加奶========"); // 1.原味咖啡
       Drink milk = new Milk(coffee);
       milk.price();
       System.out.println("=======原味咖啡 加奶 加糖==========="); // 1.原味咖啡
       Drink suger = new Suger(milk);
       System.out.println(suger.price());
       System.out.println("===========原味咖啡 加奶 加糖 加冰============"); // 1.原味咖啡
       Drink ice = new Ice(suger);
       System.out.println(ice.price());
	}

}

//抽象组件类Drink
interface Drink{
	double price();
	String desc();
}

//具体组件类Coffee
class Coffee implements Drink{
	private String name ="原味咖啡";
	public double price() {
		// TODO Auto-generated method stub
		System.out.println("原味价格:" + 10); //2.原味价格  //3 原味价格
		return 10;
	}
	public String desc() {
		return name;
	}
	
}

/**
 * 抽象装饰�??
 * @author Administrator
 *
 */
abstract class DrinkDecorate implements Drink{
	private Drink drink;
	
	DrinkDecorate(Drink drink) {
		this.drink = drink;
	}

	public double price() {
		// TODO Auto-generated method stub
		return this.drink.price();
	}
	
	public String desc() {
		return this.drink.desc();
	}

}

class Milk extends DrinkDecorate {

	Milk(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		double price  = super.price()*2;
		System.out.println("加奶价格:" + price);  //4.加奶价格
		return price;
	}
	
	@Override
	public String desc() {
		// TODO Auto-generated method stub
		return super.desc() + " 加奶";
	}

}

class Suger extends DrinkDecorate {

	Suger(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		double price  = super.price()*2;
		System.out.println("加糖价格:" + price);  //4.加奶价格
		return price;
	}
	
	@Override
	public String desc() {
		// TODO Auto-generated method stub
		return super.desc() + " 加糖";
	}
	
}

class Ice extends DrinkDecorate {

	Ice(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		double price  = super.price()*2;
		System.out.println("加冰价格:" + price);  //4.加奶价格
		return price;
	}
	
	public String desc() {
		// TODO Auto-generated method stub
		return super.desc() + " 加冰";
	}

}