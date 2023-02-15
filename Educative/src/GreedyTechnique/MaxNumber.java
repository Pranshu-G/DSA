package GreedyTechnique;

public class MaxNumber {
    public static void findLargestNumber(int number_of_digits, int sum_of_digits ) {
        int i = 9;
        int currDigits = number_of_digits;
        if (sum_of_digits == 0) {
            if (number_of_digits == 1) {
                System.out.print(0);
            } else {
                System.out.print("None");
            }
            return;
        }
        // sumOfDigits is greater than the maximum possible sum.
        if (sum_of_digits > 9 * number_of_digits) {
            System.out.print("None");
            return;
        }
        while(i>=0){
            if(sum_of_digits-i>=0 && currDigits>0){
                System.out.print(i);
                currDigits--;
                sum_of_digits-=i;
            }
            else if(sum_of_digits-i<0){
                i--;
            }

        }

        System.out.print("\n");
    }

    public static void main(String[] args) {
        findLargestNumber(3,100);
    }
}
