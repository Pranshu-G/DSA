package Tree;

public class BinarySearchTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node recursive_insert(Node currentNode, int value){

        if(currentNode==null){
            return new Node(value);
        }
        if(value< currentNode.getData()){
            currentNode.setLeftChild(recursive_insert(currentNode.getLeftChild(),value));
        }
        else if(value>currentNode.getData()){
            currentNode.setRightChild(recursive_insert(currentNode.getRightChild(),value));
        }
        else{
            return currentNode;
        }
        return currentNode;
    }
    public boolean add(int value){

        if(isEmpty()){
            root = new Node(value);
            return true;
        }

        Node currentNode = root;

        while(currentNode!=null){
            Node leftChild = currentNode.getLeftChild();
            Node rightChild = currentNode.getRightChild();

            if(currentNode.getData()>value){
                if(leftChild==null){
                    leftChild = new Node(value);
                    currentNode.setLeftChild(leftChild);
                    return true;
                }
                currentNode = leftChild;
            }
            else{
                if(rightChild==null){
                    rightChild = new Node(value);
                    currentNode.setRightChild(rightChild);
                    return true;
                }
                currentNode = rightChild;
            }
        }
        return false;
    }

    public Node search(int value){
        if(isEmpty()){
            return null;
        }
        Node currNode = root;
        while(currNode!=null){
            if(value< currNode.getData()){
                currNode= currNode.getLeftChild();
            }
            else if(value>currNode.getData()){
                currNode = currNode.getRightChild();
            }
            else if(value==currNode.getData()){
                return currNode;
            }
        }
        System.out.println("The tree does not contain the given value");
        return null;
    }

    public Node searchRecursive(Node currentNode, int value){
        if(isEmpty()){
            return null;
        }

        if(value<currentNode.getData()){
            return searchRecursive(currentNode.getLeftChild(),value);
        }
        else if(value>currentNode.getData()){
            return searchRecursive(currentNode.getRightChild(),value);
        }
        else if(value==currentNode.getData()){
            return currentNode;
        }
        System.out.println("The Tree does not contain this value");
        return null;
    }

    public boolean isEmpty()
    {
        return root == null; //if root is null then it means Tree is empty
    }

    boolean delete(int value, Node currentNode) {
        if(root==null){
            return false;
        }
        Node parent = null; //To store parent of current node
        while(currentNode!=null && currentNode.getData()!=value){
            parent = currentNode;
            if(currentNode.getData()>value){
                currentNode = currentNode.getLeftChild();
            }
            else{
                currentNode = currentNode.getRightChild();
            }
        }
        if(currentNode==null){
            return false;
        }
        else if(currentNode.getLeftChild()==null && currentNode.getRightChild()==null){
            if(root.getData()== currentNode.getData()){
                setRoot(null);
                return true;
            }
            else if(parent.getData()< currentNode.getData()){
                parent.setRightChild(null);
                return true;
            }
            else{
                parent.setLeftChild(null);
                return true;
            }
        }else if(currentNode.getRightChild()==null){
            if(root.getData()==currentNode.getData()){
                setRoot(currentNode.getLeftChild());
                return true;
            }
            else if(parent.getData()<currentNode.getData()){
               parent.setRightChild(currentNode.getLeftChild());
               return true;
            }
            else{
                parent.setLeftChild(currentNode.getLeftChild());
                return true;
            }
        }
        else if(currentNode.getLeftChild()==null){
            if(root.getData()==currentNode.getData()){
                setRoot(currentNode.getRightChild());
                return true;
            }
            else if(currentNode.getData()< parent.getData()){
                parent.setLeftChild(currentNode.getRightChild());
                return true;
            }
            else{
                parent.setRightChild(currentNode.getRightChild());
            }
        }
        else{
            Node leastNode = findLeastNode(currentNode.getRightChild());
            int temp = leastNode.getData();
            delete(temp,root);
            currentNode.setData(temp);
            return true;
        }
        return false;
    }

    private Node findLeastNode(Node currentNode){
        Node temp = currentNode;
        while(temp.getLeftChild()!=null){
            temp = temp.getLeftChild();
        }
        return temp;
    }
    //Just for Testing purpose
    public void printTree(Node current)
    {
        if (current == null) return;

        System.out.print(current.getData() + ",");
        printTree(current.getLeftChild());
        printTree(current.getRightChild());

    }

}
