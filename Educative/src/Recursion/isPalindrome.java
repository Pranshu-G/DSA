package Recursion;

public class isPalindrome {

    public static Object isPalindrome(String text) {
        // Write your code here
        if(text.length()==0){
            return true;
        }
        else if(text.length()==1){
            return true;
        }
        else{
            if(text.charAt(0)==text.charAt(text.length()-1)){
                return isPalindrome(text.substring(1,text.length()-1));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        for(int i: arr){
            System.out.print(i + " ");
        }
        arrReverse(arr,0,arr.length-1);
       for(int i: arr){
           System.out.print(i + " ");
       }
    }

    public static void arrReverse(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        arrReverse(arr,start+1,end-1);

    }
}
