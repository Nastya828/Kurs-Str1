package s6;

public class Task6 {
    public static void main(String[] args) {
        Queue<Object> queue = new Queue<>();
        String str = "string";
        Integer y = 88;
        Double aDouble = 8.98;
        StringBuilder stringBuilder = new StringBuilder("stringBuilder");

        queue.enqueue(str);
        System.out.println(queue);
        queue.enqueue(y);
        System.out.println(queue);
        queue.enqueue(aDouble);
        System.out.println(queue);
        queue.enqueue(stringBuilder);
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
