package s4;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    public List<Object> stack;
    public Stack() {
        stack = new ArrayList<>();

    }

    public int size() {
        return stack.size();
    }

    public T pop() {
        if(!stack.isEmpty()) {
            T res = (T)stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return res;
        }else {
            return null;
        }
    }

    public void push(T val) {
        stack.add(val);
    }

    public T peek() {
        if(!stack.isEmpty()) {
            return (T) stack.get(stack.size() - 1);
        }else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + stack +
                '}';
    }
}
