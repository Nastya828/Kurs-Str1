package s3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynArrayTest {
    // DynArray<Integer> dry = new DynArray<>(Integer.class);

    public void xDry(DynArray<Integer> dry) {
        for (int i = 0; i < dry.capacity; i++) {
            dry.append(i);
        }
    }


    @Test
    void append() {
        DynArray<Integer> dryAppend = new DynArray<>(Integer.class);
        Assertions.assertEquals(dryAppend.capacity, 16);
        xDry(dryAppend);
        Assertions.assertEquals(dryAppend.capacity, 16);
        dryAppend.append(888);
        Assertions.assertEquals(dryAppend.capacity, 16 * 2);
    }


    @Test
    void insert() throws ArrayOutException {
        DynArray<Integer> dry = new DynArray<>(Integer.class);
        try {
            dry.insert(18, 29);
            fail("Test insert failed!");
        } catch (ArrayOutException exception) {
            Assertions.assertTrue(exception.getErrorCode() == 10);
        }
        dry.insert(555, 7);
    }


    @Test
    void remove() throws ArrayOutException {
        DynArray<Integer> dryRemove = new DynArray<>(Integer.class);
        xDry(dryRemove);
        Assertions.assertEquals(dryRemove.capacity, 16);
        dryRemove.remove(5);
        Assertions.assertEquals(dryRemove.capacity, 16);

        dryRemove.append(9);
        Assertions.assertEquals(dryRemove.capacity, 16);
        dryRemove.append(8);
        Assertions.assertEquals(dryRemove.capacity, 16 * 2);

        int x = (int) (dryRemove.capacity / 1.5);
        dryRemove.remove(4);
        Assertions.assertEquals(dryRemove.capacity, 16 * 2);
        dryRemove.remove(4);
        Assertions.assertEquals(dryRemove.capacity, x);

        try {
            dryRemove.remove(27);
            fail("Test remove failed!");
        } catch (ArrayOutException exception) {
            Assertions.assertTrue(exception.getErrorCode() == 10);
        }

    }
}