package s3;


public class Task03 {
    public static void main(String[] args) {
        DynArray<Integer> integerDynArray = new DynArray<>(Integer.class);
        System.out.println(integerDynArray + " count = " + integerDynArray.count + " capa = " + integerDynArray.capacity);
        integerDynArray.insert(88, 99);
        System.out.println(integerDynArray + " count = " + integerDynArray.count + " capa = " + integerDynArray.capacity);
        integerDynArray.remove( 100);
        System.out.println(integerDynArray + " count = " + integerDynArray.count + " capa = " + integerDynArray.capacity);

    }

}
