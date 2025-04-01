package MathsSeven;

import java.util.Scanner;

/// Make squared number from a number using minimum multiplier

public class MakeSquaredUsingSmaller {
    public static void main(String[] args) {
        long number = 147;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number here?: ");
        number = Math.abs(scanner.nextLong());
        System.out.println(findSmallerNumberForSquared(number));

        scanner.close();
    }

    public static long findSmallerNumberForSquared(long number){
        if(isSquaredNumber(number)){
            return 0;
        }
        int smallerNumber = 1;
        while(true){
            long product = number * smallerNumber;
            if(isSquaredNumber(product)){
                break;
            }
            smallerNumber++;
        }
        return smallerNumber;
    }

    public static boolean isSquaredNumber(long number){
        double sqrtRoot = Math.sqrt(number);
        return Math.floor(sqrtRoot) == Math.ceil(sqrtRoot);
    }

}
