//Question 03
import java.util.Scanner;
class EvenOddNumber {
    public boolean findEvenOrOdd(int i) {
        return (i % 2 == 0);
    }
}

public class EvenOddNumberQ3 {
    public static void main(String[] args) {
        EvenOddNumber OddEven = new EvenOddNumber();
        int DemoValue = 15;

        if (OddEven.findEvenOrOdd(DemoValue)) {
            System.out.println(DemoValue + " is Even");
        } else {
            System.out.println(DemoValue + " is Odd");
        }
    }
}
