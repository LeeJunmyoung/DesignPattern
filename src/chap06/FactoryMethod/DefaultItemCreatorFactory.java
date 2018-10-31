package chap06.FactoryMethod;

import java.util.Calendar;

public class DefaultItemCreatorFactory extends ItemCreator  {

	@Override
	protected void initConfig() {
		// TODO Auto-generated method stub
		System.out.println("Item생성을 위한 초기설정을 하였습니다. \n");
	}

	@Override
	protected void endConfig() {
		// TODO Auto-generated method stub
		System.out.println("Item 생성로그를 남깁니다. DATE : "+Calendar.getInstance().getTime()+"\n");
	}

	@Override
	protected Item createItem(String itemName) {
		System.out.println(itemName+" 아이템을 생성합니다. \n");
		
		return new DefaultItemFactory(itemName);
	}

}
