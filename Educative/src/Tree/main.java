package Tree;

public class main {

    public static void main(String args[])
    {
        BinarySearchTree bsT = new BinarySearchTree();

        bsT.add(6);
        bsT.add(4);
        bsT.add(9);
        bsT.add(5);
        bsT.add(2);
        bsT.add(8);
        bsT.add(12);


        bsT.preOrder(bsT.getRoot());
        bsT.inOrder(bsT.getRoot());
        bsT.postOrder(bsT.getRoot());
    }
}
