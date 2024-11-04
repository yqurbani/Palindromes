import java.util.Stack;

public class CustomStack {
    private Stack<Character> stack = new Stack<Character>();
    
    public void push(Character c) {
        stack.push(c);
    }

    public Character pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}