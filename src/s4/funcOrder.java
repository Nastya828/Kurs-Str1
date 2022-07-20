package s4;

public class funcOrder {

    public static int order(String str) {
        Stack<Character> queue = new Stack<>();
        Queue<Character> queueRes = new Queue<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                queue.push(c);
            }
        }
        System.out.println(queue + " size = " + queue.size());
        return 0;
    }
}
