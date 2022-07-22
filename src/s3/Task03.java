package s3;


public class Task03 {
    public static void main(String[] args) throws ArrayOutException {
        DynArray<Integer> integerDynArray = new DynArray<>(Integer.class);
        System.out.println(integerDynArray + " count = " + integerDynArray.count + " capa = " + integerDynArray.capacity);
        for (int i = 0; i < 19; i++) {
            integerDynArray.append(i);
        }
        integerDynArray.remove(0);
        System.out.println(integerDynArray + " count = " + integerDynArray.count + " capa = " + integerDynArray.capacity);
        for (int i = 0; i < 19; i++) {
            integerDynArray.remove(0);
            System.out.println(integerDynArray + " count = " + integerDynArray.count + " capa = " + integerDynArray.capacity);

        }}

}
