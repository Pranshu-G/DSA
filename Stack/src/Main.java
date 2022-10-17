public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(6);
        stack.push(3);
        int result = stack.peek();
        int result3 = stack.peek();
        System.out.println(result);
        System.out.println(result3);
        stack.deleteStack();
        
    }
}