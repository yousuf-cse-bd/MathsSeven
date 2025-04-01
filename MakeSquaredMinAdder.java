package MathsSeven;

import java.util.Scanner;
/// Minimum adder for make a squared number
public class MakeSquaredMinAdder {
    public static double sqrtRoot;
    public static void main(String[] args) {
        long number = 2187;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number here?: ");
        number = Math.abs(scanner.nextLong());

        long sqrtRootNext;
        if(!isSquared(number)){
            sqrtRootNext = (long) Math.ceil(sqrtRoot);
        }
        else{
            sqrtRootNext = (long) sqrtRoot;
        }
        long square = sqrtRootNext * sqrtRootNext;
        System.out.println("Minimum adder: "+(square - number));
        System.out.println("sqrt("+square+") == "+(long)Math.sqrt(square)+"^2");

        scanner.close();
    }

    public static boolean isSquared(long number){
        sqrtRoot = Math.sqrt(number);

        return Math.ceil(sqrtRoot) == Math.floor(sqrtRoot);
    }

}
