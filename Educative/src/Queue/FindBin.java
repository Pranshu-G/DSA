package Queue;
import javax.print.attribute.standard.QueuedJobCount;
import java.util.*;
public class FindBin {

    public static String[] findBin(int n) {
        String[] result = new String[n];
        Queue<String> queue = new Queue<String>(n+1);

        queue.enqueue("1");
        for(int i=0;i<n;i++){
            result[i] = queue.dequeue();
            String s1 = result[i] + "0";
            String s2 = result[i] + "1";
            queue.enqueue(s1);
            queue.enqueue(s2);
        }

        return result;
    }

    public static void main(String args[]) {

        String[] output = findBin(1);
        for(int i = 0; i < 1; i++)
            System.out.print(output[i] + " ");
    }
}
