package s3;

import java.lang.reflect.Array;
import java.util.Arrays;

class ArrayOutException extends Exception {
    private int errorCode = 0;

    public ArrayOutException(String message) {
        this(message, 0);
    }

    public ArrayOutException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

public class DynArray<T> {
    public T[] array;
    public int count;
    public int capacity;
    Class clazz;

    public DynArray(Class clz) {
        clazz = clz;
        count = 0;
        makeArray(16);
    }

    public void makeArray(int new_capacity) {
        if (new_capacity < 16) {
            new_capacity = 16;
        }
        int n;
        if (this.array != null) {
            n = array.length;
        } else {
            n = 0;
        }
        Object[] arrayCopy = new Object[n];
        for (int i = 0; i < n; i++) {
            arrayCopy[i] = this.array[i];
        }
        array = (T[]) Array.newInstance(this.clazz, new_capacity);
        for (int i = 0; i < count; i++) {
            array[i] = (T) arrayCopy[i];
        }
        this.capacity = array.length;
    }

    public T getItem(int index) throws ArrayOutException {
        if (index <= count) {
            return array[index];
        } else {
            throw new ArrayOutException("ArrayOut", 10);
        }
    }

    public void append(T itm) throws ArrayOutException {
        if (count >= array.length) {
            makeArray(array.length * 2);
        }

        insert(itm, this.count);
    }


    public void insert(T itm, int index) throws ArrayOutException {

        if (index > this.count) {
            throw new ArrayOutException("ArrayOut", 10);
        }

        if (index == this.count && index >= array.length) {
            makeArray(array.length * 2);
            array[index] = itm;
        } else if (index == this.count) {
            array[index] = itm;
        } else {
            function(index);
            array[index] = itm;
        }
        this.count = counter();

    }


    public void remove(int index) throws ArrayOutException {

        if (index >= this.count) {
            throw new ArrayOutException("ArrayOut", 10);
        }
        count--;

        if (count < (array.length / 2) && array.length != 16) {
            int x = (int) (array.length / 1.5);
            makeArray(x);
        }

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public int counter() {
        int y = 0;
        for (T i : this.array) {
            if (i != null) {
                y++;
            }
        }
        return y;
    }

    public void function(int index) {
        if (this.count == array.length) {
            makeArray(array.length * 2);
        }
        for (int i = count; i >= index; i--) {
            array[i + 1] = array[i];
        }
    }


    @Override
    public String toString() {
        return "DynArray{" +
                "array=" + Arrays.toString(array) +
                ", \ncount=" + this.count +
                ", array.length=" + array.length +
                ", clazz=" + clazz +
                '}';
    }
}
