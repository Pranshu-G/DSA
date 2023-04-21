package BitManipulation;

public class ReverseBits {

    public static int reverseBits(int n) {


        // Write your code here
        int step = 31;
        int result =0;
        while(n>0){
            int temp = n&1;
            temp = temp<<step;
            result = result+temp;
            n=n/2;
            step--;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(4));
    }
}
