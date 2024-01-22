package TreeBFS;


import java.util.LinkedList;
import java.util.Queue;

class Node{
    Node left;
    Node right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class levelOrderTraversal {

    public static String levelOrderTraversal(Node root) {
        StringBuilder sb = new StringBuilder();
        Queue<Node> currQueue= new LinkedList<>(),nextQueue = new LinkedList<>();
        int level = 0;
        currQueue.add(root);
        while (!currQueue.isEmpty()){
            Node curr = currQueue.poll();
            sb.append(root.data);
            if(curr.left!=null){
                nextQueue.add(curr.left);
            }
            if(curr.right!=null){
                nextQueue.add(curr.right);
            }

            if(currQueue.isEmpty()){
                sb.append(":");
                Queue<Node> temp = currQueue;
                currQueue = nextQueue;
                nextQueue = temp;
                level++;
            }
        }
        // Replace this placeholder return statement with your code
        return sb.toString();
    }

}
