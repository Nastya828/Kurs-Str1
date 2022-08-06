package s8;

import java.util.*;


class Node<T> {
    public T value;
    public Node<T> next, prev;

    public Node(T _value) {
        value = _value;
        next = null;
        prev = null;
    }
}

public class OrderedList<T> {
    public Node<T> head, tail;
    private boolean _ascending;

    public OrderedList(boolean asc) {
        head = null;
        tail = null;
        _ascending = asc;
    }

    public int compare(T v1, T v2) {
        if ((int) v1 < (int) v2) {
            return -1;
        }
        if ((int) v1 == (int) v2) {
            return 0;
        }
        return 1;

    }

    public void setOrderElements(Node<T> node, T value) {
        while (node != null) {
            Node<T> nodeNew = new Node<>(value);
            if (node.next == null && compare(node.value, value) == -1) {
                nodeNew.next = null;
                nodeNew.prev = node;
                node.next = nodeNew;
                this.tail = nodeNew;
                return;
            } else if (compare(node.value, value) == 1) {
                nodeNew.next = node;
                nodeNew.prev = null;
                this.head = nodeNew;
                nodeNew.next.prev = nodeNew;
                return;
            } else if (node.next != null && compare(node.value, value) != 1 && compare(node.next.value, value) == 1) {
                nodeNew.next = node.next;
                nodeNew.prev = node;
                node.next = nodeNew;
                nodeNew.next.prev = nodeNew;
                return;
            }
            node = node.next;
        }
    }

    public void setElements(Node<T> node, T value) {
        while (node != null) {
            Node<T> nodeNew = new Node<>(value);
            if (node.next == null && compare(value, node.value) == -1) {
                nodeNew.next = null;
                nodeNew.prev = node;
                node.next = nodeNew;
                this.tail = nodeNew;
                return;
            } else if (compare(value, node.value) == 1) {
                nodeNew.next = node;
                nodeNew.prev = null;
                this.head = nodeNew;
                nodeNew.next.prev = nodeNew;
                return;
            } else if (node.next != null && compare(value, node.value) != 1 && compare(value, node.next.value) == 1) {
                nodeNew.next = node.next;
                nodeNew.prev = node;
                node.next = nodeNew;
                nodeNew.next.prev = nodeNew;
                return;
            }
            node = node.next;
        }
    }

    public void add(T value) {
        Node<T> node = this.head;
        if (this._ascending) {
            setOrderElements(node, value);
        } else {
            setElements(node, value);
        }

        if (node == null) {
            addInTail(new Node<>(value));
        }

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


    public Node<T> find(T val) {
        Node<T> node = this.head;
        while (node != null) {
            if ((this._ascending && compare(node.value, val) == 1) || (!this._ascending && compare(val, node.value) == 1)) {
                return null;
            }
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void delete(T val) {
        Node<T> node = this.head;
        if (node == null) {
            return;
        }
        if (node.value == val && node.next == null) {
            this.head = null;
            this.tail = null;
            return;
        } else if (node.value == val) {
            this.head = node.next;
            node.next.prev = null;
            return;
        }

        while (node != null) {
            if (node.value == val && node.next == null) {
                node.prev.next = null;
                this.tail = node.prev;
                return;
            } else if (node.value == val) {
                Node<T> node1 = node;
                node.prev.next = node1.next;
                node1.next.prev = node1.prev;
                return;
            }
            node = node.next;
        }
    }

    public void clear(boolean asc) {
        _ascending = asc;
        Node<T> node = this.head;
        while (node != null) {
            Node<T> n1 = node.next;
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

    ArrayList<Node<T>> getAll() {
        ArrayList<Node<T>> r = new ArrayList<>();
        Node<T> node = head;
        while (node != null) {
            r.add(node);
            node = node.next;
        }
        return r;
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
