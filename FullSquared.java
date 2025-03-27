package MathsSeven;

import java.util.Scanner;

//Application of floor() and ceil()

public class FullSquared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number here?: ");;
        long number = Math.abs(scanner.nextLong());

        System.out.println(isFullSquaredNumber(number));

    }
    public static boolean isFullSquaredNumber(long number){
        double root = Math.sqrt(number);
        return Math.floor(root) == Math.ceil(root);
    }
}
