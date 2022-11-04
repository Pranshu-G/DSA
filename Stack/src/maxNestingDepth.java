import java.util.Stack;
public class maxNestingDepth {

    public static int maxDepth(String s) {
            if(!s.contains("(")){
                return 0;
            }
            int depth = 0;
            int count = 0;
            String arr[] = s.split("");
            Stack<String> st= new Stack<>();

            for(int i =0;i<arr.length;i++){
                st.push(arr[i]);
            }

            while(!st.isEmpty()){
                String popped = st.pop();
               if(popped.equals(")")){
                   count++;
                   depth = Math.max(depth,count);
               }
               if(popped.equals("(")){
                   count--;

               }

            }

            return depth;
    }


    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println(maxDepth(s));
    }
}
