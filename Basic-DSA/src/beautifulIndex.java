public class beautifulIndex {

    public static int beautifulIndex(int N, int[] A)
    {

//        int beautifulIndex=1;
//
//        for(int i = 0; i< N; i++,beautifulIndex++){
//            int prefix = 0, suffix = 0;
//            int k=0;
//            while(k<beautifulIndex-1){
//                prefix = prefix + A[k];
//                k++;
//            }
//            for(int j = N; j>beautifulIndex; j--){
//                suffix = suffix + A[j-1];
//            }
//            if(prefix == suffix){
//                return beautifulIndex;
//            }
//            else{
//                continue;
//            }
//        }
//        return -1;
        int ans = recursiveBI(1, A,N);
        return ans;
    }

    public static int OptimalSol(int N, int[] A){
        int prefix = 0;
        int suffix =0;
        for (int i : A) {
            prefix = prefix + i;
        }

        for(int j = 0; j<N ; j++){
            prefix-=A[j];
            if(prefix==suffix){
                return j+1;
            }
            suffix = suffix + A[j];
        }

        return -1;
    }
    public static int recursiveBI(int beautifulIndex, int A[], int N){
        int i =0, j =N-1;
        int prefix = 0, suffix =0;
        while(i<beautifulIndex-1){
            prefix = prefix + A[i];

            i++;

        }
        while(j>beautifulIndex-1){
            suffix = suffix + A[j];
            j--;
        }

        if(prefix==suffix){
            return beautifulIndex;
        }
        else if(prefix!=suffix && beautifulIndex<=N){
            return recursiveBI(beautifulIndex+1,A, N);
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] A = {5,0,1,4};
        int ans = OptimalSol(4,A);
        System.out.println(ans);
    }
}
