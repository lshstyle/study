package com.example.design.action.strategy;

public interface Strategy {

	public double price(double standPrice);
}

class NewCustFewStrategy implements Strategy{

	@Override
	public double price(double standPrice) {
		// TODO Auto-generated method stub
		return standPrice;
	}
	
}


class NewCustMoreStrategy implements Strategy{

	@Override
	public double price(double standPrice) {
		// TODO Auto-generated method stub
		return standPrice*0.9;
	}
	
}


class OldCustFewStrategy implements Strategy{

	@Override
	public double price(double standPrice) {
		// TODO Auto-generated method stub
		return standPrice*0.85;
	}
	
}



class OldCustMuchStrategy implements Strategy{

	@Override
	public double price(double standPrice) {
		// TODO Auto-generated method stub
		return standPrice*0.8;
	}
	
}
