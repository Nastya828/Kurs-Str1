package s4;

public class functionBr {
    public static boolean function(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (stack.size() == 0) {
                return false;
            }
            char c1 = stack.pop();
            if (c1 == '(' && c == ')') {

            } else {
                return false;
            }
        }

        return stack.size() == 0;
    }
}
