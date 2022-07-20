package s4;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    public List<Object> stack;

    public Queue() {
        stack = new ArrayList<>();
    }

    public int size()
    {
        return stack.size();
    }

    public T pop()
    {
        if(!stack.isEmpty()) {
            T res = (T)stack.get(0);
            stack.remove(0);
            return res;
        }else {
            return null;
        }
    }

    public void push(T val) {
        stack.add(0, val);
    }

    public T peek()
    {
        if(!stack.isEmpty()) {
            return (T) stack.get(0);
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
