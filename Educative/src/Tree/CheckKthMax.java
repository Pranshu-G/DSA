package Tree;

import java.util.ArrayList;

public class CheckKthMax {

//    public static int findKthMax(Node root, int k) {
//
//        // Write - Your - Code
//
//        ArrayList<Integer> result = inOrderArr(root,new ArrayList<>());
//        int n = result.size()-1;
//        int res =0;
//        while(k>0){
//            res = result.get(n);
//            n--;
//            k--;
//        }
//        return res;
//    }
//
//    public static ArrayList<Integer> inOrderArr(Node root, ArrayList<Integer> inOrder){
//
//        if(root==null){
//            return null;
//        }
//
//        inOrderArr(root.getLeftChild(),inOrder);
//        inOrder.add(root.getData());
//        inOrderArr(root.getRightChild(),inOrder);
//        return inOrder;
//    }
static int  counter; //global count variable
    //used as a wrapper for the recursive algorithm
    public static int findKthMax(Node root, int k) {
        counter = 0;
        Node node = findKthMaxRecursive(root, k);
        if(node != null)
            return node.getData();
        return -1;
    }

    public static Node findKthMaxRecursive(Node root, int k) {
        if(root==null){
            return null;
        }
        //Recursively reach the right-most node (which has the highest value)
        Node node = findKthMaxRecursive(root.getRightChild(), k);

        if(counter != k){
            //Increment counter if kth element is not found
            counter++;
            node = root;
        }
        //Base condition reached as kth largest is found
        if(counter == k){
            return node;
        }else{
            //Traverse left child if kth element is not reached
            return findKthMaxRecursive(root.getLeftChild(), k);
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bsT = new BinarySearchTree();

        bsT.add(6);
        bsT.add(4);
        bsT.add(9);

        ArrayList<Integer> temp = new ArrayList<>();
//        ArrayList<Integer> result = inOrderArr(bsT.getRoot(),temp);
//        for(int i: result){
//            System.out.println(i);
//        }
        System.out.println(findKthMax(bsT.getRoot(),3));
    }
}
