package s1;

public class Task1 {
    public static void main(String[] args) {
//        LinkedList list1 = new LinkedList();
//        LinkedList list2 = new LinkedList();
//        System.out.println("list1 = " + list1 + " length1 = " + list1.count());
//        System.out.println("list2 = " + list2 + " length2 = " + list2.count());
//
//        for (int i = 1; i < 16; i++) {
//            list1.addInTail(new Node(i));
//        }
//
//        for (int i = 1; i < 16; i++) {
//            list2.addInTail(new Node(i));
//        }
//        System.out.println("list1 = " + list1 + " length1 = " + list1.count());
//        System.out.println("list2 = " + list2 + " length2 = " + list2.count());
//
//        LinkedList result = SummaLinkedLists.summa(list1, list2);
//        System.out.println("list1 = " + list1 + " length1 = " + list1.count());
//        System.out.println("list2 = " + list2 + " length2 = " + list2.count());
//        System.out.println("result = " + result + " resL = " + result.count());

        LinkedList list3 = new LinkedList();
        list3.addInTail(new Node(2));
        list3.addInTail(new Node(92));
        list3.addInTail(new Node(92));
        list3.addInTail(new Node(92));
        list3.addInTail(new Node(66));
        list3.addInTail(new Node(66));
        System.out.println("list3 = " + list3 + " length3 = " + list3.count());
        list3.remove(92);
        list3.removeAll(2);
        System.out.println("list3 = " + list3 + " length3 = " + list3.count());
        list3.removeAll(66);
        System.out.println("list3 = " + list3 + " length3 = " + list3.count());

    }



}

