public class IT25101432q5 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Expression 1: (3 * 4 + 5 * 7)^2
        int result1 = calc.square(
                calc.add(
                        calc.multiply(3, 4),
                        calc.multiply(5, 7)
                )
        );

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int result2 = calc.add(
                calc.square(calc.add(4, 7)),
                calc.square(calc.add(8, 3))
        );

        System.out.println("Result of (3 * 4 + 5 * 7)^2 = " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 = " + result2);
    }
}

// Calculator class in the same file
class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int a) {
        return a * a;
    }
}
