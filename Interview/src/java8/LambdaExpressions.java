package java8;

import java.util.Comparator;
import java.util.List;

/**
 * 1. **Lambda Expressions:**
   - Write a lambda expression to square each element of a list.
   - Use lambda expressions to filter a list of strings starting with a specific letter.
   - Sort a list of strings using lambda expressions based on their lengths.
 */
public class LambdaExpressions {

	public static void main(String[] args) {
//		- Write a lambda expression to square each element of a list.
		List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		intList.forEach(element -> {
			System.out.println("Square of : "+element+" is "+element*element);
		});
		
//		- Use lambda expressions to filter a list of strings starting with a specific letter.
		List<String> stringList = List.of("String","Integer","Bytes","Floats","Boolean","Objects");
		List<String> filteredList = stringList.stream().filter(element -> {
		 return	element.startsWith("B");
		}).toList();
		System.out.println("Filtered List : "+filteredList);
		
//		- Sort a list of strings using lambda expressions based on their lengths.
		List<String> sortedList1 = stringList.stream().sorted((e1,e2) -> e1.length() - e2.length()).toList();
		List<String> sortedList2 = stringList.stream().sorted(Comparator.comparingLong(String::length).reversed()).toList();
		List<String> sortedList3 = stringList.stream().sorted(Comparator.comparingLong(e ->  e.length())).toList();
		
		System.out.println("Sorted List  : "+sortedList1);
		System.out.println("Sorted List using Comparator : "+sortedList2);
	}

}
