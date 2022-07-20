package s3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DynArray<T> {
    public T[] array;
    public int count;
    public int capacity;
    Class clazz;

    public DynArray(Class clz) {
        clazz = clz;
        //new DynArray<Integer>(Integer.class);
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
        for (int i = 0; i < count - 1; i++) {
            array[i] = (T) arrayCopy[i];
        }
        this.capacity = array.length;
    }

    public T getItem(int index) throws ArrayIndexOutOfBoundsException {
        if (index < array.length) {
            return array[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void append(T itm) {
        if (count >= array.length) {
            makeArray(array.length * 2);
        }

        for (int i = 0; i < array.length; i++)
            if (array[i] == null) {
                array[i] = itm;
                this.count++;
                break;
            }
    }


    public void insert(T itm, int index) throws ArrayIndexOutOfBoundsException {

        if (index > capacity) {
            throw new ArrayIndexOutOfBoundsException();
        }

        count = counter() + 1;
        if (this.count > this.array.length) {
            makeArray(array.length * 2);
        }
        if (count - 1 - index >= 0) {
            System.arraycopy(array, index, array, index + 1, count - 1 - index);
        }
        if (index == array.length) {
            array[index - 1] = itm;
        } else if (index < array.length) {
            array[index] = itm;
        }

    }


    public void remove(int index) throws ArrayIndexOutOfBoundsException {
        try {
            if (index > array.length) {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }

        if (counter() != 0 && array[index] != null) {
            count--;
        }
        if (count < (array.length / 2) && array.length != 16) {
            int x = (int) (array.length / 1.5);
            makeArray(x);
        }

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
        if (count > counter()) {
            count = counter();
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
