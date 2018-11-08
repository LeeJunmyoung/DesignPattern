package chap19.Memento;

public class Information {

	private String data;
	
	public Information(String data){
		this.data=data;
	}
	
	public Memento createMemento(){
		return new Memento(this.data);
	}
	
	public void restoreMemento(Memento memento){
		this.data = memento.getData();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
	
}
