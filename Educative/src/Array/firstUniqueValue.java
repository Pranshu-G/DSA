package Array;

public class firstUniqueValue {

    public static int findFirstUnique(int[] arr)
    {
        int ans=0;
        boolean isRepeated = false;
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            for(int j=0;j<arr.length;j++){
                if(arr[j]==curr && i!=j){
                    isRepeated=true;
                    break;
                }
            }
           if(isRepeated==false){
               return curr;
           }
           else{
               isRepeated=false;
           }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,4,4,3};
        int ans = findFirstUnique(arr);
        System.out.println(ans);
    }
}
