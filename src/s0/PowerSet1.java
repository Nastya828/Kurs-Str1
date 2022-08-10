//package s0;
//
//
//
//import java.nio.charset.StandardCharsets;
//import java.util.Arrays;
//
//public class PowerSet1 {
//    private HashTable1 powerSet;
//    final public int capacity = 20_000;
//
//    public PowerSet1() {
//        this.powerSet = new HashTable1(capacity, 3);
//    }
//
//    public int size() {
//
//        int n = 0;
//        for (String str : this.powerSet.slots) {
//            if (str != null) {
//                n++;
//            }
//        }
//        return n;
//
//    }
//
//
//    public void put(String value) {
//        if (powerSet.find(value) != -1) {
//            return;
//        }
//        int x = this.powerSet.seekSlot(value);
//        if (x != -1 && x < this.powerSet.slots.length) {
//            this.powerSet.putOld(value);
//            return;
//        }
//        int s = search();
//        if (s != -1) {
//            this.powerSet.slots[s] = value;
//        }
//    }
//
//    private int search() {
//        for (int i = 0; i < powerSet.slots.length; i++) {
//            if (powerSet.slots[i] == null) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public boolean get(String value) {
//        return value != null && this.powerSet.find(value) != -1;
//    }
//
//    public boolean remove(String value) {
//        if (value != null && this.powerSet.find(value) == -1) {
//            return false;
//        }
//        int x = this.powerSet.find(value);
//        if (x != -1) {
//            this.powerSet.slots[x] = null;
//        }
//        return this.powerSet.find(value) == -1;
//    }
//
//    public PowerSet intersection(PowerSet set2) {
//        // int n = Math.min(this.powerSet.size, set2.size());
//        PowerSet setInter = new PowerSet();
//        for (String s : set2.powerSet.slots) {
//            if (s != null && this.powerSet.find(s) != -1) {
//                setInter.put(s);
//            }
//        }
//        return setInter;
//    }
//
//    public PowerSet union(PowerSet set2) {
//        // int n = (set2.size() + size()) - intersection(set2).size();
//        PowerSet unionInter = new PowerSet();
//        for (String s : set2.powerSet.slots) {
//            if (s != null) {
//                unionInter.put(s);
//            }
//        }
//        for (String s : this.powerSet.slots) {
//            if (s != null) {
//                unionInter.put(s);
//            }
//        }
//        return unionInter;
//    }
//
//    public PowerSet difference(PowerSet set2) {
//
//        PowerSet unionInter = union(set2);
//        PowerSet setInter = intersection(set2);
//        if (setInter.size() == 0) {
//            return unionInter;
//        }
//        //int n = unionInter.size() - setInter.size();
//        PowerSet diffInter = new PowerSet();
//
//        for (String s : unionInter.powerSet.slots) {
//            if (s != null && setInter.powerSet.find(s) == -1) {
//                diffInter.put(s);
//            }
//        }
//
//        return diffInter;
//    }
//
//    public boolean isSubset(PowerSet set2) {
//        for (String s : set2.powerSet.slots) {
//            if (s != null && this.powerSet.find(s) == -1) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "PowerSet{" +
//                "powerSet=" + powerSet +
//                '}';
//    }
//}
//
//class HashTable1 {
//    public int size;
//    public int step;
//    public String[] slots;
//
//    public HashTable1(int sz, int stp) {
//        size = sz;
//        step = stp;
//        slots = new String[size];
//        for (int i = 0; i < size; i++) slots[i] = null;
//    }
//
//    public int hashFun(String value) {
//
//        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
//        int s = 0;
//        for (byte b : bytes) {
//            s += b;
//        }
//
//        return Math.abs(s % this.size);
//    }
//
//    public int seekSlot(String value) {
//        int index = hashFun(value);
//        int n = index;
//        do {
//            if (this.slots[n] == null) {
//                return n;
//            }
//            if (n <= (this.slots.length - 1) - this.step) {
//                n += this.step;
//            } else {
//                n = index % this.step;
//            }
//        } while (n != index);
//
//        return -1;
//    }
//
//    public int putOld(String value) {
//        int index = seekSlot(value);
//        if (index != -1) {
//            this.slots[index] = value;
//        }
//        return index;
//    }
//
//    public int find(String value) {
//        int x = hashFun(value);
//        int n = x;
//        do {
//            if (this.slots[n] != null && this.slots[n].equals(value)) {
//                return n;
//            }
//            if (n < this.slots.length - 1) {
//                n++;
//            } else {
//                n = 0;
//            }
//        } while (n != x);
//
//        return -1;
//    }
//
//    @Override
//    public String toString() {
//        return "{" +
//                "slots=" + Arrays.toString(slots) +
//                '}';
//    }
//}
