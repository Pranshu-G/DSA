package Tree1;

public class KthSmallestBST {
//   static int count = 0;
//    public static int kthSmallestElement(Node root, int k) {
//        // Replace this placeholder return statement with your code
//        if(root==null){
//            return -1;
//        }
//
//        int l = kthSmallestElement(root.left,k);
//        if(l!=-1){
//            return l;
//        }
//        count++;
//        if(count==k){
//            return root.data;
//        }
//        return kthSmallestElement(root.right,k);
//
//
//    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static int getMaxSubstrings(String s, int k) {
        // Write your code here
        int maxCount = 0;
        int n = s.length();

        for (int i = 0; i < n - k + 1; i++) {
            for (int j = i + k; j <= n; j++) {
                String substring = s.substring(i, j);
                if (substring.length() >= k && isPalindrome(substring)) {
                    maxCount++;
                }
            }
        }

        return maxCount;

    }

    public static void main(String[] args) {
        String s = "aababaabce";
        int k = 3;
        int result = getMaxSubstrings(s, k);
        System.out.println(result);
    }

}
