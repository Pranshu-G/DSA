package BitManipulation;

public class SingleNumber {

    public static int singleNumber(int[] arr) {

        // Write your code here
        // your code will replace this placeholder return statement
        int result =0;
        for(int i:arr){
            result = result^i;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,1,4};
        System.out.println(singleNumber(arr));
    }
}
