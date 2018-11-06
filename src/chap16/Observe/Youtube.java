package chap16.Observe;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject {

	private String name;
	private List<Observer> peopleList;
	private String msg;

	public Youtube(String name){
		this.name=name;
		this.peopleList = LazyHolder.INSTANCE;
	}
	
	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		peopleList.add(o);
	}

	@Override
	public void detach(Observer o) {
		// TODO Auto-generated method stub
		if(peopleList.contains(o))
			peopleList.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		System.out.println("SEND : name = "+this.name);
		peopleList.forEach((value)->value.update(this.msg));
	}
	
	public void setMsesage(String msg){
		this.msg=msg;
		notifyObservers();
	}
	
	private static class LazyHolder {
		private static final List<Observer> INSTANCE = new ArrayList<Observer>();
	}

}
