package s8;


import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {


        OrderedList<Integer> orderedList = new OrderedList<>(true);
        ArrayList<Node<Integer>> arrayList = orderedList.getAll();
        System.out.println(orderedList);
        for (Node<Integer> n : arrayList) {
            if (n.prev != null && n.next != null) {
                System.out.println("prev = " + n.prev.value + " node = " + n.value + " next = " + n.next.value);
            } else if (n.prev == null && n.next != null) {
                System.out.println("prev = " + n.prev + " node = " + n.value + " next = " + n.next.value);
            } else if (n.prev != null && n.next == null) {
                System.out.println("prev = " + n.prev.value + " node = " + n.value + " next = " + n.next);
            } else if (n.prev == null && n.next == null) {
                System.out.println("prev = " + n.prev + " node = " + n.value + " next = " + n.next);
            } else if (n == null) {
                System.out.println("prev = " + n.prev + " node = " + n + " next = " + n.next);
            }
            System.out.println(orderedList.head.value + " " + orderedList.tail.value);
        }
        System.out.println(orderedList.head + " " + orderedList.tail);
        for (int i = 0; i < 4; i++) {
            orderedList.add(2);
            System.out.println("head = " + orderedList.head.value + " tail = " + orderedList.tail.value);
        }
        System.out.println(orderedList);
        ArrayList<Node<Integer>> arrayList1 = orderedList.getAll();
        for (Node<Integer> n : arrayList1) {
            if (n.prev != null && n.next != null) {
                System.out.println("prev = " + n.prev.value + " node = " + n.value + " next = " + n.next.value);
            } else if (n.prev == null && n.next != null) {
                System.out.println("prev = " + n.prev + " node = " + n.value + " next = " + n.next.value);
            } else if (n.prev != null && n.next == null) {
                System.out.println("prev = " + n.prev.value + " node = " + n.value + " next = " + n.next);
            } else if (n.prev == null && n.next == null) {
                System.out.println("prev = " + n.prev + " node = " + n.value + " next = " + n.next);
            } else if (n == null) {
                System.out.println("prev = " + n.prev + " node = " + n + " next = " + n.next);
            }
        }
        System.out.println();
        orderedList.add(91);
        orderedList.add(1);
        System.out.println(orderedList);
        orderedList.add(2);
        orderedList.add(91);
        System.out.println(orderedList);
        orderedList.add(1);
        System.out.println(orderedList);
        orderedList.add(100);
        System.out.println(orderedList);
        System.out.println(orderedList.find(100).value);
        System.out.println(orderedList.find(100).prev + " " + orderedList.find(100).next);
        orderedList.add(0);
        System.out.println(orderedList);
        orderedList.delete(2);
        System.out.println(orderedList);
        orderedList.delete(100);
        System.out.println(orderedList);
        ArrayList<Node<Integer>> arrayList2 = orderedList.getAll();
        for (Node<Integer> n : arrayList2) {
            if (n.prev != null && n.next != null) {
                System.out.println("prev = " + n.prev.value + " node = " + n.value + " next = " + n.next.value);
            } else if (n.prev == null && n.next != null) {
                System.out.println("prev = " + n.prev + " node = " + n.value + " next = " + n.next.value);
            } else if (n.prev != null && n.next == null) {
                System.out.println("prev = " + n.prev.value + " node = " + n.value + " next = " + n.next);
            } else if (n.prev == null && n.next == null) {
                System.out.println("prev = " + n.prev + " node = " + n.value + " next = " + n.next);
            } else if (n == null) {
                System.out.println("prev = " + n.prev + " node = " + n + " next = " + n.next);
            }


        }


    }
}
