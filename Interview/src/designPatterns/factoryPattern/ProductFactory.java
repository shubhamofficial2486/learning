package designPatterns.factoryPattern;

/**
 * Factory Interface or Abstract Class: This declares the factory method, which is responsible
 * for creating instances of the Product interface or class.
 */
public interface ProductFactory {
	
	Product createProduct();
}
