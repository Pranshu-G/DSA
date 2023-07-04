package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Queue;

public class AlienDictionary {
    public static String alienOrder(List<String> words) {

            HashSet<Character> set = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();
        int index =0;
            for(String s: words){
                for(int i=0;i<s.length();i++){
                    if(!set.contains(s.charAt(i))){
                        set.add(s.charAt(i));
                    }
                }
            }

            int size = set.size();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(char c: set){
                adj.add(new ArrayList<>());
                map.put(c,index++);
            }

            for(int i=0;i<words.size()-1;i++){
                String s1 = words.get(i);
                String s2 = words.get(i+1);
                int len = Math.min(s1.length(),s2.length());
                for(int ptr=0;ptr<len;ptr++){
                    if(s1.charAt(ptr)!=s2.charAt(ptr)){
                        int index1 = map.get(s1.charAt(ptr));
                        int index2 = map.get(s2.charAt(ptr));
                        adj.get(index1).add(index2);
                        break;
                    }
                }
            }
            ArrayList<Integer> ans = topSortBFS(adj);
            String s ="";


            for(int i: ans){
                for(Map.Entry<Character,Integer> k: map.entrySet()){
                    if(Objects.equals(i,k.getValue())){
                        s+=k.getKey();
                        break;
                    }
                }
            }
        // Write your code here

        return s;
    }

    static ArrayList<Integer> topSortBFS(ArrayList<ArrayList<Integer>> adj){
        int[] inDeg = new int[adj.size()];
        int v = adj.size();
        for(ArrayList<Integer> list:adj){
            for(int e:list){
                inDeg[e]++;
            }
        }

        boolean[] vis = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>();
        bfs(adj,v,0,vis,ans,inDeg);
        return ans;

    }


    static void bfs(ArrayList<ArrayList<Integer>> adj, int V , int i, boolean[] vis,ArrayList<Integer> ans, int[] inDeg){
        Queue<Integer> q = new LinkedList<>();
        for(int j=0;j<V;j++){
            if(inDeg[j]==0){
                q.add(j);
            }
        }

        while (!q.isEmpty()){
            int curr=q.poll();
            ans.add(curr);
            for(int neighbour: adj.get(curr)){
                if(--inDeg[neighbour]==0){
                    q.add(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("o", "l", "m", "s"));
//        System.out.println('s'-'a');
    System.out.println(alienOrder(l));
    }
}
