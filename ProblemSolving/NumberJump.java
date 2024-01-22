package ProblemSolving;

public class NumberJump {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        if (v1 < v2) {
            return "NO";
        }
        if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        }
        return "NO";
    }

}
