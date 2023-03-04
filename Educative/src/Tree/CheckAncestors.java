package Tree;

public class CheckAncestors {

    public static String findAncestors(Node root, int k) {
        Node temp = root;
        StringBuilder sb = new StringBuilder();

        while(temp.getData()!=k){
            if(k> temp.getData()){
                sb.append(temp.getData() + ",");
                temp = temp.getRightChild();
            }
            else{
                sb.append(temp.getData() + ",");
                temp = temp.getLeftChild();
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        BinarySearchTree bsT = new BinarySearchTree();

        bsT.add(6);
        bsT.add(4);
        bsT.add(9);
        bsT.add(5);
        bsT.add(2);
        bsT.add(8);
        bsT.add(12);

        System.out.println(findAncestors(bsT.getRoot(),12));
    }
}
