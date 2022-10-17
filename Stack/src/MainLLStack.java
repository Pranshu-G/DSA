public class MainLLStack {

    public static void main(String[] args) {
        LLStack newStack = new LLStack();
        System.out.println(newStack.isEmpty());
        newStack.push(10);
        newStack.push(20);
        newStack.push(40);
        int result = newStack.peek();
        System.out.println(result);

    }
}
