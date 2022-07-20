package s3;


public class Task03 {
    public static void main(String[] args) {
        DynArray<Integer> integerDynArray = new DynArray<>(Integer.class);
        System.out.println(integerDynArray + " count = " + integerDynArray.count + " capa = " + integerDynArray.capacity);
        for (int i = 0; i < integerDynArray.capacity; i++) {
            integerDynArray.append(i);
        }
        System.out.println(integerDynArray + " count = " + integerDynArray.count + " capa = " + integerDynArray.capacity);
        integerDynArray.append(77);
        System.out.println(integerDynArray + " count = " + integerDynArray.count  + " capa = " + integerDynArray.capacity);
        for (int i = 0; i < 15; i++) {
            integerDynArray.remove(i);
            System.out.println(integerDynArray + " count = " + integerDynArray.count  + " capa = " + integerDynArray.capacity);

        }
        integerDynArray.remove(0);
        System.out.println(integerDynArray + " count = " + integerDynArray.count  + " capa = " + integerDynArray.capacity);

    }

}
