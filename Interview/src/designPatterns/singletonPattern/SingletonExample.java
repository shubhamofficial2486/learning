package designPatterns.singletonPattern;

public class SingletonExample {

	/**
	 * 1 .Static Instance: The Singleton class contains a private static instance of
	 * itself. This instance is typically created when the class is loaded into the
	 * memory.
	 * 2.The static keyword ensures that there is only one instance of the
	 * variable shared among all instances of the class.
	 */
	private static final SingletonExample instance = new SingletonExample();

	/**
	 * 1. Private Constructor: The Singleton class has a private constructor to
	 * ensure that the class cannot be instantiated from outside the class itself.
	 * 2. The constructor is marked as private, preventing external classes from
	 * creating instances using new SingletonExample().
	 */
	private SingletonExample() {
		// Private constructor to prevent instantiation
	}

	/**
	 * 1. To obtain the instance of the Singleton class, a public static method
	 * (getInstance()) is provided. 
	 * 2. The method checks whether an instance of the class already exists. If it does,
	 *  it returns the existing instance; otherwise, it creates a new instance.
	 * 
	 * @return
	 */
	public static SingletonExample getInstance() {
		return instance;
	}
	
}
