package chap03.Singleton;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		new Thread(() -> {
			SingletonNonThreadSafe nonSafeSingleton = SingletonNonThreadSafe.getInstance();
			System.out.println("SingletonNonThreadSafe : "+nonSafeSingleton.toString());
		}).start();
		new Thread(() -> {
			SingletonNonThreadSafe nonSafeSingleton = SingletonNonThreadSafe.getInstance();
			System.out.println("SingletonNonThreadSafe : "+nonSafeSingleton.toString());
		}).start();
		//같을 수 도 있고 아닐 수도 있고 non-thread safe 
		
		new Thread().sleep(10L);
		
		
		new Thread(() -> {
			SingletonDCLThreadSafe dclSafeSingleton = SingletonDCLThreadSafe.getInstance();
			System.out.println("SingletonDCLThreadSafe : "+dclSafeSingleton.toString());
		}).start();
		new Thread(() -> {
			SingletonDCLThreadSafe dclSafeSingleton = SingletonDCLThreadSafe.getInstance();
			System.out.println("SingletonDCLThreadSafe : "+dclSafeSingleton.toString());
		}).start();
		//thread에 safe 하지만 ... 찾아보기론 성능저하가 있다고한다 아무래도 쓰레드를 락킹하니 성능저하가 있을수 밖에..
		
		new Thread().sleep(10L);
		
		new Thread(() -> {
			SingletonLazyHolderThreadSafe lazyHolderSafeSingleton = SingletonLazyHolderThreadSafe.getInstance();
			System.out.println("SingletonLazyHolderThreadSafe : "+lazyHolderSafeSingleton.toString());
		}).start();
		new Thread(() -> {
			SingletonLazyHolderThreadSafe lazyHolderSafeSingleton = SingletonLazyHolderThreadSafe.getInstance();
			System.out.println("SingletonLazyHolderThreadSafe : "+lazyHolderSafeSingleton.toString());
		}).start();
		//holder 안에 선언된 instance가 static이기 때문에 클래스 로딩 시점에 한번만 호출된다는 점.
		
		
	}

}
