package s7;

import java.util.*;

public class Deque<T> {
    List<Object> deque;

    public Deque() {
        this.deque = new ArrayList<>();
    }

    public void addFront(T item) {
        deque.add(0, item);

    }

    public void addTail(T item) {
        deque.add(item);
    }

    public T removeFront() {
        T x = null;
        if (!deque.isEmpty()) {
            x = (T) deque.get(0);
            deque.remove(0);
        }
        return x;
    }

    public T removeTail() {
        T x = null;
        if (!deque.isEmpty()) {
            x = (T) deque.get(deque.size() - 1);
            deque.remove(deque.size() - 1);
        }
        return x;
    }

    public int size() {
        return deque.size();
    }

    @Override
    public String toString() {
        return "Deque{" +
                "deque=" + deque +
                '}' + " size = " + size();
    }
}
