package s2;

import java.util.*;

public class LinkedList2 {
    public Node head;
    public Node tail;

    public LinkedList2() {
        head = null;
        tail = null;
    }

    public void addInTail(Node _item) {
        if (head == null) {
            this.head = _item;
            this.head.next = null;
            this.head.prev = null;
        } else {
            this.tail.next = _item;
            _item.prev = tail;
        }
        this.tail = _item;
    }

    public Node find(int _value) {
        Node node = this.head;
        while (node != null) {
            if (node.value == _value) {
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
            node.next.prev = null;
            return true;
        }

        while (node != null) {
            if (node.value == _value && node.next == null) {
                node.prev.next = null;
                this.tail = node.prev;
                return true;
            } else if (node.value == _value) {
                Node node1 = node;
                node.prev.next = node1.next;
                node1.next.prev = node1.prev;
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
                insert.prev = node;
                node.next = insert;
                this.tail = insert;
            } else if (node.value == _nodeAfter.value) {
                insert.next = node.next;
                insert.prev = node;
                node.next = insert;
            }
            node = node.next;
        }

        if (_nodeAfter == null && this.tail != null && node != null) {
            Node insert = new Node(_nodeToInsert.value);
            insert.next = node;
            insert.prev = null;
            this.head = insert;
            insert.next.prev = _nodeToInsert;
        } else if (_nodeAfter == null && node == null) {
            addInTail(_nodeToInsert);
        }
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

