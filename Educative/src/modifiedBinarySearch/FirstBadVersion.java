package modifiedBinarySearch;

public class FirstBadVersion {

    public static boolean isBadVersion(int v){

        return false;
    }
    public static int[] firstBadVersion(int n) {
        // Write your code here
        int result[] = new int[2];
        int first =1;
        int last = n;
        int calls=0;
        while(first<=last){
            int mid = (first+last)/2;
            if(isBadVersion(mid)){
                last=mid;
                calls++;
            }
            else{
                first = mid+1;
                calls++;
            }
        }
        result[0] = first;
        result[1] = calls;
        return result;
    }
}
