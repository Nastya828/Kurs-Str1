package s1;

import org.junit.jupiter.api.Assertions;

class LinkedListTest {
    LinkedList list = new LinkedList();

    @org.junit.jupiter.api.Test
    void addInTail() {
        list.addInTail(new Node(8));
        Assertions.assertEquals(list.tail.value, 8);
        list.addInTail(new Node(9));
        Assertions.assertEquals(list.tail.value, 9);
    }

    @org.junit.jupiter.api.Test
    void find() {
        list.addInTail(new Node(8));
        list.addInTail(new Node(9));
        Assertions.assertEquals(list.find(8).value, new Node(8).value);
        Assertions.assertEquals(list.find(9).value, new Node(9).value);
        Assertions.assertEquals(list.find(93), null);

    }

    @org.junit.jupiter.api.Test
    void findAll() {
        Assertions.assertTrue(list.findAll(1).size() == 0);
        list.addInTail(new Node(1));
        list.addInTail(new Node(2));
        list.addInTail(new Node(1));
        list.addInTail(new Node(3));
        list.addInTail(new Node(1));
        list.addInTail(new Node(4));
        Assertions.assertTrue(list.findAll(1).size() == 3);

    }

    @org.junit.jupiter.api.Test
    void remove() {
        Assertions.assertFalse(list.remove(1));
        list.addInTail(new Node(1));
        list.addInTail(new Node(2));
        list.addInTail(new Node(1));
        list.addInTail(new Node(3));
        list.addInTail(new Node(1));
        list.addInTail(new Node(4));
        Assertions.assertTrue(list.remove(1));
        Assertions.assertTrue(list.count() == 5);
    }

    @org.junit.jupiter.api.Test
    void removeAll() {
        Assertions.assertFalse(list.remove(1));
        list.addInTail(new Node(1));
        list.addInTail(new Node(2));
        list.addInTail(new Node(1));
        list.addInTail(new Node(3));
        list.addInTail(new Node(1));
        list.addInTail(new Node(4));
        list.removeAll(1);
        Assertions.assertTrue(list.count() == 3);
        Assertions.assertTrue(list.find(1) == null);
    }

    @org.junit.jupiter.api.Test
    void clear() {
        Assertions.assertTrue(list.count() == 0);
        list.addInTail(new Node(1));
        list.addInTail(new Node(2));
        list.addInTail(new Node(1));
        list.addInTail(new Node(3));
        list.addInTail(new Node(1));
        list.addInTail(new Node(4));
        Assertions.assertTrue(list.count() == 6);
        list.clear();
        Assertions.assertTrue(list.count() == 0);
    }

    @org.junit.jupiter.api.Test
    void count() {
        Assertions.assertFalse(list.count() > 0);
        list.addInTail(new Node(1));
        Assertions.assertTrue(list.count() == 1);
        list.addInTail(new Node(2));
        Assertions.assertTrue(list.count() == 2);
        list.addInTail(new Node(1));
        Assertions.assertTrue(list.count() == 3);
        list.addInTail(new Node(3));
        Assertions.assertTrue(list.count() == 4);
        list.addInTail(new Node(1));
        Assertions.assertTrue(list.count() == 5);
        list.addInTail(new Node(4));
        Assertions.assertTrue(list.count() == 6);
    }

    @org.junit.jupiter.api.Test
    void insertAfter() {

        list.addInTail(new Node(1));
        list.addInTail(new Node(2));
        list.addInTail(new Node(1));
        list.addInTail(new Node(3));
        list.addInTail(new Node(1));
        list.addInTail(new Node(4));
        Assertions.assertTrue(list.find(2).next.value == 1);
        list.insertAfter(new Node(2), new Node(58));
        Assertions.assertTrue(list.find(2).next.value == 58);
        Assertions.assertTrue(list.head.value == 1);
        list.insertAfter(null, new Node(-101));
        Assertions.assertTrue(list.head.value == -101);
        Assertions.assertEquals(list.find(-101).next.value, new Node(1).value);
        Assertions.assertTrue(list.tail.value == 4);
        list.insertAfter(new Node(4), new Node(5));
        Assertions.assertTrue(list.tail.value == 5);
        Assertions.assertTrue(list.find(4).next.value == 5);
        Assertions.assertEquals(list.find(5).next, null);


    }
}