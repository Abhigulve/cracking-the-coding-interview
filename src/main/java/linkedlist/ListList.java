package linkedlist;

/**
 * @author Abhijeet Gulve
 */
public class ListList {
    private Node head;
    private Node p;

    public static void main(String[] args) {
        ListList listList = new ListList();
        listList.insert(10);
        listList.insert(12);
        listList.insert(15);
        listList.insert(18);
        ListList listList1 = new ListList();
        listList1.insert(1);
        listList1.insert(13);
        listList1.insert(16);
        listList1.insert(17);
        LinkListMergeSort linkListMergeSort = new LinkListMergeSort();
        Node node = linkListMergeSort.mergeLists(listList.head, listList1.head);
        listList.printList(node);
    }

    public static void printList(Node tr) {
        while (tr != null) {
            System.out.print(tr.data + "->");
            tr = tr.next;
        }
    }

    public Node getlinkedList() {
        return head;
    }

    public void insert(int data) {
        if (head == null) {
            head = new Node(data, null);
            p = head;
        } else {
            p.next = new Node(data, null);
            p = p.next;
        }
    }

}
