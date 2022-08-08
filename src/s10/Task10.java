package s10;

public class Task10 {
    public static void main(String[] args) {
        NativeDictionary<Object> nativeDictionary = new NativeDictionary<>(19, Object.class);
        System.out.println(nativeDictionary);
        System.out.println(nativeDictionary.isKey(7 + "ii"));
        for (int i = 0; i < nativeDictionary.size-1; i++) {
            if (i % 2 == 0) {
                nativeDictionary.put(i + "ii", i);
                System.out.println(nativeDictionary.isKey(i + "ii"));
                System.out.println(nativeDictionary.get(i + "ii"));
            } else {
                nativeDictionary.put(i + "uu", i);
                System.out.println(nativeDictionary.isKey(i + "uu"));
                System.out.println(nativeDictionary.get(i + "ou"));
            }
        }
        System.out.println(nativeDictionary);
    }
}
