package com.example.design.struct.flyweight;

/**��Ԫ�� 
 * @author Administrator
 *
 */
public interface ChessFlyWeight {

	void setColor(String color);
	String getColor();
	void display(Coordinate c);
}

class CorcreteChess implements ChessFlyWeight {

	private String color;
	
	
	public CorcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void display(Coordinate c) {
		// TODO Auto-generated method stub
		System.out.println("������ɫ:" + color);
		System.out.println("����λ��:(" + c.getX() + "," + c.getY()+")");
	}
	
}
