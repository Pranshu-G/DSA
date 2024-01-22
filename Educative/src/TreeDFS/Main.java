package TreeDFS;

class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Main {

    static TreeNode<Integer> prev=null, head=null;
    public static TreeNode<Integer> flattenTree(TreeNode<Integer> root) {
        if(root==null){
            return null;
        }
        if(prev==null){
            head = root;
        }
        else{
            prev.right=root;
            prev.left=null;
        }
        prev=root;
        TreeNode<Integer> right = root.right;
        flattenTree(root.left);
        flattenTree(right);

        // Replace this placeholder return statement with your code
        return head;
    }
}