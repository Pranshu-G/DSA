package Tree1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import javax.naming.InsufficientResourcesException;


public class View {
    static class Pair{

        int hd;
        Node node;
        Pair(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
    static void printLeftView(Node root){
        ArrayList<Node> list = new ArrayList<>();
        printLeftViewUtil(root,list,0);
        for(Node curr: list){
            System.out.print(curr.data+ " ");
        }
    }

    static void printLeftViewUtil(Node root, ArrayList<Node> list, int level){
        if(root==null){
            return;
        }
        if(list.size()==level){
            list.add(root);
        }
//        else{
//            if(list.get(level)==null){
//                list.add(root);
//            }
//        }
//        else{
//            list.set(level,root)
//        }
//        if(list.get(level)==null){
//            list.add(root);
//        }

        printLeftViewUtil(root.left,list,level+1);
        printLeftViewUtil(root.right,list,level+1);
    }

    static ArrayList<Integer> bottomView(Node root){
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer,Integer>map = new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr = q.poll();
            map.put(curr.hd, curr.node.data);
            if(curr.node.left!=null){
                q.add(new Pair(curr.hd-1, curr.node.left));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.hd+1,curr.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }

    static ArrayList<Integer> topView(Node root){
        Queue<Pair>q = new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr = q.poll();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node.data);
            }
            if(curr.node.left!=null){
                q.add(new Pair(curr.hd-1, curr.node.left));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.hd+1,curr.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
