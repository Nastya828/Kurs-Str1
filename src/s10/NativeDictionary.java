package s10;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class NativeDictionary<T> {
    public int size;
    public String[] slots;
    public int step = 3;
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
        return find(key) != -1;
    }

    public void put(String key, T value) {
        int x = putOld(key);
        if (x != -1 && x < values.length) {
            values[x] = value;
            return;
        }
        int s = search();
        if (s != -1) {
            slots[s] = key;
            values[s] = value;
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

    public int putOld(String value) {
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