package chap16.Observe;

public interface Subject {

	void attach(Observer o);
	
	void detach(Observer o);
	
	void notifyObservers();
	
	public void setMsesage(String msg);
	
}
