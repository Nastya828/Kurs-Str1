package s8;



public class Task8 {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);

        OrderedList<Integer> orderedList = new OrderedList<>(false);
        System.out.println(orderedList  + " head = " + orderedList.head + "tail = " + orderedList.tail);
        orderedList.add(1);
        System.out.println(orderedList  + " head = " + orderedList.head.value + " tail = " + orderedList.tail.value);
        System.out.println("prev = " + orderedList.find(1).prev + " node = "  +
                orderedList.find(1).value + " next = " + orderedList.find(1).next);
        orderedList.add(11);
        System.out.println(orderedList  + " head = " + orderedList.head.value + " tail = " + orderedList.tail.value);
        System.out.println("prev = " + orderedList.find(11).prev.value + " node = "  +
                orderedList.find(11).value + " next = " + orderedList.find(11).next);
        orderedList.add(9);
        System.out.println(orderedList  + " head = " + orderedList.head.value + " tail = " + orderedList.tail.value);
        System.out.println("prev = " + orderedList.find(9).prev.value + " node = "  +
                orderedList.find(9).value + " next = " + orderedList.find(9).next.value);
        orderedList.add(91);
        System.out.println(orderedList  + " head = " + orderedList.head.value + " tail = " + orderedList.tail.value);
        System.out.println("prev = " + orderedList.find(91).prev.value + " node = "  +
                orderedList.find(91).value + " next = " + orderedList.find(91).next);
        orderedList.delete(91);
        System.out.println(orderedList  + " head = " + orderedList.head.value + " tail = " + orderedList.tail.value);
        orderedList.delete(9);
        System.out.println(orderedList  + " head = " + orderedList.head.value + " tail = " + orderedList.tail.value);
        System.out.println("prev = " + orderedList.find(11).prev.value + " node = "  +
                orderedList.find(11).value + " next = " + orderedList.find(11).next);
        orderedList.clear(true);
        System.out.println(orderedList  + " head = " + orderedList.head + " tail = " + orderedList.tail);








       // System.out.println("7 ?? 9 =  " + orderedList.compare(7, 9));

    }

    public static void print(OrderedList orderedList) {
        if (orderedList.head != null && orderedList.tail != null) {
            System.out.println(orderedList + " head = " + orderedList.head.value + " tail = " + orderedList.tail.value +
                    " count = " + orderedList.count());
        } else if (orderedList.head == null && orderedList.tail != null) {
            System.out.println(orderedList + " head = " + orderedList.head + " tail = " + orderedList.tail.value + " count = "
                    + orderedList.count());
        } else if (orderedList.head != null && orderedList.tail == null) {
            System.out.println(orderedList + " head = " + orderedList.head.value +
                    " tail = " + orderedList.tail + " count = " + orderedList.count());
        } else {
            System.out.println(orderedList + " head = " + orderedList.head + " tail = "
                    + orderedList.tail + " count = " + orderedList.count());
        }

        Node<Integer> n = orderedList.head;
        while (n != null) {
            if (n.prev != null && n.next != null) {
                System.out.println(" prev = " + orderedList.find(n.value).prev.value + " node = " + orderedList.find(n.value).value
                        + " next = " + orderedList.find(n.value).next.value);
            } else if (n.prev == null && n.next != null) {
                System.out.println(" prev = " + orderedList.find(n.value).prev + " node = " + orderedList.find(n.value).value
                        + " next = " + orderedList.find(n.value).next.value);
            } else if (n.prev != null && n.next == null) {
                System.out.println(" prev = " + orderedList.find(n.value).prev.value + " node = " + orderedList.find(n.value).value
                        + " next = " + orderedList.find(n.value).next);
            } else {
                System.out.println(" prev = " + orderedList.find(n.value).prev + " node = " + orderedList.find(n.value).value
                        + " next = " + orderedList.find(n.value).next);
            }
            n = n.next;
        }
    }


}
