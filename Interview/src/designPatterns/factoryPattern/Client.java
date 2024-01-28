package designPatterns.factoryPattern;

/**
 * The Client creates instances of Product without knowing the specific implementation details. 
 * The client uses a ProductFactory to create different types of Product objects.
 */
public class Client {

	public static void main(String[] args) {
		
		ProductFactory productFactoryA = new ProductAFactory();
		Product productA = productFactoryA.createProduct();
		productA.display();
		
		ProductFactory productFactoryB = new ProductBFactory();
		Product productB = productFactoryB.createProduct();
		productB.display();
	}

}
