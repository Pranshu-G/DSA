package Tree1;

import java.util.Arrays;

public class BTreeFromInorderAndPreorder {

    static int preIndex = 0;
    public static Node buildTree(int[] preorder, int[] inorder) {

        return util(preorder,inorder,0,preorder.length-1,0, inorder.length-1);
    }

    public static Node util(int[] preorder, int[] inorder, int preStart,int preEnd, int inStart, int inEnd){
        if(preIndex>preorder.length-1 || inStart>inEnd || preStart>preEnd)
            return null;
        int rData = preorder[preIndex++];
        Node root = new Node(rData);
        int index = 0;
        for(int i=inStart;i<inEnd;i++){
            if(inorder[i]==rData) {
                index = i;
                break;
            }
        }
        root.left = util(preorder, inorder,preStart+1,preStart + index - inStart,inStart, index-1);
        root.right = util(preorder,inorder, preStart + index - inStart + 1, preEnd, index + 1, inEnd);
        return root;
    }

    public static void main(String[] args) {
        int[] preOrder = {-1};
        int[] inOrder = {-1};
        Node root = buildTree(preOrder,inOrder);
        inOrder(root);
    }

    static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}
