package SearchingSorting;

public class BubbleSort {

   static Helper obj = new Helper();
    static void bubbleSort(int arr[], int arrSize) {

        for(int i=0;i<arrSize-1;i++){
            for(int j=0;j<arrSize-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,-1};
        bubbleSort(arr,arr.length);
        obj.printArray(arr,arr.length);
    }
}
