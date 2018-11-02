package chap10.Decorator.concreate;

import chap10.Decorator.abst.IBeverage;

public class DefaultBeverage implements IBeverage{

	final private int jerk = 500;
	
	final private int warterFee = 100;
	
	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return jerk+warterFee;
	}

}
