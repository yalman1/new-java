package Queue_Stack;

import java.util.Stack;

public class StackFirst {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(15);
        stack.push(6);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
