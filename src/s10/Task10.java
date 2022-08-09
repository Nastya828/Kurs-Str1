package s10;

public class Task10 {
    public static void main(String[] args) {
        NativeDictionary<Object> nativeDictionary = new NativeDictionary<>(81, Object.class);
        System.out.println(nativeDictionary);

        System.out.println(nativeDictionary.isKey(null));
        for (int i = 1; i <= nativeDictionary.size; i++) {
            if (i % 2 == 0) {
                nativeDictionary.put(i + "ii", i);
                System.out.println(nativeDictionary.isKey(i + "ii") + " " + i + "ii");
                System.out.println(nativeDictionary.get(i + "ii"));
            } else {
                nativeDictionary.put(i + "uu", i);
                System.out.println(nativeDictionary.isKey(i + "uu") + " " + i + "uu");
                System.out.println(nativeDictionary.get(i + "uu"));
            }
        }
        System.out.println(nativeDictionary);
        nativeDictionary.put(null, 6);
        System.out.println(nativeDictionary);
        System.out.println(nativeDictionary.isKey(null));
        System.out.println(nativeDictionary.get(null));
        nativeDictionary.put(null, 99);
        System.out.println(nativeDictionary);
        System.out.println(nativeDictionary.isKey(null));
        System.out.println(nativeDictionary.get(null));
        nativeDictionary.put(null, null);
        System.out.println(nativeDictionary);
        System.out.println(nativeDictionary.isKey(null));
        System.out.println(nativeDictionary.get(null));


    }
}
