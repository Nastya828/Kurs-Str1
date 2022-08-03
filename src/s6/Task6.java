package s6;

public class Task6 {
    public static void main(String[] args) {
//        Queue<Object> objectQueue = new Queue<>();
//        for(int i = 0; i < 5; i++){
//            objectQueue.enqueue(i);
//        }
//        System.out.println(objectQueue);
//
//        FunctionFirst.function(objectQueue, 3);
//        System.out.println(objectQueue);



        StackQueue<Object> queue = new StackQueue<>();
//        String str = "string";
//        Integer y = 88;
//        Double aDouble = 8.98;
//        StringBuilder stringBuilder = new StringBuilder("stringBuilder");

        for(int i = 0; i < 4; i++){
            queue.enqueue(i);
            System.out.println(queue);
        }


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
