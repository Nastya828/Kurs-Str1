package s10;

public class Task10 {
    public static void main(String[] args) {
        NativeDictionary<Object> nativeDictionary = new NativeDictionary<>(19, Object.class);
        System.out.println(nativeDictionary);

        for (int i = 0; i < nativeDictionary.size-1; i++) {
            if (i % 2 == 0) {
                nativeDictionary.put(i + "ii", i);
            } else {
                nativeDictionary.put(i + "uu", i);
            }
        }
        System.out.println(nativeDictionary);
        nativeDictionary.put("nulle", "nulle");
        System.out.println(nativeDictionary);
        System.out.println(nativeDictionary.get("13uu"));




    }
}
