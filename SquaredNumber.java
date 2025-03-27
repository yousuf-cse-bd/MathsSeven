package MathsSeven;

import java.util.Scanner;

public class SquaredNumber {
    //My logic
    public static boolean isSquaredNumber1(long number){
        long squared = number * number;
        long root = (long) Math.sqrt(squared);

        return root == number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number here?: ");;
        long number = Math.abs(scanner.nextLong());

        System.out.println(isSquaredNumber1(number) == isSquaredNumber2(number));


        scanner.close();
    }
    //This logic from school book of class seven standard
    public static boolean isSquaredNumber2(long number){
        //Find the last digit from the number
        number = number % 10;

//        int[] lastDigitsPresent = {0, 1, 4, 5, 6, 9};
        int[] lastDigitsAbsent = {2, 3, 7, 8};

        for(var x : lastDigitsAbsent){
            if(x == number){
                return false;
            }
        }
        return true;
    }
}
