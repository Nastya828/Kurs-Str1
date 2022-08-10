package s11;

public class Task11 {
    public static void main(String[] args) {
        PowerSet powerSet = new PowerSet();
        PowerSet powerSet2 = new PowerSet();
        PowerSet powerSetSub = new PowerSet();
        long t1 = System.currentTimeMillis();
        System.out.println(powerSet + " size = " + powerSet.size() + "\n Set2 =" + powerSet2 + " size2 = " + powerSet2.size());

        for (int i = 2; i < powerSet.capacity; i++) {
            powerSet.put(i + "hello");
        }
        for (int i = 100; i < powerSet2.capacity + 100; i++) {
            powerSet2.put(i + "hello");
        }
//        for (int i = 0; i < 14; i++) {
//            powerSetSub.put(i + "hello");
//        }
        System.out.println(powerSet + " size = " + powerSet.size() + "\n Set2 =" + powerSet2 + " size2 = " + powerSet2.size());
        System.out.println(powerSetSub);
        System.out.println(powerSet.isSubset(powerSetSub));




    }
}
