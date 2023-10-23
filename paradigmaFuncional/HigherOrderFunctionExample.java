import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class HigherOrderFunctionExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Função de primeira ordem: Mapeia os números para o quadrado de cada número
        Function<Integer, Integer> square = x -> x * x;

        List<Integer> squaredNumbers = map(numbers, square);
        System.out.println("Números ao quadrado: " + squaredNumbers);

        // Função de primeira ordem: Filtra os números pares
        Function<Integer, Boolean> isEven = x -> x % 2 == 0;

        List<Integer> evenNumbers = filter(numbers, isEven);
        System.out.println("Números pares: " + evenNumbers);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        return list.stream().map(mapper).toList();
    }

    public static <T> List<T> filter(List<T> list, Function<T, Boolean> predicate) {
        return list.stream().filter(predicate::apply).toList();
    }
}
