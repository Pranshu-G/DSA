package Tree1;

public class Diameter {

    static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int dl = diameter(root.left);
        int dr = diameter(root.right);
        int curr = height(root.left) + height(root.right) + 1;
        return Math.max(curr,Math.max(dl,dr));
    }

    static int height(Node root){
        if(root==null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }

    static int ans = 0;
    static int heightN(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        ans = Math.max(ans,1+lh+rh);
        return 1+Math.max(lh,rh);
    }
}
