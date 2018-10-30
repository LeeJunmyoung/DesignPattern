package chap03.Singleton;

public class SingletonLazyHolderThreadSafe {

	private SingletonLazyHolderThreadSafe() {
	}

	public static SingletonLazyHolderThreadSafe getInstance() {

		return LazyHolder.INSTANCE;

	}

	private static class LazyHolder {
		private static final SingletonLazyHolderThreadSafe INSTANCE = new SingletonLazyHolderThreadSafe();
	}

}
