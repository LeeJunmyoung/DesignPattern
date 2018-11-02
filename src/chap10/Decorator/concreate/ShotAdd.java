package chap10.Decorator.concreate;

import chap10.Decorator.abst.AbstAdding;
import chap10.Decorator.abst.IBeverage;

public class ShotAdd extends AbstAdding {

	protected int shotCount=0;
	
	public ShotAdd(IBeverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return super.getTotalPrice()+getShotAddPrice();
	}
	
	private int getShotAddPrice(){
		shotCount++;
		int addPrice = 500;
		if(shotCount>1){
			addPrice=300;
		}
		return addPrice;
	}
	

}
