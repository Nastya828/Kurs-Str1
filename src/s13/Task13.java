package s13;

public class Task13 {
    public static void main(String[] args) {
        NativeCache<Integer> nativeCache = new NativeCache<>(19, Integer.class);
        for (int i = 0; i < nativeCache.size - 5; i++) {
            nativeCache.put(i + "key", i);

        }
        System.out.println(nativeCache);

        for (int i = 0; i < 5; i++) {
            nativeCache.get(i + "key");
            nativeCache.get(i + "key");
            nativeCache.get(i + "key");
        }
        for (int i = 5; i < 15; i++) {
            nativeCache.get(i + "key");
            nativeCache.get(i + "key");
        }
        for (int i = 15; i < 19; i++) {
            nativeCache.get(i + "key");
            nativeCache.get(i + "key");
            nativeCache.get(i + "key");
            nativeCache.get(i + "key");
        }
        System.out.println(nativeCache);

        nativeCache.put("key", 999);
        System.out.println(nativeCache);
        nativeCache.get("key");
        nativeCache.get("key");
        nativeCache.get("key");
        nativeCache.get("key");
        nativeCache.get("key");
        System.out.println(nativeCache);
        nativeCache.put("key99", 888);
        System.out.println(nativeCache);
    }


}
