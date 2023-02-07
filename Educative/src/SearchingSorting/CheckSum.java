package SearchingSorting;

import java.util.Random;

public class CheckSum {
    public static int[] findSum(int[] arr, int n) {
        int[] result = new int[2];
        // write your code here
        quickSort(arr,0,arr.length-1);
        int i=0;
        int j = arr.length-1;
        while(j>i){
            if(arr[i]+arr[j]<n){
                i++;
            }
            else if(arr[i]+arr[j]>n){
                j--;
            }
            else{
                result[0]=arr[i];
                result[1] = arr[j];
                return result;
            }
        }
        return result; // return the elements in the array whose sum is equal to the value passed as parameter
    }

    public static void quickSort(int[] arr,int lowIndex,int highIndex){

        if(lowIndex>=highIndex){
            return;
        }
        int pivot = arr[highIndex];

        int leftPointer = partition(arr,lowIndex,highIndex,pivot);

        quickSort(arr,lowIndex,leftPointer-1);
        quickSort(arr,leftPointer+1,highIndex);

    }

    static Helper obj = new Helper();
    public static int partition(int[] arr, int lowIndex,int highIndex,int pivot){
        int rightPointer = highIndex;
        int leftPointer = lowIndex;
        while(rightPointer>leftPointer){
            while(pivot>=arr[leftPointer] && leftPointer<rightPointer){
                leftPointer++;
            }
            while(pivot<=arr[rightPointer] && rightPointer>leftPointer){
                rightPointer--;
            }
            obj.swap(arr,leftPointer,rightPointer);
        }
        obj.swap(arr,leftPointer,highIndex);

        return leftPointer;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = {1,21,3,14,5,60,7,6};
        int[] result = findSum(numbers,24);
        obj.printArray(result,result.length);

//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = rand.nextInt(100);
//        }
//        System.out.println("Before");
//        obj.printArray(numbers, numbers.length);
//        quickSort(numbers, 0, numbers.length - 1);
//        System.out.println("After");
//        obj.printArray(numbers, numbers.length);


    }


}
