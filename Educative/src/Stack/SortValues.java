package Stack;

public class SortValues {

    public static void sortStack(Stack<Integer> stack) {
        // Write -- Your -- Code
        Stack<Integer> newStack = new Stack<Integer>(stack.getCapacity());
        while(!stack.isEmpty()){
            Integer value = stack.pop();
            if(!newStack.isEmpty() && value>=newStack.top()){
                newStack.push(value);
            }
            else{
                while(!newStack.isEmpty() && newStack.top()>value){
                    stack.push(newStack.pop());
                }
                newStack.push(value);
            }
        }
        while(!newStack.isEmpty()){
            stack.push(newStack.pop());
        }
    }

    public static void insert(Stack<Integer>stack, int value){
        if(stack.isEmpty() || value<stack.pop()){
            stack.push(value);
        }
        else{
            int temp = stack.top();
            insert(stack,value);
            stack.push(temp);
        }
    }
    public static Stack<Integer> sortStackRecursion(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int val = stack.pop();
            sortStackRecursion(stack);
            insert(stack,val);
        }
        return stack;
    }
}
