package Graph;

import java.util.*;
import java.util.Stack;

public class CompilationOrder {


    public static List<Character> findCompilationOrder(ArrayList<ArrayList<Character>> dependencies){
        // Write your code here
    HashMap<Character,ArrayList<Character>> graph = new HashMap<>();
    HashMap<Character,Boolean> vis = new HashMap<>();
    HashMap<Character,Boolean> recS = new HashMap<>();
    List<Character> ans = new ArrayList<>();
    Stack<Character> st = new Stack<>();
    for(int i=0;i<dependencies.size();i++){
        char child = dependencies.get(i).get(0);
        char parent = dependencies.get(i).get(1);
        graph.put(child, new ArrayList<>());
        graph.put(parent, new ArrayList<>());
        vis.put(child,false);
        vis.put(parent,false);
        recS.put(child,false);
        recS.put(parent,false);
    }

    for(int j=0;j<dependencies.size();j++){
        char child = dependencies.get(j).get(0);
        char parent = dependencies.get(j).get(1);
        graph.get(parent).add(child);
    }

    Set<Character> key = graph.keySet();
    for(char c: key){
        if(vis.get(c)!=true){
            if(dfs(graph,st,c,vis,recS)){
                return new ArrayList<>();
            }
        }
    }

    while(!st.isEmpty()){

        ans.add(st.pop());
    }

    return ans;
    }

    static boolean dfs(HashMap<Character,ArrayList<Character>> graph, Stack<Character> st, Character c,HashMap<Character,Boolean> vis, HashMap<Character,Boolean> recS){
        vis.put(c,true);
        recS.put(c,true);
       List<Character> neighbour = graph.get(c);
       for(char t: neighbour){
           if(vis.get(t)!=true){
                if(dfs(graph,st,t,vis,recS)){
                    return true;
                }
           }
           else if(recS.get(t)){
               return true;
           }
       }
       st.push(c);
       recS.put(c,false);
       return false;
    }

    public static void main(String[] args) {
        List<List<List<Character>>> inputs = Arrays.asList(
            Arrays.asList(Arrays.asList('B', 'A'), Arrays.asList('A', 'B')));
        ArrayList<ArrayList<ArrayList<Character>>> dependencies = new ArrayList<ArrayList<ArrayList<Character>>>();
        for(int j = 0; j < inputs.size(); j++)
        {
            dependencies.add(new ArrayList<ArrayList<Character>>());
            for(int k = 0; k < inputs.get(j).size(); k++)
            {
                dependencies.get(j).add(new ArrayList<Character>());
                for(int g = 0; g < inputs.get(j).get(k).size(); g++)
                {
                    dependencies.get(j).get(k).add(inputs.get(j).get(k).get(g));
                }
            }
        }
      List<Character> ans = findCompilationOrder(dependencies.get(0));
    for(Character c: ans){
        System.out.println(c);
    }
    }
}
