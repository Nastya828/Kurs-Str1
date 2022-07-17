package s2_2;



public class Task2_2 {
    public static void main(String[] args) {

        Linkedlist3 linkedlist3 = new Linkedlist3();
        System.out.println("count = " + linkedlist3.count());
        linkedlist3.addInTail(new Node(3));
        System.out.println(linkedlist3 + " head = " + linkedlist3.head.value + " tail = " + linkedlist3.tail.value);
        System.out.println(linkedlist3.find(3).prev.value + " "+linkedlist3.find(3).value+" " + linkedlist3.find(3).next.value);
        System.out.println("count = " + linkedlist3.count());
        System.out.println(linkedlist3.head.next.value);
        System.out.println(linkedlist3.tail.prev.value);
        linkedlist3.insertAfter(null, new Node(33));
        System.out.println(linkedlist3 + " head = " + linkedlist3.head.value + " tail = " + linkedlist3.tail.value);
        System.out.println("count = " + linkedlist3.count());
        linkedlist3.insertAfter(new Node(33), new Node(34));
        System.out.println(linkedlist3 + " head = " + linkedlist3.head.value + " tail = " + linkedlist3.tail.value);
        System.out.println("count = " + linkedlist3.count());
        linkedlist3.insertAfter(new Node(33), new Node(3));
        System.out.println(linkedlist3 + " head = " + linkedlist3.head.value + " tail = " + linkedlist3.tail.value);
        System.out.println("count = " + linkedlist3.count());

        linkedlist3.removeAll(3);
        System.out.println(linkedlist3 + " head = " + linkedlist3.head.value + " tail = " + linkedlist3.tail.value);
        System.out.println("count = " + linkedlist3.count());
        linkedlist3.remove(34);
        System.out.println(linkedlist3 + " head = " + linkedlist3.head.value + " tail = " + linkedlist3.tail.value);
        System.out.println("count = " + linkedlist3.count());
        linkedlist3.clear();
        System.out.println(linkedlist3 + " head = " + linkedlist3.head.value + " tail = " + linkedlist3.tail.value);
        System.out.println("count = " + linkedlist3.count());

        for(int i = 11; i < 21; i++) {
            linkedlist3.addInTail(new Node(i));
            System.out.println(linkedlist3 + " head = " + linkedlist3.head.value + " tail = " + linkedlist3.tail.value);
            System.out.println("count = " + linkedlist3.count());
        }
        for(int i = 11; i < 21; i+=2) {
            linkedlist3.addInTail(new Node(5));
            System.out.println(linkedlist3 + " head = " + linkedlist3.head.value + " tail = " + linkedlist3.tail.value);
            System.out.println("count = " + linkedlist3.count());
        }
        linkedlist3.insertAfter(new Node(5), new Node(-1));
        System.out.println(linkedlist3 + " head = " + linkedlist3.head.value + " tail = " + linkedlist3.tail.value);
        System.out.println("count = " + linkedlist3.count());
        linkedlist3.removeAll(-1);
        System.out.println(linkedlist3 + " head = " + linkedlist3.head.value + " tail = " + linkedlist3.tail.value);
        System.out.println("count = " + linkedlist3.count());
        System.out.println(linkedlist3.find(0));


    }
}
