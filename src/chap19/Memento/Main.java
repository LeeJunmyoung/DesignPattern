package chap19.Memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CareTaker stack = new CareTaker();
		
		Information info = new Information("CREDATIAL DATA");
		
		stack.push(info.createMemento());
		
		info.setData("NORMAL DATA");
		
		System.out.println("현재 DATA :" + info.getData());
		
		info.restoreMemento(stack.pop());
		
		System.out.println("복구 DATA :" + info.getData());
	}

}
