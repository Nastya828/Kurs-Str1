package s3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynArrayTest {


    public void xDry(DynArray<Integer> dry, int n) {
        for (int i = 0; i < n; i++) {
            dry.append(i);
        }
    }


    @Test
    void append() {
        DynArray<Integer> dryAppend = new DynArray<>(Integer.class);
        Assertions.assertEquals(dryAppend.capacity, 16);
        xDry(dryAppend,dryAppend.capacity );
        Assertions.assertEquals(dryAppend.capacity, 16);
        dryAppend.append(888);
        Assertions.assertEquals(dryAppend.capacity, 16 * 2);
    }


    @Test
    void insert() throws ArrayOutException {
        DynArray<Integer> dry = new DynArray<>(Integer.class);
        xDry(dry, 1048);
        Assertions.assertEquals(dry.count, 1048);
        Assertions.assertEquals(dry.capacity, 2048);
        try {
            dry.insert(666, 1096);
            fail("Test insert failed!");
        } catch (ArrayOutException exception) {
            assertEquals(10, exception.getErrorCode());
        }

        Assertions.assertEquals(dry.count, 1048);
        Assertions.assertEquals(dry.capacity, 2048);

        try {
            dry.insert(666, 4000);
            fail("Test insert failed!");
        } catch (ArrayOutException exception) {
            assertEquals(10, exception.getErrorCode());
        }

    }


    @Test
    void remove() throws ArrayOutException {
        DynArray<Integer> dryRemove = new DynArray<>(Integer.class);
        xDry(dryRemove, dryRemove.capacity);
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