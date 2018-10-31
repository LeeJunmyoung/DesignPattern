package chap06.FactoryMethod;

public abstract class ItemCreator {

	public Item create(String itemName){
		initConfig();
		Item item = createItem(itemName);
		endConfig();
		return item;
	}
	
	abstract protected void initConfig();
	
	abstract protected void endConfig();
	
	abstract protected Item createItem(String itemName);
	
	
}
