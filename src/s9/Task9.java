package s9;

public class Task9 {
    public static void main(String[] args) {

        HashTable hashTable = new HashTable(19, 3);
        System.out.println(hashTable);

        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                System.out.println("index = " + hashTable.put( " ыы"));
                System.out.println(hashTable);
            } else {
                System.out.println("index = " + hashTable.put("yy "));
                System.out.println(hashTable);
            }
        }
        System.out.println("index = " + hashTable.put(null));
        System.out.println(hashTable);
        System.out.println(" find = " + hashTable.find(" ыы"));
    }
}
