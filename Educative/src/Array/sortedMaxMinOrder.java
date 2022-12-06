package Array;

public class sortedMaxMinOrder {


    public static void maxMin(int[] arr) {
        int minIndx = 0;
        int maxIndx = arr.length-1;
        int maxEle = arr[maxIndx]+1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]+=(arr[maxIndx]%maxEle)*maxEle;
                maxIndx--;
            }
            else{
                arr[i]+=(arr[minIndx]%maxEle)*maxEle;
                minIndx++;
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/maxEle;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        maxMin(arr);
    }
}
