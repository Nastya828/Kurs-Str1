package s4;

public class functionBr {
    public static boolean function(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (stack.size() == 0 && (c != '(')) {
                return false;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            }
        }
//        while (stack.size() > 0) {
//            if (!(stack.pop() == ')' && stack.pop() == '(')) {
//                return false;
//            }
//        }
        return stack.size() == 0;
    }
}
