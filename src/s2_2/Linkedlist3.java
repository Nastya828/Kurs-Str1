package s2_2;

import java.util.*;

public class Linkedlist3 {
    public final Node head = new Node(0);
    public final Node tail = new Node(-1);

    Linkedlist3() {
        head.next = tail;
        head.prev = null;
        tail.next = null;
        tail.prev = head;
    }

    public void addInTail(Node _item) {
        this.tail.prev.next = _item;
        _item.prev = this.tail.prev;
        this.tail.prev = _item;
        _item.next = this.tail;
    }

    public Node find(int _value) {
        Node node = this.head.next;
        while (node != this.tail) {
            if (node.value == _value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public ArrayList<Node> findAll(int _value) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        Node node = this.head.next;
        while (node != this.tail) {
            if (node.value == _value) {
                nodes.add(node);
            }
            node = node.next;
        }
        return nodes;
    }

    public boolean remove(int _value) {
        Node node = this.head.next;
        while (node != this.tail) {
            if (node.value == _value) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void removeAll(int _value) {
        Node node = this.head.next;
        while (node != this.tail) {
            remove(_value);
            node = node.next;
        }
    }

    public void clear() {
        Node node = this.head.next;
        while (node != this.tail) {
            Node n1 = node.next;
            node.next = null;
            node = n1;
        }
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int count() {
        Node node = this.head.next;
        if (node == this.tail) {
            return 0;
        }
        int counter = 0;
        while (node != this.tail) {
            counter++;
            node = node.next;
        }
        return counter;
    }

    public void insertAfter(Node _nodeAfter, Node _nodeToInsert) {
        Node node = this.head.next;
        while (node != this.tail && _nodeAfter != null) {
            Node insert = new Node(_nodeToInsert.value);
            if (node.value == _nodeAfter.value) {
                node.next.prev = insert;
                insert.next = node.next;
                node.next = insert;
                insert.prev = node;
            }
            node = node.next;
        }
        if (_nodeAfter == null) {
            _nodeToInsert.next = node;
            _nodeToInsert.prev = this.head;
            node.prev = _nodeToInsert;
            this.head.next = _nodeToInsert;
        }
    }

    @Override
    public String toString() {
        Node curr = this.head;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LinkedList [");
        while (curr != null) {
            stringBuilder.append(curr.value);
            if (curr.next != null) {
                stringBuilder.append(", ");
            }
            curr = curr.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

class Node {
    public int value;
    public Node next;
    public Node prev;

    public Node(int _value) {
        value = _value;
        next = null;
        prev = null;
    }
}

