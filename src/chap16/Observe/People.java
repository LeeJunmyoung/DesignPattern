package chap16.Observe;

public class People implements Observer {

	private String name;
	public People(String name){
		this.name = name;
	}
	
	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		System.out.println("RECIEVE : name = "+ name + " / msg ="+ msg);
	}

}
