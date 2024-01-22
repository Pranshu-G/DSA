package Tree1;

public class validateBST {


    static int prev = Integer.MIN_VALUE;
    public static boolean validateBST(Node root){
        if(root==null){
            return true;
        }

        if(!validateBST(root.left)){
            return false;
        }

        if(prev>=root.data){
            return false;
        }
        prev = root.data;
        return validateBST(root.right);

    }


}
