package s4;

import java.sql.SQLOutput;

public class Task4 {
    public static void main(String[] args) {
        String str = "8 2 + 5 * 9 + 1 - =";
        System.out.println(funcOrder.order(str));
        String str1 = "1 2 + 5 * 5 / =";
        System.out.println(funcOrder.order(str1));
        String s = ")))";
        System.out.println(functionBr.function(s));
        System.out.println(functionBr.function("()()"));
    }


}
