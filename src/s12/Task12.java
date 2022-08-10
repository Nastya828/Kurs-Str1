package s12;

public class Task12 {
    public static void main(String[] args) {
        int m = 32;
        BloomFilter bloomFilter = new BloomFilter(m);
        // System.out.println(String.format("%32s", Integer.toBinaryString(bloomFilter.filter)).replace(' ', '0'));
        String[] strings = {"0123456789", "1234567890", "2345678901", "3456789012", "4567890123", "5678901234",
                "6789012345", "7890123456", "8901234567", "9012345678"};

        for (String s : strings) {
            //bloomFilter.add(s);
            System.out.println(s + " " + bloomFilter.isValue(s));
            //System.out.println("s: " + s);
            //System.out.println(String.format("%32s", Integer.toBinaryString(bloomFilter.filter)).replace(' ', '0'));

        }
        System.out.println(String.format("%32s", Integer.toBinaryString(bloomFilter.filter)).replace(' ', '0'));

    }
}
