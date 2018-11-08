package chap19.Memento;

import java.util.Stack;

public class CareTaker {

	Stack<Memento> mementos;
	
	public CareTaker() {
		mementos = new Stack<Memento>();
	}
	
	public void push(Memento memento){
		mementos.push(memento);
	}
	
	public Memento pop(){
		return mementos.pop();
	}
}
