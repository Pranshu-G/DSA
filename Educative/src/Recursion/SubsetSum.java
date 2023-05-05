package Recursion;

public class SubsetSum {

    static boolean helper(int[] arr, int sum, int tempSum, int i){
        if(tempSum==sum){
            return true;
        }
        if(i>=arr.length){
            return false;
        }
        boolean recCall1 =   helper(arr,sum,tempSum+arr[i],i+1);
        boolean recCall2 = helper(arr,sum,tempSum,i+1);
        return recCall1 || recCall2;
    }
   static boolean isSubsetSum(int[] arr, int sum){


        return helper(arr,sum,0,0);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int sum = 9;
        System.out.println(isSubsetSum(arr,-1));
    }
}
