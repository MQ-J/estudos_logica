public class PureFunctionExample {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(3, 5);
        System.out.println("Resultado da função pura: " + result);
    }
}