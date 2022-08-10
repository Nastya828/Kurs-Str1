package s12;

import java.util.BitSet;

public class BloomFilter {
    public int filter_len;
    public BitSet bitSet;

    public BloomFilter(int f_len) {
        filter_len = f_len;
        // создаём битовый массив длиной f_len
        bitSet = new BitSet(f_len);

        bitSet.set(0, 0, true);

    }

 
    //Хэш-функции можно использовать достаточно простые, например версия для строки:
    //организуем цикл до длины строки, результат в этом цикле считаем как его версия с предыдущей итерации,
    // умноженная на случайное число,
    // к которой прибавляется код очередного символа, и берём результат тут же по модулю длины таблицы.
    public int hash1(String str1) {
        // 17
        for (int i = 0; i < str1.length(); i++) {
            int code = (int) str1.charAt(i);
        }
        // реализация ...
        return 0;
    }

    public int hash2(String str1) {
        // 223
        // реализация ...
        return 0;
    }

    public void add(String str1) {
        // добавляем строку str1 в фильтр
    }

    public boolean isValue(String str1) {
        // проверка, имеется ли строка str1 в фильтре
        return false;
    }

    @Override
    public String toString() {
        return "BloomFilter{" +
                "filter_len=" + filter_len +
                ", bitSet=" + bitSet +
                '}';
    }
}
