package Blind75;


//  Definition for a binary tree node.
 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        // Check current node values
        if (p.val == q.val) {
            // Recursively check left and right subtrees
            boolean leftSubtree = isSameTree(p.left, q.left);
            boolean rightSubtree = isSameTree(p.right, q.right);

            // Return true only if both left and right subtrees are the same
            return leftSubtree && rightSubtree;
        }

        // Node values are not equal
        return false;
    }
}