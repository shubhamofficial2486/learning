package java8;
import java.util.Optional;

/**
 * - Use `Optional` to handle a potentially null value and provide a default if it's absent.
 */
public class OptionalExample {
    public static void main(String[] args) {
        // Simulate a potentially null value
        String nullableValue = null;

        // Use Optional to handle the potentially null value
        Optional<String> optionalValue = Optional.ofNullable(nullableValue);

        // If the value is present, print it; otherwise, provide a default value
        String result = optionalValue.orElse("Default Value");
        System.out.println("Result: " + result);
    }
}
