package s7;

public class Task07 {
    public static void main(String[] args) {
        Deque<Object> deque = new Deque<>();
        System.out.println(deque.removeFront());
        System.out.println(deque);
        System.out.println(deque.removeTail());
        System.out.println(deque);

        deque.addFront(1);
        System.out.println(deque);
        deque.addFront(2);
        System.out.println(deque);
        deque.addFront(3);
        System.out.println(deque);
        deque.addFront(4);
        System.out.println(deque);
        System.out.println(deque.removeFront());
        System.out.println(deque);
        System.out.println(deque.removeTail());
        System.out.println(deque);
        deque.addTail("rrr");
        System.out.println(deque);
        deque.addTail(9.0);
        System.out.println(deque);
        deque.addFront("hello");
        System.out.println(deque);
        System.out.println(deque.removeFront());
        System.out.println(deque);
        System.out.println(deque.removeTail());
        System.out.println(deque);






    }
}
