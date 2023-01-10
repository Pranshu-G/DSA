package Recursion;

public class decimalToBinary {

    public static int decimalToBinary(int n) {
        // Write your code here
        if(n==0){
            return 0;
        }
        else {
            return (n % 2 + 10*decimalToBinary(n / 2));
        }
    }

    public static void main(String[] args) {
        int ans = decimalToBinary(19);
        System.out.println(ans);

    }
}
