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
        int a = 0;
        int b = 0;

        while (queue.size() > 0) {
            char c = queue.pop();
            if (Character.isDigit(c)) {
                queueRes.push(c - 48);
            } else if (c == '+') {
                queueRes.push(a + b);
            } else if (c == '*') {
                queueRes.push(a * b);
            } else if (c == '-') {
                queueRes.push(b - a);
            } else if (c == '/' && a != 0) {
                queueRes.push(b / a);
            } else if (c == '=') {
                return queueRes.pop();
            }
            if (queueRes.size() > 1) {
                a = queueRes.pop();
                b = queueRes.pop();
            }
        }

        return 0;
    }
}
