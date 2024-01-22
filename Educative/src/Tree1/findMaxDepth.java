package Tree1;

public class findMaxDepth {

    public static int findMaxDepth(Node root) {
        if(root==null){
            return 0;
        }
        int rh = 1 + findMaxDepth(root.right);
        int lh = 1 + findMaxDepth(root.left);
        // Replace this placeholder return statement with your code
        return Math.max(lh,rh);
    }

}
