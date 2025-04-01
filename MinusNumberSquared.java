package MathsSeven;


public class MinusNumberSquared {
    public static void main(String[] args) {

        long number1;
        long number2;
        for(long i = 1; i <= 100; i++){
            number1 = i;
            number2 = number1 + 1;

            number1 *=number1;
            number2 *= number2;
            long number = Math.abs(number2 - number1);

            if(isSquared(number)){
                long root1 = (long) Math.sqrt(number1);
                long root2 = (long) Math.sqrt(number2);
                long root3 = (long) Math.sqrt(number);
                System.out.println(number1+" ~ "+number2+" = "+number);
                System.out.println(root1+" ~ "+root2+" = "+root3);
                System.out.println("-------------------------------------");
            }
        }

    }

    public static boolean isSquared(long number){
        double sqrtRoot = Math.sqrt(number);

        return Math.ceil(sqrtRoot) == Math.floor(sqrtRoot);
    }

}
