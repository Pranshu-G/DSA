package Tree.src;

public class ArrayImplMain {
    public static void main(String[] args) {
        BinaryTreeArray bt = new BinaryTreeArray(9);
        bt.insert("N1");
        bt.insert("N2");
        bt.insert("N3");
        bt.insert("N4");
        bt.insert("N5");
        bt.insert("N6");
        bt.insert("N7");
        bt.insert("N8");
        bt.insert("N9");

        bt.deleteNode("N5");
        bt.levelOrder();
        bt.deleteBinaryTree();

    }


}
