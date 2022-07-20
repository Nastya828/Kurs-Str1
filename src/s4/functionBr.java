package s4;

public class functionBr {
    public static boolean function(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            }else{
                stack.pop();
            }
        }

        return stack.size() == 0;
    }
}
