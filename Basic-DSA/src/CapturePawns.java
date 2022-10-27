public class CapturePawns {

    public static int captureThePawns(String board[]) {
        // Write your code here..
        int ans =0;
        //Horizontal
        int R=-1, C =-1;
        for(int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                if(board[i].charAt(j)=='R'){
                    R = i;
                    C = j;
                    break;
                }
            }
        }

        //upward
        for(int i = R+1;i<8;i++){
            if(board[i].charAt(C) == 'P'){
                ans++;
                break;
            }
            if(board[i].charAt(C)=='B'){
                break;
            }
        }

        //downward
        for(int i = R-1;i>-1;i--){
            if(board[i].charAt(C) == 'P'){
                ans++;
                break;
            }
            if(board[i].charAt(C)=='B'){
                break;
            }
        }

        // left

        for(int i = C-1;i>-1;i--){
            if (board[R].charAt(i)=='P') {
                ans++;
                break;
            }
            if (board[R].charAt(i)=='B') {
                break;
            }
        }

        // right
        for(int i = C+1;i<8;i++){
            if (board[R].charAt(i)=='P') {
                ans++;
                break;
            }
            if (board[R].charAt(i)=='B') {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "P**R**BP";
        String[] arr = new String[1];
        arr[0] = s;

    }
}
