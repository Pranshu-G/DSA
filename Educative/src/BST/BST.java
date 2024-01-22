package BST;

import java.util.HashSet;
import java.util.Set;

class Node{
    Node left;
    Node right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class BST {

    static boolean search(Node root, int x){
        if(root==null){
            return false;
        }
        if(root.data == x){
            return true;
        }
        if(root.data>x){
            return search(root.left,x);
        }
        return search(root.right,x);
    }

    static Node insertRecursive(Node root, int key){
        if(root==null){
            return new Node(key);
        }
        if(key>root.data){
            root.right=insertRecursive(root.right,key);
        }
        else if(key<root.data){
            root.left=insertRecursive(root.left,key);
        }
        return root;
    }

    static Node insertIterative(Node root, int key){
        Node curr = root;
        Node parent = null;
        Node newNode = new Node(key);
        while(curr!=null){
            parent = curr;
            if(key< curr.data)
                curr=curr.left;
            else
                curr=curr.right;
        }
        if(parent==null)
            return newNode;
        else if(key< parent.data)
            parent.left = newNode;
        else
            parent.right=newNode;
        return root;
    }

    static Node deleteNode(Node root, int key){
        if(root==null){
            return root;
        }
        if(key<root.data){
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.data){
            root.right = deleteNode(root.right,key);
        }
        else{
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            root.data = minVal(root.right);
            root.right=deleteNode(root.right,root.data);
        }
        return root;
    }
    static int minVal(Node root){
        int minV = root.data;
        while(root.left!=null){
            minV = root.left.data;
            root = root.left;
        }
        return minV;
    }

    static boolean isBST(Node node){
        return isBSTUtil(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean isBSTUtil(Node node, int min, int max){
        if(node==null){
            return true;
        }

        if(node.data<min || node.data>max){
            return false;
        }
        return (isBSTUtil(node.left,min,node.data-1) && isBSTUtil(node.right,node.data+1,max));
    }

   static Node prev = null;
    static boolean isBSTInorder(Node node){
        if(node!=null){
            if(!isBSTInorder(node.left)){
                return false;
            }

            if(prev!=null && node.data<=prev.data){
                return false;
            }
            prev = node;
            return isBSTInorder(node.right);
        }
        return true;
    }

    static int floor(Node root, int key){
        int ans = Integer.MAX_VALUE;
        while(root!=null){
            if(root.data == key){
                return root.data;
            }
            if(root.data>key){
                root = root.left;
            }
            else{
                ans =root.data;
                root = root.right;
            }
        }
        return ans;
    }

    static int ceil(Node root, int key){
        int ans = Integer.MIN_VALUE;
        while(root!=null){
            if(root.data==key){
                return root.data;
            }
            if(root.data>key){
                ans = root.data;
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return ans;
    }

    static int isPairPresent(Node root, int sum){
        Set<Integer> set = new HashSet<>();
        boolean ans = isPairPresentUtil(root,sum,set);
        return ans?1:0;
    }

    static boolean isPairPresentUtil(Node root, int sum, Set<Integer> set){
        if(root==null)
            return false;
        if(isPairPresentUtil(root.left,sum,set)==true){
            return true;
        }
        if(set.contains(sum-root.data))
            return true;
        set.add(root.data);
        return isPairPresentUtil(root.right,sum,set);
    }

}
