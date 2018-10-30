package chap03.Singleton;

public class SingletonDCLThreadSafe {
	
	private static SingletonDCLThreadSafe instance;
	
	private SingletonDCLThreadSafe() {}
	
	public static SingletonDCLThreadSafe getInstance(){
		if(instance==null){
			synchronized (SingletonDCLThreadSafe.class) {
				if(instance==null){
					instance = new SingletonDCLThreadSafe();
				}
			}
		}
		return instance;
		
	}
	

}
