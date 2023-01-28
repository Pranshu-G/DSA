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


    public static int findSecondMaximum2(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i: arr){
            if(i>largest){
                secondLargest = largest;
                largest = i;
            }
            else {
                if(i>secondLargest && i!=largest){
                    secondLargest=i;
                }
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int result = findSecondMaximum2(arr);
        System.out.println(result);
    }
}
