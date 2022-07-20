package s3;


public class Task03 {
    public static void main(String[] args) throws ArrayOutException {
        DynArray<Integer> integerDynArray = new DynArray<>(Integer.class);
        System.out.println(integerDynArray + " count = " + integerDynArray.count + " capa = " + integerDynArray.capacity);
        integerDynArray.insert(88, 18);
        System.out.println(integerDynArray + " count = " + integerDynArray.count + " capa = " + integerDynArray.capacity);


    }

}
