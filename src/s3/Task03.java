package s3;


public class Task03 {
    public static void main(String[] args) throws ArrayOutException {
        DynArray<Integer> integerDynArray = new DynArray<>(Integer.class);
        for (int i = 0; i < 1047; i++) {
            integerDynArray.insert(i, integerDynArray.count);
        }
        System.out.println(integerDynArray + " count = " + integerDynArray.count + " capa = " + integerDynArray.capacity);
        integerDynArray.insert(666, 1096);
        System.out.println(integerDynArray + " count = " + integerDynArray.count + " capa = " + integerDynArray.capacity);


    }

}
