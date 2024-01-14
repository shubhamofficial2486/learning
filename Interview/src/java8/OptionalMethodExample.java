package java8;
import java.util.Optional;

/**
 * - Implement a method that returns an `Optional` based on certain conditions.
 */
public class OptionalMethodExample {
    public static void main(String[] args) {
        // Example usage of the method
        String input = "Hello, World!";
        Optional<String> result = processInput(input);

        // Check if the value is present and print it
        if (result.isPresent()) {
            System.out.println("Processed Result: " + result.get());
        } else {
            System.out.println("Input did not meet the conditions.");
        }
    }

    // Method that returns an Optional based on certain conditions
    private static Optional<String> processInput(String input) {
        // Check if the input is not null and has more than 5 characters
        if (input != null && input.length() > 5) {
            // Perform some processing on the input (e.g., converting to uppercase)
            String processedResult = input.toUpperCase();
            return Optional.of(processedResult);
        } else {
            // If conditions are not met, return an empty Optional
            return Optional.empty();
        }
    }
}
