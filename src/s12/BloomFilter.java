package s12;

public class BloomFilter {
    public int filter_len;
    int filter;

    public BloomFilter(int f_len) {
        filter_len = f_len;
        filter = 0;
    }


    public int hash1(String str1) {
        int x = 17;
        int code = 0;
        for (int i = 1; i < str1.length(); i++) {
            code = (str1.charAt(i) + code * x) % 32;
        }
        return Math.abs(code);
    }

    public int hash2(String str1) {
        int x = 223;
        int code = 0;
        for (int i = 1; i < str1.length(); i++) {
            code = (str1.charAt(i) + code * x) % 32;
        }
        return Math.abs(code);
    }

    public void add(String str1) {
        int x = hash1(str1);
        int y = hash2(str1);
        if (isValue(str1)) {
            return;
        }
        filter = filter ^ (1 << x);
        filter = filter ^ (1 << y);

    }

    public boolean isValue(String str1) {
        int x = hash1(str1);
        int y = hash2(str1);
        int t = 0;
        t ^= (1 << x);
        t ^= (1 << y);
        return (filter & t) == t;
    }

    @Override
    public String toString() {
        return "BloomFilter{" +
                "filter_len=" + Integer.toBinaryString(filter) +
                '}';
    }
}
