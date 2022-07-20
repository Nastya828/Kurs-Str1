package s4;

public class functionBr {
    public static boolean function(String str) {
        Stack<Character> stack = new Stack<>();
        int x = 0;
        int y = 0;
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        System.out.println(stack + " size = " + stack.size());
        while (stack.size() > 0) {
            if (stack.pop() == '(') {
                x++;
            } else {
                y++;
            }
        }
        return x == y;
    }
}
