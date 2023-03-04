package Tree;

public class CheckHeight {

    public static int findHeight(Node root) {

        int rightHeight =0;
        int leftHeight =0;

        Node left =root;
        Node right = root;
        while(left.getRightChild()!=null || left.getLeftChild()!=null){

            if(left.getLeftChild()!=null){
                left = left.getLeftChild();
                leftHeight++;
            }
            else{
                left=left.getRightChild();
                leftHeight++;
            }

        }

        while( right.getLeftChild()!=null || right.getRightChild()!=null){

            if(right.getRightChild()!=null){
                right=right.getRightChild();
                rightHeight++;
            }
            else{
                right=right.getLeftChild();
                rightHeight++;
            }


    }
        // Write - Your - Code
        return Math.max(rightHeight,leftHeight);
    }

    public static void main(String[] args) {
        BinarySearchTree bsT = new BinarySearchTree();

        bsT.add(6);
        bsT.add(4);
        bsT.add(9);
//        bsT.add(5);
//        bsT.add(2);
//        bsT.add(8);
//        bsT.add(12);

        System.out.println(findHeight(bsT.getRoot()));
    }
}
