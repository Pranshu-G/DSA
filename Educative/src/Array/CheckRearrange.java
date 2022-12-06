package Array;

public class CheckRearrange {

    public static void reArrange(int[] arr) {

        //Write - Your - Code
        int startIndex = 0;
        int lastIndex = arr.length-1;
        int i = 0;

        while(i< arr.length){
            if(arr[i]<0){
                int tempSwap = arr[startIndex];
                arr[startIndex]=arr[i];
                arr[i] = tempSwap;
                startIndex++;
            }
            i++;
        }
        System.out.println();
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,-1,20,4,5,-9,-6};
        reArrange(arr);
    }
}
