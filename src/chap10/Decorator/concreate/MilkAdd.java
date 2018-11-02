package chap10.Decorator.concreate;

import chap10.Decorator.abst.AbstAdding;
import chap10.Decorator.abst.IBeverage;

public class MilkAdd extends AbstAdding{

	public MilkAdd(IBeverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		int milkFee =500;
		return super.getTotalPrice()+milkFee;
	}
	
	
	

}
