package s11;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class PowerSet {
    HashTable powerSet;

    public PowerSet() {
        this.powerSet = new HashTable(20, 3);
    }

    public int size() {

        int n = 0;
        for (String str : this.powerSet.slots) {
            if (str != null) {
                n++;
            }
        }
        return n;

    }


    public void put(String value) {
        for (String s : this.powerSet.slots) {
            if (s.equals(value)) {
                System.out.println("already exist");
                return;
            }
        }
        this.powerSet.putOld(value);
    }

    public boolean get(String value) {
        return this.powerSet.find(value) != -1;
    }

    public boolean remove(String value) {
        int x = this.powerSet.find(value);
        if (x != -1) {
            this.powerSet.slots[x] = null;
        }
        return this.powerSet.find(value) == -1;
    }

    public PowerSet intersection(PowerSet set2) {
        PowerSet setInter = null;
        for (String s : set2.powerSet.slots) {
            if (this.powerSet.find(s) != -1) {
                setInter.put(s);
            }
        }
        return setInter;
    }

    public PowerSet union(PowerSet set2) {
        PowerSet unionInter = null;
        for (String s : set2.powerSet.slots) {
            unionInter.put(s);
        }
        for (String s : this.powerSet.slots) {
            unionInter.put(s);
        }

        return unionInter;
    }

    public PowerSet difference(PowerSet set2) {
        PowerSet diffInter = null;
        PowerSet unionInter = union(set2);
        PowerSet setInter = intersection(set2);
        for (String s : unionInter.powerSet.slots) {
            if (setInter.powerSet.find(s) != -1) {
                diffInter.put(s);
            }
        }

        return diffInter;
    }

    public boolean isSubset(PowerSet set2) {
        return intersection(set2).equals(set2);
    }
}

class HashTable {
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
        return "HashTable{" +
                "size=" + size +
                ", step=" + step +
                ", slots=" + Arrays.toString(slots) +
                '}';
    }
}
