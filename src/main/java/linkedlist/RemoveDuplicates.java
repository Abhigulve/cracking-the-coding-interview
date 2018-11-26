package linkedlist;

/**
 * @author Abhijeet Gulve
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        //1->1->1->2->2-3
        Node duplicateLinkedList = MockData.getDuplicateLinkedList();
        LinkList.printList(removeDumplicate(duplicateLinkedList));
    }

    /**
     * Here we are assuming list is sorted
     *
     * @param head
     * @return
     */
    public static Node removeDumplicate(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node start = head;
        Node travesalNode = head.next;
        while (true) {
            if (travesalNode.data != start.data) {
                start.next = travesalNode;
                start = travesalNode;
                travesalNode = travesalNode.next;
            }
            if (travesalNode == null) {
                break;
            }
            travesalNode = travesalNode.next;

        }
        return head;
    }

}
