package s11;

public class Task11 {
    public static void main(String[] args) {
        PowerSet powerSet = new PowerSet();
        PowerSet powerSet2 = new PowerSet();
        PowerSet powerSetSub = new PowerSet();
        long t1 = System.currentTimeMillis();
        System.out.println(powerSet + " size = " + powerSet.size() + "\n Set2 =" + powerSet2 + " size2 = " + powerSet2.size());

        for (int i = 1; i < powerSet.capacity; i++) {
            powerSet.put(i + "hello");
        }
        for (int i = 100; i < powerSet2.capacity + 100; i++) {
            powerSet2.put(i + "hello");
        }
        for (int i = 5; i < 14; i++) {
            powerSetSub.put(i + "hello");
        }
        System.out.println(powerSet + " size = " + powerSet.size() + "\n Set2 =" + powerSet2 + " size2 = " + powerSet2.size());

        System.out.println("Sub = " + powerSetSub);
        System.out.println("difference " + powerSet.difference(powerSetSub));
        System.out.println("union " + powerSet.union(powerSet2));
        System.out.println("isSubset " + powerSet.isSubset(powerSetSub));
        System.out.println("1 " + powerSetSub.isSubset(powerSet));
        System.out.println("2 " + powerSet.isSubset(powerSet2));
        System.out.println("intersection " + powerSet.intersection(powerSet2));
        System.out.println("intersection " + powerSet.intersection(powerSetSub));

        System.out.println(powerSet.get("16hello"));
        System.out.println(powerSet.remove("17hello"));
        System.out.println(powerSet.get("16hello"));

        long t2 = System.currentTimeMillis();
        if (t2 - t1 > 2000) {
            System.out.println("Non = " + (t2 - t1));
        } else {
            System.out.println("OK!");
        }


    }
}
