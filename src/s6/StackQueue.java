package s6;

import s4.Stack;

public class StackQueue<T> {
    Stack<T> firstStack;
    Stack<T> secondStack;

    public StackQueue() {
        this.firstStack = new Stack<>();
        this.secondStack = new Stack<>();
    }

    public void enqueue(T item) {
        firstStack.push(item);
    }


    public T dequeue() {
        copy();
        return secondStack.pop();
    }

    public void copy() {
        if (secondStack.size() > 0) {
            return;
        }
        while (firstStack.size() > 0) {
            secondStack.push(firstStack.pop());
        }
    }

    public int size() {
        if (firstStack.size() > 0) {
            return firstStack.size();
        }
        return Math.max(secondStack.size(), 0);
    }

    @Override
    public String toString() {

        return "first = " + firstStack.toString() + "; second = " + secondStack.toString() +
                " size = " + size();

    }

}


