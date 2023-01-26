import java.util.Arrays;
import java.util.List;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        nums.stream()
                .map(Utilitario.integerToBinaryString)
                .map(Utilitario.reverseString)
                .map(Utilitario.binaryStringToInteger)
                .forEach(System.out::println);


    }
}
