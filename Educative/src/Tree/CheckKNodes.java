package Tree;

public class CheckKNodes {
//    public static String findKNodes(Node root, int k) {
//        StringBuilder sb = new StringBuilder();
//        Node left = root, right = root;
//        int i=0,j=0;
//        while(i!=k-1 && left!=null && left.getLeftChild()!=null){
//            left = left.getLeftChild();
//            i++;
//        }
//        while(j!=k-1 && right!=null && right.getRightChild()!=null){
//            right=right.getRightChild();
//            j++;
//        }
//        if(right==root){
//            right=null;
//        }
//        if(left==root){
//            left=null;
//        }
//
//        if(left!=null && left.getLeftChild()!=null){
//            sb.append(left.getLeftChild().getData() + ",");
//        }
//        if(left!=null && left.getRightChild()!=null){
//            sb.append(left.getRightChild().getData()+ ",");
//        }
//        if(right!=null && right.getLeftChild()!=null){
//            sb.append(right.getLeftChild().getData()+ ",");
//        }
//        if(right!=null && right.getRightChild()!=null){
//            sb.append(right.getRightChild().getData()+ ",");
//        }


        //Write Your Code Here
//        return sb.toString();
//    }
        public static String findKNodes(Node root, int k) {

            StringBuilder result = new StringBuilder(); //StringBuilder is immutable
            result = findK(root, k, result);

            return result.toString();
        }

    //Helper recursive function to traverse tree and append all the nodes
    // at k distance into result StringBuilder
    public static StringBuilder findK(Node root, int k, StringBuilder result) {

        if (root == null) return null;

        if (k == 0) {
            result.append(root.getData() + ",");
        }
        else {
            //Decrement k at each step till you reach at the leaf node
            // or when k == 0 then append the Node's data into result string
            findK(root.getLeftChild(), k - 1, result);
            findK(root.getRightChild(), k - 1, result);
        }
        return result;
    }

    public static void main(String[] args) {
        BinarySearchTree bsT = new BinarySearchTree();

        bsT.add(14);
        bsT.add(4);
        bsT.add(-1);
        bsT.add(-2);
        bsT.add(-3);
        bsT.add(5);
//        bsT.add(12);
//        bsT.printTree(bsT.getRoot());
        String ans = findKNodes(bsT.getRoot(),2);
         System.out.println(ans);
    }
}
