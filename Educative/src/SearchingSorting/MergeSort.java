package SearchingSorting;

public class MergeSort {

    public static void merge(int arr[], int left, int mid, int right){

        int i,j,k;
        int leftSize = mid-left+1;
        int rightSize = right-mid;
        int rightArr[] = new int[rightSize];
        int leftArr[] = new int[leftSize];

        for(i=0;i<leftSize;i++){
            leftArr[i] = arr[left+i];
        }
        for(i=0;i<rightSize;i++){
            rightArr[i] = arr[mid+1+i];
        }
        i=0;
        j=0;
        k=left;
        while(i<leftSize && j<rightSize){
            if(rightArr[j]<=leftArr[i]){
                arr[k++] = rightArr[j++];
            }
            else{
                arr[k++] = leftArr[i++];
            }
        }

        while(i<leftSize){
            arr[k++] = leftArr[i++];
        }
        while(j<rightSize){
            arr[k++] = rightArr[j++];
        }


    }

    public static void mergeSort(int arr[], int leftIndex, int rightIndex){
        //sanity check
    if(rightIndex<0 || leftIndex<0){
        return;
    }

    if(rightIndex>leftIndex){
        int mid = leftIndex + (rightIndex-leftIndex)/2;
        mergeSort(arr,leftIndex,mid);
        mergeSort(arr,mid+1,rightIndex);
        merge(arr,leftIndex,mid,rightIndex);
    }

    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,0,5,95,4,-100,200,0};
        int arrSize = 10;
        mergeSort(arr, 0, arrSize - 1);
        Helper obj = new Helper();
        obj.printArray(arr, arrSize);
    }


}
