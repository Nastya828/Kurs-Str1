package s9;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class HashTable {
    public int size;
    public int step;
    public String[] slots;

    public HashTable(int sz, int stp) {
        size = sz;
        step = stp;
        slots = new String[size];
        for (int i = 0; i < size; i++) slots[i] = null;
    }

    public int hashFun(String value) {

        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        int s = 0;
        for (byte b : bytes) {
            s += b;
        }

        return Math.abs(s % this.size);
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
        return "HashTable{" +
                "size=" + size +
                ", step=" + step +
                ", slots=" + Arrays.toString(slots) +
                '}';
    }
}
