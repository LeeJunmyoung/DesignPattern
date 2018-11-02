package chap10.Decorator.abst;



public abstract class AbstAdding implements IBeverage {

	private IBeverage beverage;
	
	public AbstAdding(IBeverage beverage){
		this.beverage=beverage;
	}

	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return beverage.getTotalPrice();
	}
	
	protected IBeverage getBeverage(){
		return beverage;
	}
	
	
	
	
	
}
