package s10;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

class NativeDictionary<T> {
    public int size;
    public String[] slots;
    public int step = 1;
    public T[] values;

    public NativeDictionary(int sz, Class clazz) {
        size = sz;
        slots = new String[size];
        values = (T[]) Array.newInstance(clazz, this.size);
    }

    public int hashFun(String key) {
        byte[] bytes = key.getBytes(StandardCharsets.UTF_8);
        int s = 0;
        for (byte b : bytes) {
            s += b;
        }
        return Math.abs(s % this.size);
    }

    public boolean isKey(String key) {
        for (String str : slots) {
            if (Objects.equals(str, key)) {
                return true;
            }
        }
        return false;
    }

    public void put(String key, T value) {
        int x = put(key);
        if (x != -1) {
            values[x] = value;
        } else {
            values[search()] = value;
        }
    }

    public T get(String key) {
        T x = null;
        int t = find(key);
        if (t != -1) {
            x = values[t];
        }
        return x;
    }

    public int search() {
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] == null) {
                return i;
            }
        }
        return -1;
    }


    public int seekSlot(String value) {
        int index = hashFun(value);
        int n = index;
        do {
            if (this.slots[n] == null) {
                return n;
            }
            if (n <= (this.slots.length - 1) - this.step) {
                n += this.step;
            } else {
                n = index % this.step;
            }
        } while (n != index);

        return -1;
    }

    public int put(String value) {
        int index = seekSlot(value);
        if (index != -1) {
            this.slots[index] = value;
        }
        return index;
    }

    public int find(String value) {
        int x = hashFun(value);
        int n = x;
        do {
            if (this.slots[n] != null && this.slots[n].equals(value)) {
                return n;
            }
            if (n < this.slots.length - 1) {
                n++;
            } else {
                n = 0;
            }
        } while (n != x);

        return -1;
    }

    @Override
    public String toString() {
        return "NativeDictionary{" +
                "size=" + size +
                ", step=" + step +
                ", \nslots=" + Arrays.toString(slots) +
                ", \nvalues=" + Arrays.toString(values) +
                '}';
    }
}