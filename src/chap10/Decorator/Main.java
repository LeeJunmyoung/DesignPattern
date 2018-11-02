package chap10.Decorator;

import javax.swing.DebugGraphics;

import chap10.Decorator.abst.AbstAdding;
import chap10.Decorator.abst.IBeverage;
import chap10.Decorator.concreate.DefaultBeverage;
import chap10.Decorator.concreate.MilkAdd;
import chap10.Decorator.concreate.ShotAdd;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IBeverage beverage = new DefaultBeverage();
		
		//아메리카노
		beverage= new ShotAdd(beverage);
		System.out.println("아메리카노 : "+beverage.getTotalPrice());
		
		//카페라떼
		beverage= new MilkAdd(beverage);
		System.out.println("카페라떼 : "+beverage.getTotalPrice());
		
		//카펲라떼 샷 추가
		beverage= new MilkAdd(beverage);
		System.out.println("카페라떼 샷 추가 : "+beverage.getTotalPrice());
	}

}
