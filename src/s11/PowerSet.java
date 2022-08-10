package s11;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    List<String> powerSet;
    final public int capacity = 15;

    public PowerSet() {
        this.powerSet = new ArrayList<>(capacity);
    }

    public int size() {
        return this.powerSet.size();

    }


    public void put(String value) {
        if (powerSet.contains(value)) {
            return;
        }
        this.powerSet.add(value);
    }


    public boolean get(String value) {
        return this.powerSet.contains(value);
    }

    public boolean remove(String value) {
        return this.powerSet.remove(value);
    }

    public PowerSet intersection(PowerSet set2) {
        PowerSet setInter = new PowerSet();
        for (String s : set2.powerSet) {
            if (s != null && this.powerSet.contains(s)) {
                setInter.put(s);
            }
        }
        return setInter;
    }

    public PowerSet union(PowerSet set2) {
        PowerSet unionInter = new PowerSet();
        for (String s : set2.powerSet) {
            if (s != null) {
                unionInter.put(s);
            }
        }
        for (String s : this.powerSet) {
            if (s != null) {
                unionInter.put(s);
            }
        }
        return unionInter;
    }

    public PowerSet difference(PowerSet set2) {
        PowerSet diffInter = new PowerSet();
        for (String s : this.powerSet) {
            if (s != null && !set2.powerSet.contains(s)) {
                diffInter.put(s);
            }
        }
        return diffInter;
    }

    public boolean isSubset(PowerSet set2) {
        if (set2.powerSet.isEmpty()) {
            return true;
        }
        for (String s : set2.powerSet) {
            if (s != null && !this.powerSet.contains(s)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "PowerSet{" +
                "\npowerSet=" + powerSet +
                '}';
    }
}


