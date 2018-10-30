package chap03.Singleton;

public class SingletonNonThreadSafe {
	
	private static SingletonNonThreadSafe instance;
	
	private SingletonNonThreadSafe() {}
	
	public static SingletonNonThreadSafe getInstance(){
		if(instance==null){
			instance = new SingletonNonThreadSafe();
		}
		
		return instance;
	}
	

}
