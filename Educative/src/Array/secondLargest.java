package Array;

public class secondLargest {

    public static int findSecondMaximum(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = 0;

        for(int i: arr){
            if(i>largest){
                secondLargest = largest;
                largest = i;
            }
            else if(i<largest && i>secondLargest){
                secondLargest = i;
            }
        }

        return secondLargest;
        // Write - Your - Code
    }

    public static void main(String[] args) {
        int[] arr = {9,2,3,6};
        int result = findSecondMaximum(arr);
        System.out.println(result);
    }
}
