package linkedlist;

/**
 * @author Abhijeet Gulve
 */
public class ListListMergeSort {

    private void partition(Node head, Node start, Node midStart) {

        Node slow = null;
        Node fast = null;
        if (head == null || head.next == null) {
            start = head;
            midStart = null;
        } else {
            slow = head;
            fast = head;

            while (fast != null) {
                fast = fast.next;
                if (fast != null) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            start = head;
            midStart = slow.next;
            slow.next = null;
        }
    }

    public Node mergeLists(Node first, Node second) {
        Node dummy = new Node(0, null);
        Node res = dummy;
        while (true) {
            if (first == null) {
                res.next = second;
                break;
            }
            if (second == null) {
                res.next = first;
                break;
            }
            if (first.data <= second.data) {
                res.next = first;
                first = first.next;
            } else {
                res.next = second;
                second = second.next;
            }
            res = res.next;
        }
        return dummy.next;
    }
}
