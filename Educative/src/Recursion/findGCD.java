package Recursion;

public class findGCD {

    public static int gcd(int num1, int num2) {
        // Write your code here
        if(num1>num2){
            if(num2==0){
                return num1;
            }
            else{
                return gcd(num1%num2,num2);
            }
        }
        else if(num2>num1){
            if(num1==0){
                return num2;
            }
            else{
                return gcd(num2%num1,num1);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int ans = gcd(36,54);
        System.out.println(ans);
    }
}
