package designPatterns.factoryPattern;

/**
 * implementations of the ProductFactory interface. Each concrete factory is 
 * responsible for creating a specific type of Product.
 */
public class ProductAFactory implements ProductFactory{

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new ProductA();
	}

}
