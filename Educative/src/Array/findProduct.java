package Array;

public class findProduct {

    public static int[] findProduct(int arr[])
    {
        int n = arr.length;
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            int num = 1;
            for(int j=0;j<n;j++){
                if(j!=i){
                    num=num*arr[j];
                }

            }
            result[i] = num;


        }
        return result;
    }

    public static int[] findProductOpt(int arr[]){
        int temp =1;
        int n = arr.length;
        int result[] = new int[n];
        //product of left side
        for(int i=0;i<n;i++){
            result[i]=temp;
            temp=temp*arr[i];
        }

        temp =1;
        // product of right side
        for(int i=n-1;i>=0;i--){
            result[i]*=temp;
            temp*=arr[i];
        }

        return result;
    }

    public static int[] findProductOpt2(int[] arr){
        int n= arr.length;
        int[] result = new int[n];
        int temp =1;
        for(int i=0;i<n;i++){
            temp = temp*arr[i];
        }

        for(int j=0;j<n;j++){
            result[j] = temp/arr[j];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = findProductOpt2(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
