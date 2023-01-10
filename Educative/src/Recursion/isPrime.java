package Recursion;

public class isPrime {

    public static boolean isPrime(int num, int i) {
        // Write your code here
        // Modify the return statement according to "true"
        // or "false" according to your code
       if(num<2){
           return false;
       }
       else if(i==1){
           return true;
       }
       else if(num%i==0){
           return false;
       }
       else{
           return isPrime(num,i-1);
       }
    }

    public static void main(String[] args) {
        int input = 13;
        boolean result = isPrime(input,input/2);
        System.out.println(result);
    }
}
