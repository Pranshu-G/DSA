package Tree1;

import java.util.Arrays;

public class ArrayToBST {
    public static Node sortedArrayToBST(int[] nums) {
        int low =0;
        int high=0;
        if(nums.length>0){
             high = nums.length-1;
        }else{
             return null;
        }

        int middle = low + (high-low)/2;
        Node root = new Node(nums[middle]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,middle));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums,middle+1,high+1));
        return root;
    }

    public static void main(String[] args) {
        int[] nums = {5,6,7,8};
        Node root = sortedArrayToBST(nums);
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
