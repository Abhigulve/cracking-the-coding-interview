package linkedlist;

/**
 * @author Abhijeet Gulve
 */
public class LinkList {
    private Node head;
    private Node p;

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insert(10);
        linkList.insert(12);
        linkList.insert(15);
        linkList.insert(18);
        LinkList linkList1 = new LinkList();
        linkList1.insert(1);
        linkList1.insert(13);
        linkList1.insert(16);
        linkList1.insert(17);
        LinkListMergeSort linkListMergeSort = new LinkListMergeSort();
        Node node = linkListMergeSort.mergeLists(linkList.head, linkList1.head);
        linkList.printList(node);
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
