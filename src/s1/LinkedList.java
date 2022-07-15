package s1;

import java.util.*;

public class LinkedList {
    public Node head;
    public Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addInTail(Node item) {
        if (this.head == null)
            this.head = item;
        else
            this.tail.next = item;
        this.tail = item;
    }

    public Node find(int value) {
        Node node = this.head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public ArrayList<Node> findAll(int _value) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        Node node = this.head;
        while (node != null) {
            if (node.value == _value) {
                nodes.add(node);
            }
            node = node.next;
        }
        return nodes;
    }

    public boolean remove(int _value) {
        Node node = this.head;
        if (node == null) {
            return false;
        }
        if (node.value == _value && node.next == null) {
            this.head = null;
            this.tail = null;
            return true;
        } else if (node.value == _value) {
            this.head = node.next;
            return true;
        }
        while (node.next != null) {
            if (node.next.value == _value && node.next.next == null) {
                node.next = null;
                this.tail = node;
                return true;
            } else if (node.next.value == _value) {
                Node node1 = node.next;
                node.next = node1.next;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void removeAll(int _value) {
        Node node = this.head;

        while (node != null) {
            remove(_value);
            node = node.next;
        }
    }

    public void clear() {
        Node node = this.head;
        while (node != null) {
            Node n1 = node.next;
            node.next = null;
            node = n1;
        }
        this.head = null;
        this.tail = null;
    }

    public int count() {
        Node node = this.head;
        if (node == null) {
            return 0;
        }
        int counter = 0;
        while (node != null) {
            counter++;
            node = node.next;
        }
        return counter;
    }

    public void insertAfter(Node _nodeAfter, Node _nodeToInsert) {
        Node node = this.head;

        while (node != null && _nodeAfter != null) {
            Node insert = new Node(_nodeToInsert.value);
            if (node.next == null && node.value == _nodeAfter.value) {
                insert.next = null;
                node.next = insert;
                this.tail = insert;
            } else if (node.value == _nodeAfter.value) {
                insert.next = node.next;
                node.next = insert;
            }

            node = node.next;
        }

        if (_nodeAfter == null) {
            _nodeToInsert.next = this.head;
            this.head = _nodeToInsert;
        }

    }

}

class Node {
    public int value;
    public Node next;

    public Node(int _value) {
        value = _value;
        next = null;
    }
}
