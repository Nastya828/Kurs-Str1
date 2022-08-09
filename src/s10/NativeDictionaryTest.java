package s10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NativeDictionaryTest {

    @Test
    void isKey() {
        NativeDictionary<Integer> dictionary = new NativeDictionary<>(19, Integer.class);
        String key6 = "null";
        String key7 = "key7";
        dictionary.put(key6, 6);
        Assertions.assertTrue(dictionary.isKey(key6));
        Assertions.assertFalse(dictionary.isKey(key7));
        dictionary.put(key7, 7);
        Assertions.assertTrue(dictionary.isKey(key7));
        dictionary.put(key7, 7);
        Assertions.assertTrue(dictionary.isKey(key7));
        dictionary.put(null, 9);
        Assertions.assertTrue(dictionary.isKey(null));
        Assertions.assertFalse(dictionary.isKey("Hello"));
    }

    @Test
    void put() {
        NativeDictionary<Integer> nativeDictionary = new NativeDictionary<>(2000, Integer.class);
        for (int i = 1; i < nativeDictionary.slots.length; i++) {
            if (i % 2 == 0) {
                nativeDictionary.put(i + "ii", i);
                Assertions.assertTrue(nativeDictionary.isKey(i + "ii"), i + "ii");
            } else {
                nativeDictionary.put(9 + "uu", i);
                Assertions.assertTrue(nativeDictionary.isKey(9 + "uu"), 9 + "uu");
            }
        }
    }

    @Test
    void get() {
        NativeDictionary<Integer> dictionary = new NativeDictionary<>(19, Integer.class);
        String key6 = "null";
        String key7 = "key7";
        dictionary.put(key6, 6);
        Assertions.assertEquals(6, (int) dictionary.get(key6));
        Assertions.assertNull(dictionary.get(key7));

    }
}