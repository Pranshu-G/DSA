public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        //Your code goes here
        int first = 0;
        int last = arr.length -1;
        int mid = (first+last)/2;

        while(first<=last){
            if(arr[mid]<x){
                first = mid+1;
            }
            else if(arr[mid] == x){
                System.out.println("element found");
                return mid;
            }
            else if(arr[mid]>x){
                last = mid-1;
            }

            mid = (first+last)/2;
        }
        if(first>last){
            return -1;
        }
        return -1;

    }
    public static void main(String[] args){
      int arr[] = {1};
      System.out.println(binarySearch(arr,20));
    }
}