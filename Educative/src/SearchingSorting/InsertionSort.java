package SearchingSorting;

public class InsertionSort {

    static void insertionSort(int[] arr, int arrSize){
        int ele,j;
        for(int i=1; i<arrSize;i++){
             ele = arr[i];
             j = i-1;
            while(j>=0 && arr[j]>ele){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = ele;
        }
    }

    static Helper obj = new Helper();
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,-1};
        insertionSort(arr,arr.length);
        obj.printArray(arr,arr.length);
    }
}
