package Array;

public class RemoveEvenIntegers {

    public static int[] removeEven(int[] arr){
        int i;
        int count=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]=0;
            }
            else{
                count++;
            }
        }
        int[] newArr = new int[count];
        int j=0;
        for (i = 0;  i<arr.length ; i++) {
            if(arr[i]!=0){
                newArr[j]=arr[i];
                j++;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,10,6,3};
        int[] result = removeEven(arr);
        for (int i = 0; i < result.length ; i++) {
            System.out.println(result[i]);
        }
    }
}
