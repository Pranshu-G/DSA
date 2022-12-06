package Array;

public class RightRotateTheArrayByOneIndex {

    public static void rotateArray(int[] arr){
        // Write - Your - Code
//        int n = arr.length;
//        int[] newArr = new int[n];
//        for(int i=0;i<n;i++){
//
//            if(i==0){
//                newArr[i] = arr[n-1];
//            }
//            else {
//                newArr[i] = arr[i - 1];
//            }
//        }
//
//        for(int i=0;i<n;i++){
//            arr[i] = newArr[i];
//        }
        for(int i:arr){
            System.out.print(i + " ");
        }

        int lastEle = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }

        arr[0] = lastEle;
        System.out.println();
        for(int i:arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        rotateArray(arr);

    }

}
