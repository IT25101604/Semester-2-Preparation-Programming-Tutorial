//Question 05
import java.util.Scanner;
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);
        int sum1 = calc.add(part1, part2);
        int result1 = calc.square(sum1);

        System.out.println("Result of (3 * 4 + 5 * 7)^2 is: " + result1);

        int term1 = calc.square(calc.add(4, 7));
        int term2 = calc.square(calc.add(8, 3));
        int result2 = calc.add(term1, term2);

        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 is: " + result2);
    }
}