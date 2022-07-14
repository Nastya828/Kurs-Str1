package s1;

public class Task1 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        System.out.println("list1 = " + list1 + " length1 = " + list1.count());
        System.out.println("list2 = " + list2 + " length2 = " + list2.count());

        for (int i = 1; i < 16; i++) {
            list1.addInTail(new Node(i));
        }

        for (int i = 1; i < 16; i++) {
            list2.addInTail(new Node(i));
        }
        System.out.println("list1 = " + list1 + " length1 = " + list1.count());
        System.out.println("list2 = " + list2 + " length2 = " + list2.count());

        LinkedList result = SummaLinkedLists.summa(list1, list2);
        System.out.println("list1 = " + list1 + " length1 = " + list1.count());
        System.out.println("list2 = " + list2 + " length2 = " + list2.count());
        System.out.println("result = " + result + " resL = " + result.count());

    }



}

