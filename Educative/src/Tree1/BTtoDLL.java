package Tree1;

public class BTtoDLL {

    static Node prev=null,head=null;
    static void convertToDLL(Node root){
        if(root==null)
            return;
        convertToDLL(root.left);
        if(prev==null)
            head=root;
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        convertToDLL(root.right);
    }
}
