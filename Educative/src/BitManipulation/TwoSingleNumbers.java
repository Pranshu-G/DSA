package BitManipulation;

public class TwoSingleNumbers {

    public static int[] twoSingleNumbers(int[] arr) {

        // Write your code here
        // your code will replace this placeholder return statement
        int res =0;
        int bitSum=0;
        for(int i: arr){
            bitSum=bitSum^i;
        }
        int bitMask = bitSum & (-bitSum);

        for(int i:arr){
            if((i&bitMask)!=0){
                res=res^i;
            }
        }

        int resultArr[] = new int[2];
        resultArr[0]=res;
        resultArr[1] = res^bitSum;
        return resultArr;
    }
}
