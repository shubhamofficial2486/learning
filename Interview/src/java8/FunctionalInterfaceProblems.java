package java8;

/**
 * 3. **Functional Interfaces:**
   - Create a functional interface with a single abstract method and use it with a lambda expression.
   - Implement a custom functional interface for a specific use case.
 */
public class FunctionalInterfaceProblems {

	public static void main(String[] args) {
		
//		- Create a functional interface with a single abstract method and use it with a lambda expression.
		  ExampleFunctionalInterface functionalInterface = (message) -> {
			  System.out.println("This is my functional interface abstract method implementation "+message );
		  };
		  
		  functionalInterface.abstractMethod("Calling for main");
		  
//		  - Implement a custom functional interface for a specific use case.
		  CustomeFunctionalInterface addition = (a,b) -> a+b;
		  CustomeFunctionalInterface subtraction = (a,b) -> a-b;
		  CustomeFunctionalInterface multiplication = (a,b) -> a*b;
		  CustomeFunctionalInterface division = (a,b) -> (b!=0)?a/b: Double.NaN;
		  
		 System.out.println("Addition : "+addition.customAbsMethod(12, 8));
		 System.out.println("Subtraction : "+subtraction.customAbsMethod(12, 8));
		 System.out.println("Multiplication : "+multiplication.customAbsMethod(12, 8));
		 System.out.println("Division : "+division.customAbsMethod(12, 8));
	}

}
