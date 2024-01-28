package designPatterns.factoryPattern;

/**
 * actual implementations of the Product interface.
 */
public class ProductB implements Product{

	@Override
	public void display() {
		System.out.println("This is Product B");
	}

}
