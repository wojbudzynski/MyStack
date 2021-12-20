import Stack.Stack;

import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) throws Exception {
        sample();
    }
    /**
     * Sample method to use the stack
     */
    public static void sample(){
        Stack<Integer> stack= new Stack<Integer>();
        System.out.println(stack.empty());
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(7);
        stack.push(-3);
        stack.push(1);
        stack.push(8);
        System.out.println(stack.peekMin());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peekMin());
    }
}
