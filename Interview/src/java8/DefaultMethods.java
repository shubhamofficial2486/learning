package java8;

/**
 * 5. **Default Methods:**
   - Create an interface with a default method and implement it in a class.
   - Deal with multiple inheritance using default methods.
 */
public class DefaultMethods {

	public static void main(String[] args) {
		
		InheritedClass inClass = new InheritedClass();
		inClass.someMethod();
	}
	

}

interface MultipleInheritance1 {
	
	
	default void someMethod() {
		System.out.println("Inside MultipleInheritance1 ");
	}
	
}

interface MultipleInheritance2 {
	 
	 default void someMethod() {
		 System.out.println("Inside MultipleInheritance2 ");
	 }
}

class InheritedClass implements MultipleInheritance1,MultipleInheritance2{

//	@Override
//	public void someMethod() {
//		// TODO Auto-generated method stub
//		MultipleInheritance2.super.someMethod();
//	}

//	@Override
//	public void someMethod() {
//		// TODO Auto-generated method stub
//		MultipleInheritance1.super.someMethod();
//	}


	@Override
	public void someMethod() {
		System.out.println("Inside InheritedClass ");
	}
	
	
	
}
