package chap06.FactoryMethod;

public class Main {

	public static void main(String[] args){
		
		ItemCreator creator = new DefaultItemCreatorFactory();

		Item item1 = creator.create("빨간 물약");
		Item item2 = creator.create("파란 물약");
		Item item3 = creator.create("초록 물약");
		
		item1.use();
		item2.use();
		item3.use();
		
		
		
	}
	
	
}
