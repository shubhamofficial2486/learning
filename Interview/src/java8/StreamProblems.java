package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. **Streams API:**
   - Create a stream of integers and find the sum of all elements.
   - Given a list of names, convert them to uppercase using streams.
   - Use streams to filter and collect elements from a list.
 */
public class StreamProblems {
	
	public static void main(String[] args) {
		
//		- Create a stream of integers and find the sum of all elements.
		int[] integers = {1,2,3,4,5,6,7,8};
		Integer sum = Arrays.stream(integers).sum();
		System.out.println("Sum : "+sum);
		
//		- Given a list of names, convert them to uppercase using streams.
		List<String> namesOfShiv = List.of("Shankara", "Maheshwara", "Neelakantha", "Rudra", "Bholenath", "Pashupati", "Shambhu", "Shiva", "Hanuman");
		List<String> upperNames = namesOfShiv.stream().map(name -> {
			name = name.toUpperCase();
			return name;
		}).collect(Collectors.toList());
		System.out.println("Names : "+upperNames);
		
//		- Use streams to filter and collect elements from a list.
		 List<String> namesOfGods = List.of("Brahma", "Vishnu", "Shiva", "Ganesha", "Lakshmi", "Saraswati", "Krishna", "Rama", "Hanuman", "Durga","Maheshwara", "Neelakantha", "Rudra");
		 List<String> filteredList = namesOfGods.stream().filter(name -> namesOfShiv.contains(name)).toList();
		 System.out.println("Shiv names : "+filteredList);
	}
}
