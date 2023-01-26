import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class TesteStream {

    public static void main(String[] args) {

        int[] numbers = {3, 1, 7, 4, 6, 5, 8, 10, 9};

        List<String> marcas = Arrays.asList("BMW", "AUDI", "HONDA");

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!!";

        marcas.stream()
                .map(Utils.firstLetter)
                .map(Utils.toLowerCase)
                .forEach(System.out::println);

    }
}
