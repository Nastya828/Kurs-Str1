package s10;

public class Task10 {
    public static void main(String[] args) {
        NativeDictionary<Integer> nativeDictionary = new NativeDictionary<>(19, Integer.class);
        System.out.println(nativeDictionary);

        for (int i = 0; i < nativeDictionary.size - 1; i++) {
            if (i % 2 == 0) {
                nativeDictionary.put(i + "ii", i);
                System.out.println(nativeDictionary);
            } else {
                nativeDictionary.put(i + "uu", i);
                System.out.println(nativeDictionary);
            }
        }
        nativeDictionary.put("77", 909);
        System.out.println(nativeDictionary);
        System.out.println(nativeDictionary.get("77"));



    }
}
