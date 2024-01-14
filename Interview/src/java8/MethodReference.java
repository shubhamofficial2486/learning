package java8;

import java.util.Arrays;

/**
 * 4. **Method References:**
   - Replace a lambda expression with a method reference for a specific scenario.
   - Use a method reference to create a comparator for sorting a list.
 */
public class MethodReference {

	public static void main(String[] args) {
//		- Replace a lambda expression with a method reference for a specific scenario.
//		- Use a method reference to create a comparator for sorting a list.
		String[] array = {"Brahma", "Vishnu", "Shiva", "Ganesha", "Lakshmi", "Saraswati", "Krishna", "Rama", "Hanuman", "Durga","Maheshwara", "Neelakantha", "Rudra"};		
		//Without Method Reference
		Arrays.sort(array ,(e1,e2) -> UtilityClass.compareByLength(e1,e2));	
		//With Method Reference
		Arrays.sort(array, UtilityClass::compareByLength);		
		System.out.println("Sorted : "+Arrays.toString(array));
				

	}

}

class UtilityClass {
	
	static int compareByLength(String s1, String s2) {
		return Integer.compare(s1.length(), s2.length());
	}
}
