package s4;

public class funcOrder {

    public static int order(String str) {
        Stack<Character> queue = new Stack<>();
        Queue<Integer> queueRes = new Queue<>();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                queue.push(chars[i]);
            }
        }
        System.out.println(queue + " size = " + queue.size());
        while (queue.size() > 0) {
            char c = queue.pop();
            if (Character.isDigit(c)) {
                queueRes.push(c - 48);
            } else if (c == '+') {
                queueRes.push(queueRes.pop() + queueRes.pop());
            } else if (c == '*') {
                queueRes.push(queueRes.pop() * queueRes.pop());
            }
        }
        System.out.println(queueRes + " size = " + queueRes.size());
        return 0;
    }
}
