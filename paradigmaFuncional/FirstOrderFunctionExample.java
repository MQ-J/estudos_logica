import java.util.function.Function;

public class FirstOrderFunctionExample {
    public static double applyOperation(double x, Function<Double, Double> operation) {
        return operation.apply(x);
    }

    public static void main(String[] args) {
        Function<Double, Double> square = y -> y * y;
        Function<Double, Double> cube = z -> z * z * z;

        double result1 = applyOperation(3.0, square);
        double result2 = applyOperation(2.0, cube);

        System.out.println("Resultado da função de primeira ordem (quadrado): " + result1);
        System.out.println("Resultado da função de primeira ordem (cubo): " + result2);
    }
}
