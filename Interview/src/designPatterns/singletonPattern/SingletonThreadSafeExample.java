package designPatterns.singletonPattern;

/**
 * Thread Safety (Optional): If your application is multithreaded, you might need to consider thread
 * safety to ensure that only one instance is created even in a concurrent environment. This can be
 * achieved using synchronization, double-check locking, or other thread-safe mechanisms.
 */
public class SingletonThreadSafeExample {
	// The volatile keyword ensures that changes made by one thread are visible to all other threads.
	private static volatile SingletonThreadSafeExample instance;

	private SingletonThreadSafeExample() {
		// Private constructor to prevent instantiation
		}

	public static SingletonThreadSafeExample getInstance() {
		
		if (instance == null) {
			synchronized(SingletonThreadSafeExample.class) {
				if (instance == null) {
					instance = new SingletonThreadSafeExample();
				}
			}
		}
		return instance;
	}

	
}
