package s6;

public class Task6 {
    public static void main(String[] args) {
        StackQueue<Object> queue = new StackQueue<>();
        String str = "string";
        Integer y = 88;
        Double aDouble = 8.98;
        StringBuilder stringBuilder = new StringBuilder("stringBuilder");

        queue.enqueue(1);
        System.out.println(queue);
        queue.enqueue(2);
        System.out.println(queue);
        queue.enqueue(3);
        System.out.println(queue);
        queue.enqueue(4);
        System.out.println(queue);
        queue.enqueue(5);
        System.out.println(queue);


        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);

    }




}
