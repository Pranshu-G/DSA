package Array;

public class firstUniqueValue {

    public static int findFirstUnique(int[] arr)
    {
        int result = 0;
        // write your code here

        for(int i =0;i<arr.length;i++){
            result=arr[i];
            int ans = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==result){
                    break;
                }
                else{
                   continue;
                }
            }
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,0,4};
        int ans = findFirstUnique(arr);
        System.out.println(ans);
    }
}
