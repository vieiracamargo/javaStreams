import java.util.function.UnaryOperator;

public final class Utils {

    private Utils() {}

    public static  UnaryOperator<String> firstLetter = word -> word.charAt(0) + "";
    public static  UnaryOperator<String> toLowerCase = word -> word.toLowerCase();
}
