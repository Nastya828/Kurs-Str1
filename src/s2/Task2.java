package s2;


import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.addInTail(new Node(1));
        list.addInTail(new Node(2));
        System.out.println(list.find(1).value);
        System.out.println(list.find(1).next.value);



    }

    public static void print(LinkedList2 list) {
        if (list.head != null && list.tail != null) {
            System.out.println(list + " head = " + list.head.value + " tail = " + list.tail.value + " count = " + list.count());
        } else if (list.head == null && list.tail != null) {
            System.out.println(list + " head = " + list.head + " tail = " + list.tail.value + " count = " + list.count());
        } else if (list.head != null && list.tail == null) {
            System.out.println(list + " head = " + list.head.value + " tail = " + list.tail + " count = " + list.count());
        } else {
            System.out.println(list + " head = " + list.head + " tail = " + list.tail + " count = " + list.count());
        }
        Node n = list.head;
        while (n != null) {
            if (n.prev != null && n.next != null) {
                System.out.println(" prev = " + list.find(n.value).prev.value + " node = " + list.find(n.value).value
                        + " next = " + list.find(n.value).next.value);
            } else if (n.prev == null && n.next != null) {
                System.out.println(" prev = " + list.find(n.value).prev + " node = " + list.find(n.value).value
                        + " next = " + list.find(n.value).next.value);
            } else if (n.prev != null && n.next == null) {
                System.out.println(" prev = " + list.find(n.value).prev.value + " node = " + list.find(n.value).value
                        + " next = " + list.find(n.value).next);
            } else {
                System.out.println(" prev = " + list.find(n.value).prev + " node = " + list.find(n.value).value
                        + " next = " + list.find(n.value).next);
            }
            n = n.next;
        }

    }
}
