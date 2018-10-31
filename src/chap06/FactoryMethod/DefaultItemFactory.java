package chap06.FactoryMethod;

public class DefaultItemFactory extends Item {

	private String itemName;
	
	public DefaultItemFactory(String itemName) {
		this.itemName=itemName;
	}
	
	@Override
	public void use() {
		System.out.println(itemName + " 을 사용했습니다.");
	}

}
