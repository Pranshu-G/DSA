package FastAndSlowPtr;

public class HappyNumber {

    public static boolean isHappyNumber(int n) {
        int slow = n;
        int fast = squareNum(n);
        int temp =0;
        while(fast!=1 && fast!=slow){
            temp = squareNum(fast);
            slow = squareNum(slow);
            fast = squareNum(temp);
        }

        if(fast==1){
            return true;
        }
        else if(fast==slow){
            return false;
        }
        // Write your code here

        return true;
    }

    public static int squareNum(int n) {

        // Write your code here

        int result = 0;
        while (n > 0) {
            result = (int) (result + Math.pow(n % 10, 2));
            n = n / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        boolean result = isHappyNumber(4);
        System.out.println(result);
    }
}
