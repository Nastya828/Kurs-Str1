package s6;

public class FunctionFirst {
//3. Напишите функцию, которая "вращает" очередь по кругу на N элементов.

    public static void function(Queue queue, int N) {
        if (queue.size() == 0 || N > queue.size()) {
            return;
        }

        for (int i = 0; i < N; i++) {
            queue.enqueue(queue.dequeue());
        }

    }

}
