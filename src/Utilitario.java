import java.util.function.Function;
import java.util.function.UnaryOperator;

public final class Utilitario {
    private Utilitario() {}

    public static Function<Integer, String> integerToBinaryString = number -> Integer.toBinaryString(number);
    public static UnaryOperator<String> reverseString = string -> new StringBuilder().append(string).reverse().toString();
    public static Function<String, Integer> binaryStringToInteger = string -> Integer.parseInt(string, 2);
}