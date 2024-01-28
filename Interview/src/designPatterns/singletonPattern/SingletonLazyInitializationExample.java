package designPatterns.singletonPattern;

/**
 * 1. Lazy Initialization (Optional):In some cases, you might want to use lazy initialization to
 *   create the Singleton instance only when it is first requested. This can be done by creating
 *   the instance inside the getInstance() method.
 */
public class SingletonLazyInitializationExample {
	
	private static SingletonLazyInitializationExample instance;
	
	private SingletonLazyInitializationExample() {
		// Private constructor to prevent instantiation
	}

	/**
	 *  This approach delays the creation of the instance until it is actually needed. 
	 * @return
	 */
	public static SingletonLazyInitializationExample getInstance() {
		
		if (instance==null) {
			instance =  new SingletonLazyInitializationExample();
		}
		return instance;
	}
	
	
}
