package Tree;

public class FindMinBST {
    public static int findMin(Node root)
    {
        // Write - Your - Code
        Node temp = root;
        while(temp!=null && temp.getLeftChild()!=null){
            temp = temp.getLeftChild();
        }
        return temp.getData();
    }

    public static void main(String[] args) {
        BinarySearchTree bsT = new BinarySearchTree();

        bsT.add(6);
        bsT.add(4);
        bsT.add(9);

        System.out.println(findMin(bsT.getRoot()));
    }
}
