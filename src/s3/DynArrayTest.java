package s3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class DynArrayTest {
    DynArray<Integer> dynArray = new DynArray<>(Integer.class);

    @Test
    void getItem() {
    }

    @Test
    void append() {
    }

    @Test
    void insert() {
        try {
            dynArray.insert(999, 29);
        } catch (ArrayOutException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void remove() {
        try {
            dynArray.remove(2);
        } catch (ArrayOutException e) {
            throw new RuntimeException(e);
        }
    }
}