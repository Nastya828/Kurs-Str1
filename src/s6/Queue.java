package s6;

import java.util.*;

public class Queue<T> {
    public List<Object> queue;

    public Queue() {
        queue = new ArrayList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (!queue.isEmpty()) {
            T firstElement = (T) queue.get(0);
            queue.remove(0);
            return firstElement;
        }
        return null;
    }

    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + queue +
                '}' + " size = " + size();
    }
}
