//Question 04
import java.util.Scanner;
public class PatternPrint  {
    public static void main(String[] args) {
        
        System.out.println("Using while loop");
        int rowWhile = 0;
        while (rowWhile < 5) {
            int colWhile = 0;
            while (colWhile < 5) {
                System.out.print("* ");
                colWhile++;
            }
            System.out.println(); 
            rowWhile++;
        }

        System.out.println(); 

        System.out.println("Using for loop");
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}