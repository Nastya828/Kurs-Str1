package s6;

public class FunctionFirst {
//3. Напишите функцию, которая "вращает" очередь по кругу на N элементов.

    public static void function(StackQueue queue, int N) {
        if (queue.size() == 0 || N > queue.size()) {
            return;
        }

        while (N > 0) {
            queue.enqueue(queue.dequeue());
            N--;
        }

    }

}
