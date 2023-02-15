package GreedyTechnique;

public class EgyptianFraction {

    public static void printEgyptianFraction(int numerator, int denominator) {
        //write your code here
        if(numerator==0 || denominator==0){
            System.out.println("Invalid fraction");
            return;
        }
        if(numerator%denominator==0){
            System.out.println("Not a fraction");
            return;
        }

        if(denominator%numerator==0){
            System.out.println("1/" + denominator/numerator);
            return;
        }

        //numerator>denominator
        if(numerator>denominator){
            System.out.print(numerator/denominator + ",");
            printEgyptianFraction(numerator%denominator,denominator);
        }

        int ceil = denominator/numerator + 1;
        System.out.print("1/" + ceil + ",");
        printEgyptianFraction(numerator*ceil - denominator, denominator*ceil);
    }

    public static void main(String[] args) {
        printEgyptianFraction(6,14);
    }
}
