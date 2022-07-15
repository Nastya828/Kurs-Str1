package s1;

public class SummaLinkedLists {

    public static LinkedList summa(LinkedList list1, LinkedList list2) {
        LinkedList result = new LinkedList();
        Node n1 = list1.head;
        Node n2 = list2.head;
        if (list1.count() != list2.count()) {
            return result;
        }
        while (n1 != null) {
            result.addInTail(new Node(n1.value + n2.value));
            n1 = n1.next;
            n2 = n2.next;
        }
        return result;
    }
}
