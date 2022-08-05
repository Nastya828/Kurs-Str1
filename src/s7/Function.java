package s7;

public class Function {
    //3. Напишите функцию, которая с помощью Deque проверяет,
    // является ли некоторая строка палиндромом (читается одинаково слева направо и справа налево).
    public static boolean check(String str) {
        if (str.isEmpty()) {
            return false;
        }

        Deque<Character> deque = new Deque<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                deque.addTail(str.charAt(i));
            }
        }

        while (deque.size() > 0) {
            if (!deque.removeFront().equals(deque.removeTail())) {
                return false;
            }
        }
        return true;
    }

}
