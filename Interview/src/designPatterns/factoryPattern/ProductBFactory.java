package designPatterns.factoryPattern;

/**
 * implementations of the ProductFactory interface. Each concrete factory is 
 * responsible for creating a specific type of Product.
 */
public class ProductBFactory implements ProductFactory{

	@Override
	public Product createProduct() {
		return new ProductB();
	}

}
